package com.example.bootweb.com.yk.service;

import com.example.bootweb.com.yk.dao.TestDao;
import com.example.bootweb.com.yk.dao.TestDemoMapper;
import com.example.bootweb.com.yk.entity.TestDemo;
import com.example.bootweb.com.yk.entity.TestDemoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    @Autowired
    private TestDao testDao;
    @Autowired
    TestDemoMapper testDemoMapper;

    public List getJsonResult(){
        List demos = testDao.getJsonResult();
        return demos;
    }

    public List<TestDemo> getJsonResult1(){
        TestDemoExample example = new TestDemoExample();
        return testDemoMapper.selectByExample(example);
    }
}
