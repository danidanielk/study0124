package com.dani4.jwt;

import com.dani4.dto.LoginDto;
import io.jsonwebtoken.Header;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.util.Date;


@Service

public class CreateToken {

    @Value("${secretkey}")
    String secretkey;
    public String makeToken(LoginDto loginDto){

    Date now = new Date();
    return Jwts.builder()
            .setHeaderParam(Header.TYPE,Header.JWT_TYPE)            //헤더타입을 jwt타입으로 설정.
            .setIssuer("dani")                                      //토큰 발급자 설정.
            .setIssuedAt(now)                                       //발급시간 설정 Date 만가능
            .setExpiration(new Date(now.getTime()+ Duration.ofMinutes(30).toMillis())) //만료시간 설정
            .claim("email",loginDto.getEmail())               //비공개 클래임
            .claim("password",loginDto.getPassword())
            .signWith(SignatureAlgorithm.HS256,secretkey)           //해싱 알고리즘,시크릿키 설정
            .compact();
    }


}
