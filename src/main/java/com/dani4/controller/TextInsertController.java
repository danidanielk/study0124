package com.dani4.controller;


import com.dani4.dto.TextInsertDto;
import com.dani4.service.TextInsertService;
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

    private final TextInsertService textInsertService;

    @PostMapping("/v1")
    public ResponseEntity test(@RequestBody TextInsertDto textInsertDto){
    log.info("text={}", textInsertDto.getText());
    textInsertService.textsave(textInsertDto);
        return new ResponseEntity(HttpStatus.OK);
    }

}
