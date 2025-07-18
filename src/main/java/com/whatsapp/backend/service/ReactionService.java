package com.whatsapp.backend.service;

import com.whatsapp.backend.entity.Reaction;
import com.whatsapp.backend.repository.ReactionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ReactionService {
    private final ReactionRepository repository;

    public ReactionService(ReactionRepository repository) {
        this.repository = repository;
    }

    public Reaction react(Reaction reaction) {
        return repository.save(reaction);
    }

    public List<Reaction> getReactions(UUID messageId) {
        return repository.findByMessageId(messageId);
    }
}
