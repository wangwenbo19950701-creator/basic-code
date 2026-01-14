package com.itheima.a05innerclassdemo5;

public class TestDemo {
    /*
        局部内部类：局部内部类是写在成员方法里面的类，相当于成员方法中的局部变量

        注意：
        1.外部其他类是不能直接使用局部内部类中的成员变量的，如果要用必须要在所在的成员方法中创建局部内部类的对象才能用
        2.局部内部类可以直接访问其外部类的成员，也可以直接访问其所在方法中的局部变量
     */

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.show();
    }
}
