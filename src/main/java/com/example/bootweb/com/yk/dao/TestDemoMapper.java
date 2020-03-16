package com.example.bootweb.com.yk.dao;

import com.example.bootweb.com.yk.entity.TestDemo;
import com.example.bootweb.com.yk.entity.TestDemoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface TestDemoMapper {
    long countByExample(TestDemoExample example);

    int deleteByExample(TestDemoExample example);

    int deleteByPrimaryKey(Integer demoId);

    int insert(TestDemo record);

    int insertSelective(TestDemo record);

    List<TestDemo> selectByExample(TestDemoExample example);

    TestDemo selectByPrimaryKey(Integer demoId);

    int updateByExampleSelective(@Param("record") TestDemo record, @Param("example") TestDemoExample example);

    int updateByExample(@Param("record") TestDemo record, @Param("example") TestDemoExample example);

    int updateByPrimaryKeySelective(TestDemo record);

    int updateByPrimaryKey(TestDemo record);
}