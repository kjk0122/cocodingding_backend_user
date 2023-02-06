package com.sparta.serviceteam4444.user.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class KakaoUserInfoDto {
    private Long id;
    private String nickName;
    private String email;

    public KakaoUserInfoDto(Long id, String nickName, String email) {
        this.id = id;
        this.nickName= nickName;
        this.email = email;
    }
}