package com.cxw.ssm.model;

public class Qicai {

    private int qid;
    private String qicainame;
    private String department;
    private int inventory;
    private double price;

    @Override
    public String toString() {
        return "Qicai{" +
                "qid=" + qid +
                ", qicainame='" + qicainame + '\'' +
                ", department='" + department + '\'' +
                ", inventory=" + inventory +
                ", price=" + price +
                '}';
    }

    public int getQid() {
        return qid;
    }

    public void setQid(int qid) {
        this.qid = qid;
    }

    public String getQicainame() {
        return qicainame;
    }

    public void setQicainame(String qicainame) {
        this.qicainame = qicainame;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Qicai() {
    }

    public Qicai(int qid, String qicainame, String department, int inventory, double price) {
        this.qid = qid;
        this.qicainame = qicainame;
        this.department = department;
        this.inventory = inventory;
        this.price = price;
    }
}
