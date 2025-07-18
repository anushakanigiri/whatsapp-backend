package com.whatsapp.backend.repository;

import com.whatsapp.backend.entity.Chatroom;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface ChatroomRepository extends JpaRepository<Chatroom, UUID> {
}
