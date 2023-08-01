package com.example.gainsta.presentation.controller;

import com.example.gainsta.domain.service.PostService;
import com.example.gainsta.presentation.dto.RequestDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PostController {
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping("/posts")
    public void createFeed(RequestDTO requestDTO) {
        postService.createPost(requestDTO);
    }
}
