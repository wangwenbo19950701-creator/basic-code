package com.itheima.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListTestDemo1 {
    /*
    Java的集合分为很多种，Collection是最上级的集合，
    单列有序集合List继承了Collection，而ArrayList继承了List，是单列有序集合的代表，也是最常用的
    List系列集合的特点：存取有序，有索引，元素可以重复
        ArrayList集合：集合跟数组很像，也是用来存储数据的容器
        特点：1.集合可以自增
              2.集合只能存储引用数据类型，如果想存储基本数据类型就必须要用其‘包装类’
              3.可以直接打印集合对象，打印出的东西会用[]包裹
              4.集合不像数组，就算指定长度，只要不传值，长度永远都是0，集合也不会自己初始化值（null也算元素值）
        语法：ArrayList<泛型> arrayList = new ArrayList<>();

        常用方法
        add(元素值)：添加元素
        add(索引值，元素值)：指定索引添加元素，如果指定索引位置原本就有元素，那么原来的元素向后移一位
            注意：如果本身集合是空的，那索引值必须指定为0，不然会报错
        get(索引值)：返回入参索引的元素值
        remove(元素索引)：返回被删除的元素，成功之后，后面的元素自动依次往前移一位
        remove(Object o)：返回boolean值，成功之后，后面的元素自动依次往前移一位
        set(索引值,元素值)：修改入参索引值上的元素
        size():获取当前集合的长度
     */
    public static void main(String[] args) {
        ArrayList<Integer>arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));
        System.out.println();
        System.out.println(arrayList.remove(0));
        System.out.println(arrayList.size()+"长度");
        System.out.println(arrayList.get(0));

        List<String>list = new ArrayList<>();
        list.add("s");
        System.out.println(list.get(0));

        Collection<String>collection = new ArrayList<>();
    }
}
