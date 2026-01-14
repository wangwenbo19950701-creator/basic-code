package com.itheima.test;

public class PhoneTest {
    public static void main(String[] args) {
        //创建一个手机的实例
        Phone p = new Phone();
        //赋予手机的名称
        p.setPhoneName("小米");
        //打印手机的名称
        System.out.println(p.getPhoneName());

        p.setPhonePrice(1998);
        System.out.println(p.getPhonePrice()+"元");

        p.playGame();
        p.call();
    }
}
