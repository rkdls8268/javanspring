package com.example.gainsta.domain.repository;

import com.example.gainsta.domain.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<PostEntity, Long> {
}
