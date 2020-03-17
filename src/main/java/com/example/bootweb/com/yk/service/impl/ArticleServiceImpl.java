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

    /**
     * 如果这样查询，会把所有数据都先查出来，然后返回条数，
     * 所以可以优化，新增一个查询方法在xml中，查询条数，这样就只返回一个总数
     * @return
     */
    @Override
    public int selectPubCount() {
        ArticleExample example = new ArticleExample();
        ArticleExample.Criteria criteria = example.createCriteria();
        criteria.andPubPrivEqualTo(0);
        return articleMapper.selectByExample(example).size();
    }
}
