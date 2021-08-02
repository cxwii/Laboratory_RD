package com.cxw.ssm.service;

import java.util.List;
import java.util.Map;

public interface ISysAccessLogService {

    //保存日记
    public int saveSysLog(Map<String,Object> map);

    //查看日记列表
    public Map<String,Object> querySysLogList(Map<String,Object> map);

}
