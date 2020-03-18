package com.example.bootweb.com.yk.service;

import com.example.bootweb.com.yk.entity.Author;
import com.example.bootweb.com.yk.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {
    @Autowired
    AuthorService authorService;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Author author = authorService.selectAuthorByUserName(s);
        if(author == null){
            // 避免返回null，这里返回一个不含有任何信息的User对象
            return new User();
        }
        User user = new User(author.getUsername(), author.getPassword());
        return user;
    }
}
