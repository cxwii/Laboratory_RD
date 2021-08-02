package com.cxw.ssm.mapper;

import com.cxw.ssm.model.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    // 根据条件查询用户（用以登录,条件是账号和密码）
    int queryUser (Map<String, Object> map);

    //查询用户列表，可用以初始页面展示
    //输入pageNum当前页数,pageSize每页展示页数，不输入username全部展示，输入则按username展示
    List<User> queryUserList (Map<String, Object> map);

    //根据username查询用户,精确查询,用来展示首页了，别问我为什么
    List<User> queryUserListjiqu (Map<String, Object> map);

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
