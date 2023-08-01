package com.example.gainsta.presentation.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import java.util.List;

@Data
@Setter(AccessLevel.NONE) // default: public
public class RequestDTO {
    @Setter // 추후 업데이트 시 필요
    private String post;
    private List<String> images;
    private String place;
    private String with;
}
