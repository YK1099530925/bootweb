package com.example.bootweb.com.yk.controller;

import com.example.bootweb.com.yk.entity.TestDemo;
import com.example.bootweb.com.yk.entity.TestEntity;
import com.example.bootweb.com.yk.entity.vo.SysResultVo;
import com.example.bootweb.com.yk.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("/test")
@Controller
public class TestController {
    @Autowired
    private TestService testService;

    /**
     * 测试跳转页面
     */
    @RequestMapping("/page")
    public String pageTest(){
        return "/page/page-test.html";
    }

    /**
     * 测试数据传输
     */
    @RequestMapping("/get/json")
    @ResponseBody
    public SysResultVo getJsonResult(){
        // SysResultVo 这是一个封装类，用于返回信息
        return SysResultVo.ok(testService.getJsonResult());
    }

    @RequestMapping("/get/json1")
    @ResponseBody
    public SysResultVo getJsonResult1(){
        List<TestDemo> list = testService.getJsonResult1();
        return SysResultVo.ok(list);
    }
}
