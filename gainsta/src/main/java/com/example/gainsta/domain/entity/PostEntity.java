package com.example.gainsta.domain.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "post")
public class PostEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String post;
    public String place;
}
