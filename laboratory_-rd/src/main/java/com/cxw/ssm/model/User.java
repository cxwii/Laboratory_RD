package com.cxw.ssm.model;
/*
* 用户实体类
* */
import java.io.Serializable;

public class User implements Serializable {

    private int id;
    private String uid;
    private String username;
    private String password;
    private String uname;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", uid='" + uid + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", uname='" + uname + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public User() {
    }

    public User(int id, String uid, String username, String password, String uname) {
        this.id = id;
        this.uid = uid;
        this.username = username;
        this.password = password;
        this.uname = uname;
    }
}
