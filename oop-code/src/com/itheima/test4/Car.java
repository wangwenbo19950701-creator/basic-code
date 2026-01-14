package com.itheima.test4;

public class Car {
    /*
        题目：定义一个数组存储3个汽车对象
        对象属性：品牌 价格 颜色
        要求数据通过键盘录入
     */
    //成员变量
    private String cBland;
    private int cPrice;
    private String cColor;

    //无参构造
    public Car(){

    }
    //有参构造

    public Car(String cbland, int cprice, String color) {
        this.cBland = cbland;
        this.cPrice = cprice;
        this.cColor = color;
    }

    //setter和getter


    public String getcBland() {
        return cBland;
    }

    public void setcBland(String cBland) {
        this.cBland = cBland;
    }

    public int getcPrice() {
        return cPrice;
    }

    public void setcPrice(int cPrice) {
        this.cPrice = cPrice;
    }

    public String getcColor() {
        return cColor;
    }

    public void setcColor(String cColor) {
        this.cColor = cColor;
    }
}
