package com.cxw.ssm.common;

import java.util.UUID;

/*
* 各种id工具类，现用于日记
* */
public class IDUtil {

    /*
    * 获取uuid，以去掉'-'字符
    * */
    public static String getUUID() {
        return UUID.randomUUID().toString().replace("-","");
    }

}
