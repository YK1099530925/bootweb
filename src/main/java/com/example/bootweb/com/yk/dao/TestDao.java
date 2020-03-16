package com.example.bootweb.com.yk.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TestDao {
    List getJsonResult();
}
