package com.dani4.controller;

import com.dani4.dto.JoinDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class JoinController {

    @PostMapping("/join")
    public ResponseEntity join(@RequestBody JoinDto joinDto){
        log.info(joinDto.toString());
        return new ResponseEntity(HttpStatus.OK);
    }

}
