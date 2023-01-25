package com.dani4.service;


import com.dani4.domain.TextInsert;
import com.dani4.dto.TextInsertDto;
import com.dani4.repository.TextInsertRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class TextInsertService {

    private final TextInsertRepository textInsertRepository;


    public void textsave(TextInsertDto textInsertDto){
        TextInsert textInsert = TextInsert.textTest(textInsertDto);
        textInsertRepository.save(textInsert);


    }





}
