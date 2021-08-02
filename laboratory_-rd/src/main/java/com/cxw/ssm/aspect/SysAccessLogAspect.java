package com.cxw.ssm.aspect;

import com.cxw.ssm.common.IDUtil;
import com.cxw.ssm.common.StringUtil;
import com.cxw.ssm.controller.SysAccessLogController;
import com.cxw.ssm.service.ISysAccessLogService;
import com.sun.net.httpserver.HttpsServer;
import com.sun.xml.internal.bind.v2.model.core.ID;
import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.xml.crypto.Data;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/*
* 系统访问日记切面类
* */
@Component
public class SysAccessLogAspect {

    @Autowired
    private HttpServletRequest request;

    @Autowired
    private ISysAccessLogService sysAccessLogService;

    //访问时间
    private Date accessDate;
    //日记信息Map
    private Map<String,Object> logMap = new HashMap<>();
    //访问类
    private Class clazz;


    /*
    * 前置通知
    * */
    public void doBefore(JoinPoint jp) {
        clazz = jp.getTarget().getClass();
        if (clazz!= SysAccessLogController.class) {

            //日记ID
            logMap.put("logId", IDUtil.getUUID());

            //请求url
            String url = request.getRequestURI().toString();
            logMap.put("accessInterface",url);

            //请求ip
            String ip = request.getRemoteAddr();
            logMap.put("accessIp",ip);

            //请求方式
            String requestType = request.getMethod();
            logMap.put("requestType",requestType);

            //访问时间
            accessDate = new Date();
            logMap.put("accessDate",accessDate);

            //方法的参数
            String args = Arrays.toString(jp.getArgs());
            logMap.put("interfaceParams",args);

            //访问浏览器信息
            String browserSystemInfo = StringUtil.getBrowserSystemInfo(request);
            logMap.put("accessSource",browserSystemInfo);

        }

    }


    /*
     * 后置通知
     * */
    public void doAfter(JoinPoint jp) {

        if (clazz!=SysAccessLogController.class) {
            long executeTime = new Date().getTime()-accessDate.getTime();

            //执行时长
            logMap.put("executeTime",executeTime);
            sysAccessLogService.saveSysLog(logMap);
        }

    }


}
