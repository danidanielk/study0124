package com.dani4.controller;


import com.dani4.dto.TextTestDto;
import com.dani4.service.TextTestService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@AllArgsConstructor

public class TextInsertController {

    private final TextTestService textTestService;

    @PostMapping("/v1")
    public ResponseEntity test(@RequestBody TextTestDto textTestDto){

    textTestService.textsave(textTestDto);
        return new ResponseEntity(HttpStatus.OK);
    }

}
