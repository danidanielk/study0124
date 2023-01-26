package com.dani4.service;


import com.dani4.domain.Join;
import com.dani4.dto.JoinDto;
import com.dani4.repository.JoinRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class JoinService {

    private final JoinRepository joinRepository;

    public boolean join(JoinDto joinDto){
        Join join = Join.join(joinDto);
        List<Join>joins= joinRepository.findById();
        for (int i = 0; i < joins.size(); i++) {
            if(joins.get(i).getEmail().equals(join.getEmail())){
                return false;
            }
        }if(!join.getPassword2().equals(join.getPassword())){
            return false;
        }else{
            joinRepository.save(join);
            return true;
        }
    }
}
