package com.example.bootweb.com.yk.entity.vo;

import java.io.Serializable;

public class SysResultVo implements Serializable {
    /**
     * 状态码
     */
    private int state = 1;//1-OK,0-Error
    /**
     * 状态码对应的消息
     */
    private String message = "OK";

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    /**
     * 分页
     */
    private Integer pageCount = 0;
    /**
     * 要呈现到客户端的数据
     */
    private Object data;
    public SysResultVo() {
    }

    public SysResultVo(String message) {
        this.message = message;
    }

    public SysResultVo(Object data) {
        this.data = data;
    }

    public SysResultVo(Object data, Integer pageCount) {
        this.pageCount = pageCount;
        this.data = data;
    }

    public SysResultVo(Throwable e) {
        this.state = 0;
        this.message = e.getMessage();
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    /**
     * 静态方法，用于返回正确数据
     * @param data
     * @return
     */
    public static SysResultVo ok(Object data){
        return new SysResultVo(data);
    }

    /**
     * 静态方法，用于返回错误信息
     * @param msg
     * @return
     */
    public static SysResultVo fail(String msg){
        SysResultVo result=new SysResultVo();
        result.setState(0);
        result.setMessage(msg);
        return result;
    }
    /**
     * 用于分页返回
     */
    public static SysResultVo pageOk(Object data, Integer pageCount){
        return new SysResultVo(data, pageCount);
    }
}
