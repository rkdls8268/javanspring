package com.example.gainsta.domain.service;

import com.example.gainsta.domain.entity.PostEntity;
import com.example.gainsta.domain.repository.PostRepository;
import com.example.gainsta.presentation.dto.RequestDTO;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {
    private final PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public void createPost(RequestDTO requestDTO) {
        PostEntity postEntity = new PostEntity();
        postEntity.post = requestDTO.getPost();
        postEntity.place = requestDTO.getPlace();
        postRepository.save(postEntity);
    }
}
