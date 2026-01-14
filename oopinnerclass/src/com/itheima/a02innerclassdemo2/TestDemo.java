package com.itheima.a02innerclassdemo2;

public class TestDemo {
    /*
        成员内部类：写在方法外，类之中的类
        内部类可以用权限修饰符和static和final关键字修饰，和成员变量一样时外部类的一部分

        如何获取内部类的对象
        ①外部类编写方法，对外提供内部类的对象,写一个get方法来返回这个内部类对象
        ②直接用外部类类名.内部类类名.对象名=new 外部类类名().new 内部类类名();创建


     */
    public static void main(String[] args) {
//        Outer.Inner oI=new Outer().new Inner();
        Outer o = new Outer();
        //有两种方法可以使用这个变量，用Object运用多态的技术来接收这个inner的对象,和直接sout输出这个对象地址值这两种方法
//        Object inner =o.getInstance();
//        System.out.println(o.getInstance());

    }
}
