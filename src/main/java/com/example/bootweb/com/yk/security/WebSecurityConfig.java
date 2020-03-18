package com.example.bootweb.com.yk.security;

import com.alibaba.fastjson.JSONObject;
import com.example.bootweb.com.yk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.util.DigestUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    UserService userService;
    /**
     * 这是用来配置我们的认证方式，在auth.userDetailsService中传入userService，这样userService中的loadUserByUsername方法
     * 在用户登陆时将会被自动调用。后面的PasswordEncoder是可选项，可写可不写，因为我们是将用户的明文密码生成了MD5消息摘要
     * 存入数据库的，因此在登陆的时候也需要对明文进行处理，直接new了一个内部匿名类。
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userService).passwordEncoder(new PasswordEncoder() {
            @Override
            public String encode(CharSequence charSequence) {
                // 对明文进行加密
                return DigestUtils.md5DigestAsHex(charSequence.toString().getBytes());
            }

            @Override
            public boolean matches(CharSequence charSequence, String s) {
                System.out.println(charSequence.length());
                System.out.println(s);
                // 密码比对，charSequence这是明文，s这是密文
                return s.equals(DigestUtils.md5DigestAsHex(charSequence.toString().getBytes()));
            }
        });
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        super.configure(web);
    }

    /**
     * 配置认证规则，authorizeRequests方法表示开启了认证规则配置，
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/css/**","/js/**","/imgs/**","/fonts/**").permitAll()// 不需要验证
                .antMatchers("/home").hasRole("ADMIN") // 需要ADMIN这个权限的才能访问
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/page/login.html")
                .successHandler(new AuthenticationSuccessHandler(){

                    @Override
                    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
                        httpServletResponse.setContentType("application/json;charset=utf-8");
                        PrintWriter writer = httpServletResponse.getWriter();
                        JSONObject jsonObject = new JSONObject();
                        jsonObject.put("code","200");
                        jsonObject.put("msg","ok");
                        String json = jsonObject.toJSONString();
                        writer.write(json);
                        writer.flush();
                        writer.close();
                    }
                }).failureHandler(new AuthenticationFailureHandler() {
            @Override
            public void onAuthenticationFailure(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
                httpServletResponse.setContentType("application/json;charset=utf-8");
                PrintWriter writer = httpServletResponse.getWriter();
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("code","401");
                jsonObject.put("msg","error");
                String json = jsonObject.toJSONString();
                writer.write(json);
                writer.flush();
                writer.close();
            }
        }).loginProcessingUrl("/login")
                .usernameParameter("username")
                .passwordParameter("password")
                .permitAll()
                .and().logout().permitAll().and().csrf().disable();
    }
}
