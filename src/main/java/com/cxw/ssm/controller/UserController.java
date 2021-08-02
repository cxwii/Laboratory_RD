package com.cxw.ssm.controller;

/*
* 用户控制层
* */

import com.cxw.ssm.common.AssembleResponseMsg;
import com.cxw.ssm.model.ResponseBody;
import com.cxw.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    /*
    * 根据条件查询用户（用以登录,条件是账号和密码）
    * */
    @CrossOrigin
    @RequestMapping(value = "/queryUser",produces = "application/json;charset=utf-8")
    public ResponseBody queryUser(@RequestBody Map<String, Object> map){
        int flag = userService.queryUser(map);
        String name = "cxw";
        Map<String,String> all = new HashMap<>();

        if (flag == 1) {
            for (Map.Entry<String,Object> entry:map.entrySet()) {
                System.out.println("key:"+entry.getKey()+"value:"+entry.getValue());

                if (entry.getValue().equals(name)) {
                    all.put("token","admin");
                }else {
                    all.put("token","editor");
                }
            }

            all.put("status","ok");
            return new AssembleResponseMsg().success(all);
        }else {
            return new AssembleResponseMsg().failure(400,"error","用户名或密码错误");
        }

    }

    /*
    * 查询用户列表，可用以初始页面展示
    * 输入pageNum当前页数,pageSize每页展示页数，不输入username全部展示，输入则按username模糊查询展示
    * */
    @CrossOrigin
    @RequestMapping(value = "/queryUserList",produces = "application/json;charset=utf-8")
    public ResponseBody queryUserList(@RequestBody Map<String, Object> map) {
        Map<String, Object> resultMap = userService.queryUserList(map);
        return new AssembleResponseMsg().success(resultMap);
    }

    /*
     * 根据username查询用户,精确查询,这是个烂方法别用太多次
     * */
    @CrossOrigin
    @RequestMapping(value = "/queryUserListjiqu",produces = "application/json;charset=utf-8")
    public ResponseBody queryUserListjiqu(@RequestBody Map<String, Object> map) {
        Map<String, Object> resultMap = userService.queryUserListjiqu(map);
        return new AssembleResponseMsg().success(resultMap);
    }

    /*
    * 查询用户id来获取uid来判断用户权限
    * */
    @CrossOrigin
    @RequestMapping(value = "/queryUserID",produces = "application/json;charset=utf-8")
    public ResponseBody queryUserID(@RequestBody Map<String, Object> map) {
        int resultMap = userService.queryUserID(map);
        return new AssembleResponseMsg().success(resultMap);
    }

    /*
    * 新增用户，添加uid，username，password，uname,id自增
    * */
    @CrossOrigin
    @RequestMapping(value = "/addUser", produces = "application/json;charset=utf-8")
    public ResponseBody addUser(@RequestBody Map<String, Object> map) {
        userService.addUser(map);
        return new AssembleResponseMsg().success("ok");
    }

    /*
     * 删除用户，根据username删除
     * */
    @CrossOrigin
    @RequestMapping(value = "/delUser", produces = "application/json;charset=utf-8")
    public ResponseBody delUser(@RequestBody Map<String, Object> map) {
        userService.delUser(map);
        return new AssembleResponseMsg().success("ok");
    }

    /*
    * 修改用户，根据username修改
    * */
    @CrossOrigin
    @RequestMapping(value = "/updateUser", produces = "application/json;charset=utf-8")
    public ResponseBody updateUser(@RequestBody Map<String, Object> map) {
        userService.updateUser(map);
        return new AssembleResponseMsg().success("ok");
    }

    /*
     * 修改uid，根据id修改，用来修改权限，返回的值为1成功，0失败
     * */
    @CrossOrigin
    @RequestMapping(value = "/updateUseruid", produces = "application/json;charset=utf-8")
    public ResponseBody updateUseruid(@RequestBody Map<String, Object> map) {
        int resultMap = userService.updateUseruid(map);
        System.out.println("输出的值"+resultMap);
        return new AssembleResponseMsg().success(resultMap);
    }

}
