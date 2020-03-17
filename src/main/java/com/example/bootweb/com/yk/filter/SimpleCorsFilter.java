package com.example.bootweb.com.yk.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(urlPatterns = "/*", filterName = "simpleCorsFilter")
public class SimpleCorsFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
        httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");
        httpServletResponse.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        httpServletResponse.setHeader("Access-Control-Max-Age", "3600");
        httpServletResponse.setHeader("Access-Control-Allow-Headers",
                "username, random, x-requested-with,refreshToken,token,isOnline,Content-Type,Content-Disposition");
        httpServletResponse.setHeader("Access-Control-Allow-Credentials", "true");
        // 加上这一句，response中设置的token就能够通过ajax获取到
        httpServletResponse.setHeader("Access-Control-Expose-Headers", "username, random, token,isOnline,Content-Disposition");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
