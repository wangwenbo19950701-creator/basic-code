package com.itheima.practice1;

import java.util.*;

/*
    创建一个hashmap集合，键是学生对象，值是籍贯
    存储三个键值对元素，并遍历
    要求：同姓名同年龄认为是同一个人
 */
public class TestDemo1 {
    public static void main(String[] args) {
        //创建一个hashMap集合
        HashMap<Student,String> map = new HashMap<>();
        //创建三个学生对象
        Student s1 = new Student("zhangsan",18);
        Student s2 = new Student("lisi",18);
        Student s3 = new Student("wangwu",18);
        //添加元素
        map.put(s1,"沈阳");
        map.put(s2,"大连");
        map.put(s3,"宁波");

        //遍历：首先要取出hashMap集合的键
        //------------------复习：set系列集合的元素存取无序，无索引，不可重复---------------------------
        Set<Student> Set = map.keySet();//返回一个set集合，内容是所有的键
        //使用迭代器进行遍历
//        Iterator<Student> iterator = Set.iterator();
//        while (iterator.hasNext()){
//            Student temp = iterator.next();
//            System.out.println(temp.toString() +"籍贯："+ map.get(temp));
//
//        }
        //使用增强for进行遍历
        for (Student s:Set){
            System.out.println(s.toString() +"籍贯："+ map.get(s));
        };
    }
}
