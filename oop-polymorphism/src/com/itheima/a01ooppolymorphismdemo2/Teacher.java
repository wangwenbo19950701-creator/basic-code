package com.itheima.a01ooppolymorphismdemo2;

public class Teacher extends Person{
    @Override
    public void show(){
        System.out.println("老师的名字是："+getName()+" 年龄是："+getAge());
    }
}
