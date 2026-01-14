package com.itheima.test5;

public class Phone {
    /*
        定义一个数组存储3部手机对象
        对象属性：品牌 价格 颜色
        求三部手机价格的平均值
     */
    //成员变量
    private String pBlandName;
    private int pPrice;
    private String pColor;

    //无参构造
    public Phone() {

    }

    //有参构造
    public Phone(String pBlandName, int pPrice, String pColor) {
        this.pBlandName = pBlandName;
        this.pPrice = pPrice;
        this.pColor = pColor;
    }

    //setter和getter方法
    public String getpBlandName() {
        return pBlandName;
    }

    public void setpBlandName(String pBlandName) {
        this.pBlandName = pBlandName;
    }

    public int getpPrice() {
        return pPrice;
    }

    public void setpPrice(int pPrice) {
        this.pPrice = pPrice;
    }

    public String getpColor() {
        return pColor;
    }

    public void setpColor(String pColor) {
        this.pColor = pColor;
    }
}
