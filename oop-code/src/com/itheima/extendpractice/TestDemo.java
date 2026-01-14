package com.itheima.extendpractice;

public class TestDemo {
    public static void main(String[] args) {
        Character c1= new Character();
        c1.setName("hero");
        c1.useSkill(c1.getName());
        c1.move(c1.getName());
        c1.staticMethod();
    }
}
