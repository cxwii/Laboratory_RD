package com.cxw.ssm.service;

import com.cxw.ssm.model.Qicai;

import java.util.List;
import java.util.Map;

public interface IQicaiService {

    //查看器材，用以初始化页面
    Map<String,Object> queryQicaiList(Map<String,Object> map);

    Map<String,Object> qingquchaxun(Map<String,Object> map);

    //新增器材
    void addQicai(Map<String, Object> map);

    //更新器材
    void editQicai(Map<String, Object> map);

    //删除器材
    void delQicai(Map<String, Object> map);

    // 借阅器材
    void addsubQicai(Map<String, Object> map);

    //归还器材
    void returnsubQicai(Map<String, Object> map);

    //查看借阅器材列表
    Map<String,Object> querySubceshi(Map<String, Object> map);

    //更新器材库存
    void updateInventtoriesceshi(Map<String, Object> map);
}
