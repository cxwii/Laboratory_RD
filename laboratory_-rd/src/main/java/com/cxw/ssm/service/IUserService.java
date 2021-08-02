package com.cxw.ssm.service;

import java.util.Map;

public interface IUserService {

    //根据条件查询用户（用以登录,条件是账号和密码）
    int queryUser (Map<String, Object> map);

    //查询用户列表，可用以初始页面展示
    Map<String, Object> queryUserList (Map<String, Object> map);

    //根据username查询用户,精确查询
    Map<String, Object> queryUserListjiqu (Map<String, Object> map);

    //查询用户id来获取uid来判断用户权限
    int queryUserID (Map<String, Object> map);

    //新增用户，添加uid，username，password，uname,id自增
    void addUser (Map<String, Object> map);

    //删除用户，根据username删除
    void delUser (Map<String, Object> map);

    //修改用户，根据username修改
    void updateUser (Map<String, Object> map);

    //修改uid，根据id修改，用来修改权限
    int updateUseruid (Map<String, Object> map);

}
