package com.cxw.ssm.service.impl;

/*
 * 用户业务层实现
 * */

import com.cxw.ssm.mapper.UserMapper;
import com.cxw.ssm.model.User;
import com.cxw.ssm.service.IUserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    /*
    * 根据条件查询用户（用以登录,条件是账号和密码）
    * */
    @Override
    public int queryUser(Map<String, Object> map) {
        return userMapper.queryUser(map);
    }

    /*
    * 查询用户列表，可用以初始页面展示
    * */
    @Override
    public Map<String, Object> queryUserList(Map<String, Object> map) {
        //获取当前页
        int pageNum = Integer.parseInt(map.get("pageNum").toString());
        //每页几条记录
        int pageSize = Integer.parseInt(map.get("pageSize").toString());

        PageHelper.startPage(pageNum,pageSize);
        List<User> userList = userMapper.queryUserList(map);
        PageInfo pageInfo = new PageInfo(userList);

        long total = pageInfo.getTotal();
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("total",total);
        resultMap.put("rows",userList);

        return resultMap;
    }

    /*
     * 根据username查询用户,精确查询
     * */
    @Override
    public Map<String, Object> queryUserListjiqu(Map<String, Object> map) {
        List<User> userList = userMapper.queryUserListjiqu(map);
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("rows",userList);
        return resultMap;
    }

    /*
    * 查询用户id来获取uid来判断用户权限
    * */
    @Override
    public int queryUserID(Map<String, Object> map) {
        return userMapper.queryUserID(map);
    }

    /*
    * 新增用户，添加uid，username，password，uname,id自增
    * */
    @Override
    public void addUser(Map<String, Object> map) {
        userMapper.addUser(map);
    }

    /*
    * 删除用户，根据username删除
    * */
    @Override
    public void delUser(Map<String, Object> map) {
        userMapper.delUser(map);
    }

    /*
    * 修改用户，根据username修改
    * */
    @Override
    public void updateUser(Map<String, Object> map) {
        userMapper.updateUser(map);
    }

    /*
     * 修改uid，根据id修改，用来修改权限
     * */
    @Override
    public int updateUseruid(Map<String, Object> map) {
        return userMapper.updateUseruid(map);
    }

}
