package com.cxw.ssm.controller;

import com.cxw.ssm.common.AssembleResponseMsg;
import com.cxw.ssm.model.ResponseBody;
import com.cxw.ssm.service.IQicaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class QicaiController {

    @Autowired
    private IQicaiService qicaiservice;

    /*
     *新增器材
     * */
    @CrossOrigin
    @RequestMapping(value = "/addQicai", produces = "application/json;charset=utf-8")
    public ResponseBody addQicai(@RequestBody Map<String, Object> map) {
        try {
            qicaiservice.addQicai(map);
            return new AssembleResponseMsg().success("ok");
        }catch (Exception e) {
            return new AssembleResponseMsg().failure(200,"error","添加失败");
        }
    }


    /*
     * 更新器材
     * */
    @CrossOrigin
    @RequestMapping(value = "/editQicai", produces = "application/json;charset=utf-8")
    public ResponseBody editQicai(@RequestBody Map<String, Object> map) {
        try {
            qicaiservice.editQicai(map);
            return new AssembleResponseMsg().success("ok");
        }catch (Exception e) {
            return new AssembleResponseMsg().failure(200,"error","编辑失败");
        }
    }


    /*
     * 删除delQicai器材
     * */
    @CrossOrigin
    @RequestMapping(value = "/delQicai", produces = "application/json;charset=utf-8")
    public ResponseBody delQicai(@RequestBody Map<String, Object> map) {
        try {
            qicaiservice.delQicai(map);
            return new AssembleResponseMsg().success("ok");
        }catch (Exception e) {
            return new AssembleResponseMsg().failure(200,"error","删除失败");
        }
    }


    /*
     * 查看器材，用以初始化页面
     * */
    @CrossOrigin
    @RequestMapping(value = "/queryQicaiList", produces = "application/json;charset=utf-8")
    public ResponseBody queryQicaiList(@RequestBody Map<String, Object> map) {
        Map<String, Object> resultMap = qicaiservice.queryQicaiList(map);
        return new AssembleResponseMsg().success(resultMap);
    }

    @CrossOrigin
    @RequestMapping(value = "/qingquchaxun", produces = "application/json;charset=utf-8")
    public ResponseBody qingquchaxun(@RequestBody Map<String, Object> map) {
        Map<String, Object> resultMap = qicaiservice.qingquchaxun(map);
        return new AssembleResponseMsg().success(resultMap);
    }


    /*
     * 借阅器材
     * */
    @CrossOrigin
    @RequestMapping(value = "/addsubQicai", produces = "application/json;charset=utf-8")
    public ResponseBody addsubQicai(@RequestBody Map<String, Object> map) {
        try {
            qicaiservice.addsubQicai(map);
            return new AssembleResponseMsg().success("ok");
        }catch (Exception e) {
            return new AssembleResponseMsg().failure(200,"error","借阅失败");
        }
    }


    /*
     * 归还器材
     * */
    @CrossOrigin
    @RequestMapping(value = "/returnsubQicai", produces = "application/json;charset=utf-8")
    public ResponseBody returnsubQicai(@RequestBody Map<String, Object> map) {
        try {
            qicaiservice.returnsubQicai(map);
            return new AssembleResponseMsg().success("ok");
        }catch (Exception e) {
            return new AssembleResponseMsg().failure(200,"error","归还失败");
        }
    }


    /*
     * 查看借阅器材列表
     * */
    @CrossOrigin
    @RequestMapping(value = "/querySubceshi", produces = "application/json;charset=utf-8")
    public ResponseBody querySubceshi(@RequestBody Map<String, Object> map) {
        Map<String, Object> resultMap = qicaiservice.querySubceshi(map);
        return new AssembleResponseMsg().success(resultMap);
    }


    /*
     * 更新器材库存
     * */
    @CrossOrigin
    @RequestMapping(value = "/updateInventtoriesceshi", produces = "application/json;charset=utf-8")
    public ResponseBody updateInventtoriesceshi(@RequestBody Map<String, Object> map) {
        qicaiservice.updateInventtoriesceshi(map);
        return new AssembleResponseMsg().success("ok");
    }
}
