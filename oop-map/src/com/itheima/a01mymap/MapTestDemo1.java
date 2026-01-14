package com.itheima.a01mymap;

import java.util.HashMap;
import java.util.Map;

public class MapTestDemo1 {
    /*
        双列集合Map系列：
        双列集合的顶级接口是Map，他的实现类是HashMap和TreeMap，其中HashMap有一个子类是LinkedHashMap
        语法：Map<泛型1，泛型2> 双列集合名= new 子类();

        双列集合的特点
        1.双列集合是由键和值组成的键值对组成的
        2.键是唯一的，而值可以不唯一
        3.每个键只能找到自己对应的值
        4.键值对的英语是Entry

        常用方法
        put(键，值)：添加/覆盖，有返回值，
                    如果键在双列集合中不存在，那就添加进去，返回值为null
                    如果存在就会覆盖这个键对应的值，并把被覆盖的值返回
        get(键)：获取入参对应的值并返回
        remove(键)：有返回值，移除当前入参的键值对，并把被移除的键值对返回，
                    如果存在则删除当前键值对，返回被删除键值对的值
                    如果不存在则不删除任何东西，返回null
        clear()：清空双列集合的所有元素
        containsKey(键)：返回值为布尔，判断入参的键存在不存在
        containsValue(值)：返回值为布尔，判断入参的值存在不存在
        isEmpty()：返回值为布尔，判断双列集合是否为空
        size()：返回集合的长度（一个键值对为1个单位的长度）
     */

    public static void main(String[] args) {
        Map<String,String>map= new HashMap<>();
        map.put("键1","值1");
        map.put("键2","值2");
        map.put("键3","值3");
        System.out.println(map);
//        System.out.println(map.remove("键1"));
        System.out.println(map.get("键1"));
//        map.clear();
        System.out.println(map);


    }
}
