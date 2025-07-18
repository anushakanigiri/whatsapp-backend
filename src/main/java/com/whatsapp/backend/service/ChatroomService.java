package com.whatsapp.backend.service;

import com.whatsapp.backend.entity.Chatroom;
import com.whatsapp.backend.repository.ChatroomRepository;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class ChatroomService {
    private final ChatroomRepository repository;

    public ChatroomService(ChatroomRepository repository) {
        this.repository = repository;
    }

    public Chatroom create(Chatroom chatroom) {
        return repository.save(chatroom);
    }

    public List<Chatroom> getAll() {
        return repository.findAll();
    }

    public Optional<Chatroom> get(UUID id) {
        return repository.findById(id);
    }
}
