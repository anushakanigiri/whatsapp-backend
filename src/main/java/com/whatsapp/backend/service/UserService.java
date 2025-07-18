package com.whatsapp.backend.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.whatsapp.backend.entity.User;
import com.whatsapp.backend.repository.UserRepository;


@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUser(UUID id) {
        return userRepository.findById(id).orElseThrow();
    }

    public User updateUser(UUID id, User updated) {
        User existing = getUser(id);
        existing.setDisplayName(updated.getDisplayName());
        existing.setProfilePicture(updated.getProfilePicture());
        return userRepository.save(existing);
    }
}