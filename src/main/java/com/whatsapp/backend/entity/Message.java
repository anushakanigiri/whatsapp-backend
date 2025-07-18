package com.whatsapp.backend.entity;

import jakarta.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private UUID senderId;

    private UUID chatroomId;

    @Enumerated(EnumType.STRING)
    private MessageType type; // TEXT, IMAGE, VIDEO

    private String content; // message or file path

    private Date createdAt = new Date();

    // Getters & Setters

    public enum MessageType {
        TEXT, IMAGE, VIDEO
    }

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public MessageType getType() {
		return type;
	}

	public void setType(MessageType type) {
		this.type = type;
	}

	public UUID getChatroomId() {
		return chatroomId;
	}

	public void setChatroomId(UUID chatroomId) {
		this.chatroomId = chatroomId;
	}

	public UUID getSenderId() {
		return senderId;
	}

	public void setSenderId(UUID senderId) {
		this.senderId = senderId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	
}
