package com.cxw.ssm.mapper;

import java.util.List;
import java.util.Map;

/*
* 日记类
* */
public interface SysAccessLogMapper {

    //保存日记
    public int saveSysLog(Map<String,Object> map);

    //查看日记列表
    public List<Map<String,Object>> querySysLogList(Map<String,Object> map);

}
