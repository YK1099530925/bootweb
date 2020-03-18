package com.example.bootweb.com.yk.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.bootweb.com.yk.entity.Author;
import com.example.bootweb.com.yk.entity.vo.SysResultVo;
import com.example.bootweb.com.yk.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterAndLoginController {

    @Autowired
    AuthorService authorService;

    @RequestMapping("/login")
    public SysResultVo login(@RequestBody String params){
        try {
            JSONObject jsonObject = JSONObject.parseObject(params);
            String username = jsonObject.getString("username");
            String password = jsonObject.getString("password");
            // 去数据库检测

            return SysResultVo.ok(null);
        } catch (Exception e) {
            e.printStackTrace();
            return SysResultVo.fail("失败");
        }
    }

    @RequestMapping("/register")
    public SysResultVo register(@RequestBody String params){
        try {
            JSONObject jsonObject = JSONObject.parseObject(params);
            String username = jsonObject.getString("username");
            String phone = jsonObject.getString("phone");
            String password = jsonObject.getString("password");
            Author author = new Author();
            author.setUsername(username);
            author.setPhone(phone);
            author.setPassword(password);
            authorService.insert(author);
            return SysResultVo.ok(null);
        } catch (Exception e) {
            e.printStackTrace();
            return SysResultVo.fail("失败");
        }
    }
}
