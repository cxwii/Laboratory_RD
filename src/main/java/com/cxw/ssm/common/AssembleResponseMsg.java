package com.cxw.ssm.common;

import com.cxw.ssm.model.InfoMsg;
import com.cxw.ssm.model.ResponseBody;


/*
* 返回类，返回状态正确或错误
* 封装ResponseBoody内容
* */
public class AssembleResponseMsg {
    /*
    * 成功的返回
    * */
    public <T> ResponseBody success(T data) {
        ResponseBody<T> resp = new ResponseBody<T>();
        resp.setData(data);
        InfoMsg info = new InfoMsg();
        resp.setInfo(info);
        return resp;
    }

    /*
    * 失败的返回
    * */
    public <T>ResponseBody failure(int status,String errorCode,String message) {
        ResponseBody<T> resp = new ResponseBody<T>();
        resp.setStatus(status);
        InfoMsg info = new InfoMsg();
        info.setCode(errorCode);
        info.setMessage(message);
        resp.setInfo(info);
        return resp;
    }
}
