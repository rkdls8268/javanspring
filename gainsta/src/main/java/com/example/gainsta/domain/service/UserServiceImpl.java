package com.example.gainsta.domain.service;

import com.example.gainsta.domain.entity.UserEntity;
import com.example.gainsta.domain.repository.UserRepository;
import com.example.gainsta.presentation.dto.RequestUserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public void createUser(RequestUserDTO requestUserDTO) {
        UserEntity user = new UserEntity();
        user.name = requestUserDTO.getName();
        user.email = requestUserDTO.getEmail();
        user.password = requestUserDTO.getPassword();
        user.profile = requestUserDTO.getProfile();
        user.biography = requestUserDTO.getBiography();
        user.intro = requestUserDTO.getIntro();

        userRepository.save(user);
    }
}
