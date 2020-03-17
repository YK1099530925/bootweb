package com.example.bootweb.com.yk.service;

import com.example.bootweb.com.yk.entity.Author;

public interface AuthorService {
    Author selectMaster(int authorType);
}
