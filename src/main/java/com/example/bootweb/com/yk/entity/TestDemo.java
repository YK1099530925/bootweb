package com.example.bootweb.com.yk.entity;

public class TestDemo {
    private Integer demoId;

    private String demoName;

    private String demoDesc;

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
        this.demoName = demoName == null ? null : demoName.trim();
    }

    public String getDemoDesc() {
        return demoDesc;
    }

    public void setDemoDesc(String demoDesc) {
        this.demoDesc = demoDesc == null ? null : demoDesc.trim();
    }
}