package com.whatsapp.backend.repository;

import com.whatsapp.backend.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface MessageRepository extends JpaRepository<Message, UUID> {
    List<Message> findByChatroomId(UUID chatroomId);
}
