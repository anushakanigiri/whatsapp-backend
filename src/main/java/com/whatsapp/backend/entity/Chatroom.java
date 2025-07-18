package com.whatsapp.backend.entity;

import jakarta.persistence.*;
import java.util.*;

@Entity
public class Chatroom {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String name;

    @ElementCollection
    private List<UUID> participantIds;

    private Date createdAt = new Date();

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

    
}
