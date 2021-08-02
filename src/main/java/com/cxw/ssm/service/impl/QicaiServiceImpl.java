package com.cxw.ssm.service.impl;

import com.cxw.ssm.mapper.QicaiMapper;
import com.cxw.ssm.model.Qicai;
import com.cxw.ssm.model.Qicaisub;
import com.cxw.ssm.service.IQicaiService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class QicaiServiceImpl implements IQicaiService {

    @Autowired
    private QicaiMapper qicaimapper;

    /*
     * 新增器材
     * */
    @Override
    public void addQicai(Map<String, Object> map) {
        qicaimapper.addQicai(map);
    }

    /*
     * 更新器材
     * */
    @Override
    public void editQicai(Map<String, Object> map) {
        qicaimapper.editQicai(map);
    }

    /*
     * 删除器材
     * */
    @Override
    public void delQicai(Map<String, Object> map) {
        qicaimapper.delQicai(map);
    }

    /*
     * 查看器材，用以初始化页面
     * */
    @Override
    public Map<String, Object> queryQicaiList(Map<String, Object> map) {

        //获取当前页
        int pageNum = Integer.parseInt(map.get("pageNum").toString());
        //每页几条记录
        int pageSize = Integer.parseInt(map.get("pageSize").toString());

        PageHelper.startPage(pageNum,pageSize);
        List<Qicai> userList = qicaimapper.queryQicaiList(map);
        PageInfo pageInfo = new PageInfo(userList);

        long total = pageInfo.getTotal();
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("total",total);
        resultMap.put("rows",userList);

        return resultMap;
    }

    @Override
    public Map<String, Object> qingquchaxun(Map<String, Object> map) {
        //获取当前页
        int pageNum = Integer.parseInt(map.get("pageNum").toString());
        //每页几条记录
        int pageSize = Integer.parseInt(map.get("pageSize").toString());

        PageHelper.startPage(pageNum,pageSize);
        List<Qicai> userList = qicaimapper.qingquchaxun(map);
        PageInfo pageInfo = new PageInfo(userList);

        long total = pageInfo.getTotal();
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("total",total);
        resultMap.put("rows",userList);

        return resultMap;
    }

    /*
     *借阅器材
     * */
    @Override
    public void addsubQicai(Map<String, Object> map) {
        qicaimapper.addsubQicai(map);
    }

    /*
     * 归还器材
     * */
    @Override
    public void returnsubQicai(Map<String, Object> map) {
        qicaimapper.returnsubQicai(map);
    }

    /*
     * 查看借阅器材列表
     * */
    @Override
    public Map<String, Object> querySubceshi(Map<String, Object> map) {
        
        //获取当前页
        int pageNum = Integer.parseInt(map.get("pageNum").toString());
        //每页几条记录
        int pageSize = Integer.parseInt(map.get("pageSize").toString());

        PageHelper.startPage(pageNum,pageSize);
        List<Qicaisub> bookSubList = qicaimapper.querySubceshi(map);
        PageInfo pageInfo = new PageInfo(bookSubList);

        long total = pageInfo.getTotal();
        Map<String,Object> resultMap = new HashMap<>();
        resultMap.put("total",total);
        resultMap.put("rows",bookSubList);
        return resultMap;
    }

    /*
     * 更新器材库存
     * */
    @Override
    public void updateInventtoriesceshi(Map<String, Object> map) {
        qicaimapper.updateInventtoriesceshi(map);
    }
}
