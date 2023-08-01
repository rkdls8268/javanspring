package com.example.gainsta.domain.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "post")
public class PostEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String post;
    public String place;
    public LocalDateTime createdAt;
    public LocalDateTime updatedAt;
}
