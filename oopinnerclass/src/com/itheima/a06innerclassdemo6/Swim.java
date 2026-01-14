package com.itheima.a06innerclassdemo6;

public interface Swim {

    default void swim(){
        System.out.println("游泳");
    };
}
