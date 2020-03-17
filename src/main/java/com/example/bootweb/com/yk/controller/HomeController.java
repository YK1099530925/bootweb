package com.example.bootweb.com.yk.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.bootweb.com.yk.entity.Article;
import com.example.bootweb.com.yk.entity.Author;
import com.example.bootweb.com.yk.entity.vo.SysResultVo;
import com.example.bootweb.com.yk.service.ArticleService;
import com.example.bootweb.com.yk.service.AuthorService;
import com.example.bootweb.com.yk.service.CommentRecordService;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/home")
@RestController
public class HomeController {
    @Autowired
    AuthorService authorService;
    @Autowired
    CommentRecordService commentRecordService;
    @Autowired
    ArticleService articleService;

    /**
     * 获取博主信息
     * @return
     */
    @RequestMapping("/blogMasterInfo")
    public SysResultVo blogMasterInfo() {
        Author author = authorService.selectMaster(0);
        return SysResultVo.ok(author);
    }

    /**
     * 分页获取文章信息
     */
    @RequestMapping("/ariticlesInfosByPage")
    public SysResultVo ariticlesInfosByPage(@RequestBody String page){
        JSONObject jsonObject = JSONObject.parseObject(page);
        int pageIndex = jsonObject.getIntValue("pageIndex");
        int pageSize = jsonObject.getIntValue("pageSize");
        List<Article> articles = articleService.selectAllArticleByPage(pageIndex, pageSize);
        // 查询数据库公共的文章条数
        int pubCountAll = articleService.selectPubCount();
        int pubCount = (int) Math.ceil(pubCountAll/(double) pageSize);
        return SysResultVo.pageOk(articles, pubCount);
    }
    public static void main(String args[]){
    }
}
