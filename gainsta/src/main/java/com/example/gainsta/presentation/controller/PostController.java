package com.example.gainsta.presentation.controller;

import com.example.gainsta.domain.service.PostService;
import com.example.gainsta.presentation.dto.RequestPostDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    public void createPost(
        @RequestBody RequestPostDTO requestPostDTO) {
            postService.createPost(requestPostDTO);
    }
}
