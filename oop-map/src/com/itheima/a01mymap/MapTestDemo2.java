package com.itheima.a01mymap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTestDemo2 {
    /*
        双列集合的遍历
        思路：先把双列集合的所有的键都取到一个单列集合中(keyset方法)，再利用单列集合的遍历方法，凭键来遍历出值

        1.使用迭代器遍历
        2.使用增强for遍历
        3.lambda表达式遍历
     */

    public static void main(String[] args) {
        Map<String,String> map= new HashMap<>();
        map.put("键1","值1");
        map.put("键2","值2");
        map.put("键3","值3");

        Set<String> stringSet = map.keySet();
//        迭代器遍历
        Iterator iterator = stringSet.iterator();
        while (iterator.hasNext()){
            System.out.println(map.get(iterator.next()));
        }

//        增强for循环遍历
        for (String s : stringSet) {
            System.out.println(map.get(s));
        }


    }
}
