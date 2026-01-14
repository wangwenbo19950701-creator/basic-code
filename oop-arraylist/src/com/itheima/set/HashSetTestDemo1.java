package com.itheima.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class HashSetTestDemo1 {
    /*
        Collection接口的另一个分支Set，它是单列无序集合的代表，是一个接口

        Set的实现类有两个：HashSet和TreeSet
        HashSet有个子类是LinkedHashSet

        单列无序集合的实现类特点：
        HashSet：存取不一定输出一致，无索引，数据不可重复
        LinkedHashSet：有序，无索引，数据不可重复
        TreeSet：可排序，无索引，数据不可重复

        常用方法与单列集合一样
        遍历方法有三种：增强for循环，迭代器遍历，lambda表达式

     */

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        if (set.add(2)) {
            //注意Set系列的集合是需要处理add返回值的
        } else {
            System.out.println("添加的数据重复了");
        }
        set.add(3);

        //增强for循环遍历
//        for (Integer integer : set) {
//            System.out.println(integer);
//        }

        //迭代器遍历
//        Iterator<Integer>iterator = set.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        //lambda表达式遍历(匿名内部类)
//        set.forEach(new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                System.out.println(integer);
//            }
//        });

        //lambda表达式遍历(真正的表达式)
        //lambda表达式的宗旨是只在乎要做什么事，而不在乎谁去做
        set.forEach(integer ->
                System.out.println(integer)
        );
    }
}
