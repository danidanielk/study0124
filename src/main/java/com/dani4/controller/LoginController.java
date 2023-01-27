package com.dani4.controller;

import com.dani4.dto.LoginDto;
import com.dani4.jwt.CreateToken;
import com.dani4.service.LoginService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@AllArgsConstructor
public class LoginController {

    private final LoginService loginService;
    private final CreateToken createToken;
    @PostMapping("/login")
    public ResponseEntity login(@RequestBody LoginDto loginDto) {
        log.info("email={} , password={}",loginDto.getEmail(),loginDto.getPassword());
        String token = createToken.makeToken(loginDto);
        if(loginService.login(loginDto)==true){
            return new ResponseEntity(token,HttpStatus.OK);
        }else {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        }
    }
}
