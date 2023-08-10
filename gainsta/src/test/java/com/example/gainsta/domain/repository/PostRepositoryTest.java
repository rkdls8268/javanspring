package com.example.gainsta.domain.repository;

import com.example.gainsta.domain.entity.PostEntity;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PostRepositoryTest {

    @Autowired
    public PostRepository postRepository;
    @Test
    @DisplayName("포스트를 생성할 때 생성일자가 올바르게 나온다.")
    // 테스트메소드명: 테스트 대상, 어떤 상황인지, 예상되는 결과 포함
    void createPost() {
        // id, post, place
        PostEntity post = new PostEntity();
        post.post = "post";
        post.place = "우리집";
        Long postId = postRepository.save(post).id;
        PostEntity createdPost = postRepository.findById(postId).orElseThrow();
        System.out.println(createdPost.getCreatedAt());
    }
}