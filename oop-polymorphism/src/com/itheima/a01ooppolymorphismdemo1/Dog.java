package com.itheima.a01ooppolymorphismdemo1;

public class Dog extends Animal{
    String name = "狗";

    @Override
    public void show (){
        System.out.println("狗----show方法");
    }

    public void lookHome(){
        System.out.println("狗在看家");
    }
}
