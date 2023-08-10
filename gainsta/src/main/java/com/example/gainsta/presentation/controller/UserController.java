package com.example.gainsta.presentation.controller;

import com.example.gainsta.domain.service.UserService;
import com.example.gainsta.presentation.dto.RequestUserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    public UserService userService;

    @PostMapping("/users")
    public void createUser(
        @RequestBody RequestUserDTO requestUserDTO) {
            userService.createUser(requestUserDTO);
    }
}
