package com.itheima.a02oopextendsdemo2;

public class ChineseStudent extends Person {
    //中国学生继承Person父类
    @Override
    public void eat(){
        System.out.println("吃"+super.food);
    }
}
