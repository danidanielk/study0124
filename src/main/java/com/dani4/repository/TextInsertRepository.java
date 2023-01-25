package com.dani4.repository;

import com.dani4.domain.TextInsert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TextInsertRepository {

    public void save(TextInsert textInsert);


}
