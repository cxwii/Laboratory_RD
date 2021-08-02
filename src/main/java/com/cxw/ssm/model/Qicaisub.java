package com.cxw.ssm.model;

public class Qicaisub {

    private int id;
    private int uid;
    private int qid;
    private String subDateTime;
    private String returnDateTime;
    private int subType;
    private int returnType;

    @Override
    public String toString() {
        return "Qicaisub{" +
                "id=" + id +
                ", uid=" + uid +
                ", qid=" + qid +
                ", subDateTime='" + subDateTime + '\'' +
                ", returnDateTime='" + returnDateTime + '\'' +
                ", subType=" + subType +
                ", returnType=" + returnType +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getuid() {
        return uid;
    }

    public void setuid(int uid) {
        this.uid = uid;
    }

    public int getQid() {
        return qid;
    }

    public void setQid(int qid) {
        this.qid = qid;
    }

    public String getSubDateTime() {
        return subDateTime;
    }

    public void setSubDateTime(String subDateTime) {
        this.subDateTime = subDateTime;
    }

    public String getReturnDateTime() {
        return returnDateTime;
    }

    public void setReturnDateTime(String returnDateTime) {
        this.returnDateTime = returnDateTime;
    }

    public int getSubType() {
        return subType;
    }

    public void setSubType(int subType) {
        this.subType = subType;
    }

    public int getReturnType() {
        return returnType;
    }

    public void setReturnType(int returnType) {
        this.returnType = returnType;
    }

    public Qicaisub() {
    }

    public Qicaisub(int id, int uid, int qid, String subDateTime, String returnDateTime, int subType, int returnType) {
        this.id = id;
        this.uid = uid;
        this.qid = qid;
        this.subDateTime = subDateTime;
        this.returnDateTime = returnDateTime;
        this.subType = subType;
        this.returnType = returnType;
    }
}
