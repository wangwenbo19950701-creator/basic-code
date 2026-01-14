package com.itheima.a01ooppolymorphismdemo3;

public interface Inter {
    //如果接口中的方法名和形参与实现类中的方法名和形参(或者实现类的父类中有同名同参的方法)，
    //即使接口中的方法是default修饰的也必须重写
    default void show(){};
}
