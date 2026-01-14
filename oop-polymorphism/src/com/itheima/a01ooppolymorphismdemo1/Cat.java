package com.itheima.a01ooppolymorphismdemo1;

public class Cat extends Animal{
    String name = "猫";

    @Override
    public void show (){
        System.out.println("猫----show方法");
    }

    public void eat(){
        System.out.println("吃小鱼干");
    }
}
