package com.cxw.ssm.model;

import com.cxw.ssm.common.DateUtil;

/*
* 封装响应的数据结构
* */
public class ResponseBody<T> {
    private String date = DateUtil.getCurrentDateStr("yyyy-mm-dd HH:mm:ss");
    private  int status = 200;
    private  T data;

    //消息体内容
    private InfoMsg info;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public InfoMsg getInfo() {
        return info;
    }

    public void setInfo(InfoMsg info) {
        this.info = info;
    }
}
