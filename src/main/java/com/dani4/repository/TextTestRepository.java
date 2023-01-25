package com.dani4.repository;

import com.dani4.domain.TextTest;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TextTestRepository {

    public void save(TextTest textTest);
}
