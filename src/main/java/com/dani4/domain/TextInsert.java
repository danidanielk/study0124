package com.dani4.domain;

import com.dani4.dto.TextInsertDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class TextInsert {

    private Long id;
    private String text;

    public static TextInsert textTest(TextInsertDto textInsertDto){
        return new TextInsert(null, textInsertDto.getText());
    }
}
