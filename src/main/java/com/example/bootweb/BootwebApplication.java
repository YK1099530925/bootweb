package com.example.bootweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * @MapperScan 功能相当于配置文件中的包扫描，用于标注mapper或者dao接口的包路径，可以配置多个，使用逗号隔开
 * 也可以不使用这个注解，但需要在dao接口上添加一个 @Mapper 注解，这里是为了省事
 * 出现的问题：没有将com.example.bootweb这个带上，导致没有扫描到对应的包
 */
@MapperScan("com.example.bootweb.com.yk.dao")
@SpringBootApplication
public class BootwebApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootwebApplication.class, args);
    }

}
