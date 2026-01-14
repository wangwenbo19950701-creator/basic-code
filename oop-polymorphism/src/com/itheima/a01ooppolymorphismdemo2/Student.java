package com.itheima.a01ooppolymorphismdemo2;

public class Student extends Person{
    @Override
    public void show(){
        System.out.println("学生的名字是："+getName()+" 年龄是："+getAge());
    }
}
