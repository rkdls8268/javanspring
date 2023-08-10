package com.example.gainsta.domain.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class UserEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String name;
    public String email;
    public String password;
    public String profile;
    public String biography;
    public String intro;
}
