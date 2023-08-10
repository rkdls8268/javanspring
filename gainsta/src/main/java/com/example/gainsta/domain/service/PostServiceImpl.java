package com.example.gainsta.domain.service;

import com.example.gainsta.domain.entity.PostEntity;
import com.example.gainsta.domain.repository.PostRepository;
import com.example.gainsta.presentation.dto.RequestPostDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostRepository postRepository;

    @Override
    public void createPost(RequestPostDTO requestPostDTO) {
        PostEntity postEntity = new PostEntity();
        postEntity.post = requestPostDTO.getPost();
        postEntity.place = requestPostDTO.getPlace();
        postRepository.save(postEntity);
    }
}
