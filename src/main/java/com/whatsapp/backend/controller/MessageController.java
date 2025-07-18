package com.whatsapp.backend.controller;

import com.whatsapp.backend.entity.Message;
import com.whatsapp.backend.service.MessageService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/messages")
public class MessageController {

    private final MessageService service;

    public MessageController(MessageService service) {
        this.service = service;
    }

    @PostMapping("/text")
    public Message sendTextMessage(@RequestBody Message message) {
        return service.sendMessage(message);
    }

    @PostMapping("/attachment")
    public Message sendAttachment(@RequestParam UUID senderId,
                                  @RequestParam UUID chatroomId,
                                  @RequestParam MultipartFile file) throws IOException {

        String type = file.getContentType();
        String folder = type != null && type.startsWith("video") ? "root/video/" : "root/picture/";
        new File(folder).mkdirs(); // create if not exists

        String path = folder + UUID.randomUUID() + "_" + file.getOriginalFilename();
        file.transferTo(new File(path));

        Message message = new Message();
        message.setSenderId(senderId);
        message.setChatroomId(chatroomId);
        message.setContent(path);
        message.setType(type != null && type.startsWith("video") ? Message.MessageType.VIDEO : Message.MessageType.IMAGE);

        return service.sendMessage(message);
    }

    @GetMapping("/{chatroomId}")
    public List<Message> getMessages(@PathVariable UUID chatroomId) {
        return service.getMessages(chatroomId);
    }
}
