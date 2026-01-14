package com.itheima.extendpractice;

import java.sql.SQLOutput;

public class LivingCreature {
    //生物类作为父类
    private String name;//成员变量：生物的名字
    private int life;//成员变量：生物的生命值
    private String status;//成员变量：生物的状态

    //构造方法
    public LivingCreature() {

    }

    public LivingCreature(String name, int life, String status) {
        this.name = name;
        this.life = life;
        this.status = status;
    }

    //setter和getter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    //非静态成员方法
    public void move(String name) {
        System.out.println(name + "在移动");
    }

    public static void staticMethod(){
        System.out.println("这是父类的一个静态方法");
    }
}
