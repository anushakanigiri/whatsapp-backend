package com.whatsapp.backend.repository;

import com.whatsapp.backend.entity.Reaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ReactionRepository extends JpaRepository<Reaction, UUID> {
    List<Reaction> findByMessageId(UUID messageId);
}
