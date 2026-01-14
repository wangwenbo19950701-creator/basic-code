package com.itheima.record;

public class RecordTestDemo{
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan",1,new String[]{"排球","玩游戏"});
        System.out.println(s1.name());
    }
}
