package com.whatsapp.backend.controller;

import com.whatsapp.backend.entity.Chatroom;
import com.whatsapp.backend.service.ChatroomService;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/chatrooms")
public class ChatroomController {
    private final ChatroomService service;

    public ChatroomController(ChatroomService service) {
        this.service = service;
    }

    @PostMapping
    public Chatroom createChatroom(@RequestBody Chatroom chatroom) {
        return service.create(chatroom);
    }

    @GetMapping
    public List<Chatroom> getAllChatrooms() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Chatroom getChatroom(@PathVariable UUID id) {
        return service.get(id).orElseThrow();
    }
}
