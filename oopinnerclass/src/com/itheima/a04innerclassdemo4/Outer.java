package com.itheima.a04innerclassdemo4;

public class Outer {
    int a=10;
    static int b = 20;

    static class Inner{

        public static void show(){
            System.out.println("内部类的show方法");
            //静态内部类只能直接访问外部类的静态成员变量,访问非静态的成员变量要先创建外部类的对象
            //System.out.println(a);//报错
            Outer o= new Outer();
            System.out.println(o.a+"内部类调用外部类的非静态成员变量");
            System.out.println(b+"内部类调用外部类的静态成员变量");

        }
    }

    public void show(){
        System.out.println("外部类的show方法");
    }
}
