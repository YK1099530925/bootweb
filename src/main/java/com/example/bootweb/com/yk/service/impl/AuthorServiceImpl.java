package com.example.bootweb.com.yk.service.impl;

import com.example.bootweb.com.yk.dao.AuthorMapper;
import com.example.bootweb.com.yk.entity.Author;
import com.example.bootweb.com.yk.entity.AuthorExample;
import com.example.bootweb.com.yk.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {
    @Autowired
    AuthorMapper authorMapper;

    @Override
    public Author selectMaster(int authorType) {
        AuthorExample example = new AuthorExample();
        AuthorExample.Criteria criteria = example.createCriteria();
        criteria.andAuthorTypeEqualTo(authorType);
        return authorMapper.selectByExample(example).get(0);
    }

    @Override
    public void insert(Author author) {
        authorMapper.insert(author);
    }

    @Override
    public Author selectAuthorByUserName(String username) {
        AuthorExample example = new AuthorExample();
        AuthorExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(username);
        List<Author> authors = authorMapper.selectByExample(example);
        if(!authors.isEmpty()){
            return authors.get(0);
        }
        return null;
    }
}
