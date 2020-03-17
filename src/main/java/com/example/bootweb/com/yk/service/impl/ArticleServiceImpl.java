package com.example.bootweb.com.yk.service.impl;

import com.example.bootweb.com.yk.dao.ArticleMapper;
import com.example.bootweb.com.yk.entity.Article;
import com.example.bootweb.com.yk.entity.ArticleExample;
import com.example.bootweb.com.yk.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    ArticleMapper articleMapper;
    @Override
    public List<Article> selectAllArticleByPage(int pageIndex, int pageSize) {
        ArticleExample example = new ArticleExample();
        ArticleExample.Criteria criteria = example.createCriteria();
        criteria.andPubPrivEqualTo(0);
        example.setPageIndex((pageIndex - 1) * pageSize);
        example.setPageSize(pageSize);
        return articleMapper.selectByExample(example);
    }
}
