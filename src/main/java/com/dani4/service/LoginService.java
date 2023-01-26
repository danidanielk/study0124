package com.dani4.service;


import com.dani4.domain.Join;
import com.dani4.domain.Login;
import com.dani4.dto.LoginDto;
import com.dani4.repository.JoinRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Slf4j
@Service
public class LoginService {

    private final JoinRepository joinRepository;

    public boolean login(LoginDto loginDto){
        Login login = Login.login(loginDto);
        String id = login.getEmail();
        String pw = login.getPassword();
        List<Join> byId = joinRepository.findById();
        for (int i = 0; i < byId.size(); i++) {
            if(byId.get(i).getEmail().equals(id) && byId.get(i).getPassword().equals(pw)){
                return true;
            }
        }return false;

    }

}
