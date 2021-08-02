package com.cxw.ssm.service.impl;

import com.cxw.ssm.mapper.SysAccessLogMapper;
import com.cxw.ssm.service.ISysAccessLogService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SysAccessLogServiceImpl implements ISysAccessLogService {

    @Autowired
    private SysAccessLogMapper sysAccessLogMapper;

    /*
    * 保存日记
    * */
    @Override
    public int saveSysLog(Map<String, Object> map) {
        return sysAccessLogMapper.saveSysLog(map);
    }

    /*
     * 查看日记列表
     * */
    @Override
    public Map<String, Object> querySysLogList(Map<String, Object> map) {

        //当前页数
        int pageNum = Integer.parseInt(map.get("pageNum").toString());
        //每页几条
        int pageSize = Integer.parseInt(map.get("pageSize").toString());
        PageHelper.startPage(pageNum,pageSize);

        List<Map<String,Object>> resultList = sysAccessLogMapper.querySysLogList(map);
        PageInfo pageInfo = new PageInfo(resultList);
        //总条数
        long total = pageInfo.getTotal();
        Map<String,Object> resultMap = new HashMap<>();
        resultMap.put("total",total);
        resultMap.put("rows",resultList);

        return resultMap;
    }

}
