package com.dani4.domain;

import com.dani4.dto.JoinDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Join {

    private Long id;
    private String name;
    private String email;
    private String phone;
    private String password;
    private String password2;

    public static Join join(JoinDto joinDto){
        return new Join(null, joinDto.getName(), joinDto.getEmail(), joinDto.getPhone(), joinDto.getPassword(), joinDto.getPassword2());
    }
}
