package com.itheima.methoddemo;

public class MethodDemo4 {
    /*
        方法的内存图
     */
    public static void main(String[] args) {
        eat();
    }

    public static void eat() {
        study();
        System.out.println("吃饭");
        sleep();
    }

    public static void study() {
        System.out.println("学习");
    }

    public static void sleep() {
        System.out.println("睡觉");
    }

    /*
        内存图如下：
        1.main方法进栈
        2.eat方法进栈
        3.study方法进栈
        4.控制台打印“学习”，study方法出栈
        5.控制台打印“吃饭”
        6.sleep方法进栈
        7.控制台打印“睡觉”，sleep方法出栈
        8.eat方法出栈
        9.main方法出栈，程序结束
     */
}
