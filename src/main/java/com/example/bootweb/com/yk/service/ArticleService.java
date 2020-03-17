package com.example.bootweb.com.yk.service;

import com.example.bootweb.com.yk.entity.Article;

import java.util.List;

public interface ArticleService {
    List<Article> selectAllArticleByPage(int pageIndex, int pageSize);
}
