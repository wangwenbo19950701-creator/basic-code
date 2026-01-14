package com.itheima.a01ooppolymorphismdemo3;

public class B extends A implements Inter{
    String name = "B";
    @Override
    public void show(){
        System.out.println("B的show方法");
    }
}
