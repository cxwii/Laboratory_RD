package com.cxw.ssm.mapper;

import com.cxw.ssm.model.Qicai;
import com.cxw.ssm.model.Qicaisub;

import java.util.List;
import java.util.Map;

public interface QicaiMapper {

    //查看器材，用以初始化页面
    List<Qicai> queryQicaiList(Map<String,Object> map);

    List<Qicai> qingquchaxun(Map<String,Object> map);

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
    List<Qicaisub> querySubceshi(Map<String, Object> map);

    //更新器材库存
    void updateInventtoriesceshi(Map<String, Object> map);
}
