package com.whatsapp.backend.service;

import com.whatsapp.backend.entity.Message;
import com.whatsapp.backend.repository.MessageRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class MessageService {
    private final MessageRepository repository;

    public MessageService(MessageRepository repository) {
        this.repository = repository;
    }

    public Message sendMessage(Message message) {
        return repository.save(message);
    }

    public List<Message> getMessages(UUID chatroomId) {
        return repository.findByChatroomId(chatroomId);
    }
}
