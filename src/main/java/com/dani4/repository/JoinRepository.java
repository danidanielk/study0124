package com.dani4.repository;

import com.dani4.domain.Join;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface JoinRepository {
    public void save(Join join);
    public List<Join> findById();
}
