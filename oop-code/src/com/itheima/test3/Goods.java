package com.itheima.test3;

public class Goods {
    /*
        题目：
        创建一个数组存储三个商品对象
        对象的属性：id 名字 价格 库存
        创建三个商品对象，把他们存到数组中
     */

    //成员变量
    private int GId;//商品ID
    private String GName;//商品名称
    private double GValue;//商品价格
    private int GRemainAmount;//商品库存

    //无参构造
    public Goods() {

    }

    //有参构造
    public Goods(int GId, String GName, double GValue, int GRemainAmount) {
        this.GId = GId;
        this.GName = GName;
        this.GValue = GValue;
        this.GRemainAmount = GRemainAmount;
    }


    //setter和getter

    public int getGId() {
        return GId;
    }

    public void setGId(int GId) {
        this.GId = GId;
    }

    public String getGName() {
        return GName;
    }

    public void setGName(String GName) {
        this.GName = GName;
    }

    public double getGValue() {
        return GValue;
    }

    public void setGValue(double GValue) {
        this.GValue = GValue;
    }

    public int getGRemainAmount() {
        return GRemainAmount;
    }

    public void setGRemainAmount(int GRemainAmount) {
        this.GRemainAmount = GRemainAmount;
    }
}
