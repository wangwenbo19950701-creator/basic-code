package com.itheima.a03innerclassdemo3;

public class TestDemo {
    public static void main(String[] args) {
        Outer.inner O1= new Outer().new inner();
        O1.show();
    }
}
