package com.cxw.ssm.controller;

import com.cxw.ssm.common.AssembleResponseMsg;
import com.cxw.ssm.model.ResponseBody;
import com.cxw.ssm.service.ISysAccessLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class SysAccessLogController {

    @Autowired
    private ISysAccessLogService sysAccessLogService;

    /*
     * 查看日记列表
     * */
    @CrossOrigin
    @RequestMapping(value = "/querySysLogList", produces = "application/json;charset=utf-8")
    public ResponseBody querySysLogList(@RequestBody Map<String, Object> map) {
        Map<String,Object> resultMap = sysAccessLogService.querySysLogList(map);
        return new AssembleResponseMsg().success(resultMap);
    }

}
