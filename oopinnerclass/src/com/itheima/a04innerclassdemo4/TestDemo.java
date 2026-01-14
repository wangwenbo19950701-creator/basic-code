package com.itheima.a04innerclassdemo4;

public class TestDemo {
    /*
        静态内部类：静态内部类是一种特殊的成员内部类，在class关键字前面加上static

        直接创建静态内部类的语法：  外部类类名.内部类类名 内部类对象名=new 外部类类名.内部类类名();

        注意：
        1.静态内部类只能直接访问外部类的静态成员变量，如果像访问非静态的成员变量需要先在内部类中创建外部类的对象
        2.静态内部类的方法是可以直接 外部类类名.内部类类名.方法名（） 这种方法调用的，一般推荐这么调用
            使用外部类的对象进行调用也可以，但是idea不会有自动提示，不推荐这么调用

     */
    public static void main(String[] args) {
        //创建一个内部类的对象
        Outer.Inner OI = new Outer.Inner();
        //调用内部类的show方法
        Outer.Inner.show();
        //调用外部类的show方法
        Outer O = new Outer();
        O.show();
    }
}
