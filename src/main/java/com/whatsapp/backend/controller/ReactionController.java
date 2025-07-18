package com.whatsapp.backend.controller;

import com.whatsapp.backend.entity.Reaction;
import com.whatsapp.backend.service.ReactionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/reactions")
public class ReactionController {

    private final ReactionService service;

    public ReactionController(ReactionService service) {
        this.service = service;
    }

    @PostMapping
    public Reaction addReaction(@RequestBody Reaction reaction) {
        return service.react(reaction);
    }

    @GetMapping("/{messageId}")
    public List<Reaction> getReactions(@PathVariable UUID messageId) {
        return service.getReactions(messageId);
    }
}
