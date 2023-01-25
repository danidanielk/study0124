package com.dani4.service;


import com.dani4.domain.TextTest;
import com.dani4.dto.TextTestDto;
import com.dani4.repository.TextTestRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class TextTestService {

    private final TextTestRepository textTestRepository;


    public void textsave(TextTestDto textTestDto){
        TextTest textTest = TextTest.textTest(textTestDto);
        textTestRepository.save(textTest);


    }





}
