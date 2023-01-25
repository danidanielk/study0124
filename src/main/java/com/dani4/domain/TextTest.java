package com.dani4.domain;

import com.dani4.dto.TextTestDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.w3c.dom.Text;

@Getter
@Setter
@AllArgsConstructor
public class TextTest {

    private Long id;
    private String text;

    public static TextTest textTest(TextTestDto textTestDto){
        return new TextTest(null, textTestDto.getText());
    }
}
