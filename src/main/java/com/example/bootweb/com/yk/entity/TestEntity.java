package com.example.bootweb.com.yk.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

// @Data 和 @Accessors(chain = true) 还是不要用了
//@Data // 省略无参构造、get、set方法
//@Accessors(chain = true) // 链式结构
public class TestEntity implements Serializable {
    public Integer getDemoId() {
        return demoId;
    }

    public void setDemoId(Integer demoId) {
        this.demoId = demoId;
    }

    public String getDemoName() {
        return demoName;
    }

    public void setDemoName(String demoName) {
        this.demoName = demoName;
    }

    public String getDemoDesc() {
        return demoDesc;
    }

    public void setDemoDesc(String demoDesc) {
        this.demoDesc = demoDesc;
    }

    private Integer demoId;
    private String demoName;
    private String demoDesc;
}
