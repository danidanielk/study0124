package com.dani4.controller;

import com.dani4.dto.JoinDto;
import com.dani4.jwt.CreateToken;
import com.dani4.service.JoinService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.PrivateKey;

@RestController
@Slf4j
@AllArgsConstructor
public class JoinController {

    private final JoinService joinService;

    @PostMapping("/join")
    public ResponseEntity join(@RequestBody JoinDto joinDto){
        log.info(joinDto.toString());

        if(joinService.join(joinDto)==false){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }else{
            return new ResponseEntity(HttpStatus.OK);
        }
         }
        }



