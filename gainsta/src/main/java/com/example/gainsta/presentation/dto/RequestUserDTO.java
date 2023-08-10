package com.example.gainsta.presentation.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Data
@Setter(AccessLevel.NONE)
public class RequestUserDTO {
    private String name;
    private String email;
    private String password;
    private String profile;
    private String biography;
    private String intro;
}
