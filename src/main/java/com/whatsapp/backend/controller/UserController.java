package com.whatsapp.backend.controller;


import org.springframework.web.bind.annotation.*;
//import io.swagger.v3.oas.annotations.Operation;

import com.whatsapp.backend.entity.User;
import com.whatsapp.backend.service.UserService;

import java.util.UUID;

@RestController
@RequestMapping("/api/profile")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public User getProfile(@PathVariable UUID id) {
        return userService.getUser(id);
    }

    @PutMapping("/{id}")
    public User updateProfile(@PathVariable UUID id, @RequestBody User user) {
        return userService.updateUser(id, user);
    }
}