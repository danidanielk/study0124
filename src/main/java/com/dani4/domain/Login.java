package com.dani4.domain;

import com.dani4.dto.LoginDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Service
@Builder
public class Login {

    private String email;
    private String password;


    public static Login login (LoginDto loginDto){
        return new Login(loginDto.getEmail(), loginDto.getPassword());
    }

}
