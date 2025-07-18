package com.whatsapp.backend.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class Reaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public UUID getUserId() {
		return userId;
	}

	public void setUserId(UUID userId) {
		this.userId = userId;
	}

	public UUID getMessageId() {
		return messageId;
	}

	public void setMessageId(UUID messageId) {
		this.messageId = messageId;
	}

	public EmojiType getEmoji() {
		return emoji;
	}

	public void setEmoji(EmojiType emoji) {
		this.emoji = emoji;
	}

	private UUID userId;

    private UUID messageId;

    @Enumerated(EnumType.STRING)
    private EmojiType emoji;

    public enum EmojiType {
        thumbup, love, crying, suprised
    }

    // Getters & Setters
}
