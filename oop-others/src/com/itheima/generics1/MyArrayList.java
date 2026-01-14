package com.itheima.generics1;

import java.util.Arrays;
//泛型类
//如果调用者创建了这个类，就必须指定泛型中的数据类型
public class MyArrayList<E> {
    //自己创建一个泛型类，模拟集合
    //创建一个可以接收数据的数组
    Object [] objects = new Object[10];
    //添加的位置size，添加过后自动递增
    int size ;

    //往模拟集合里添加元素，会用调用者所指定的数据类型替换掉E
    public boolean add(E e){
        objects[size] = e;
        size++;
        return true;
    }

    //写一个get方法用来获取特定索引的元素
    public E get(int i){
        return (E)objects[i];
    }

    //重写一个toString方法来展示添加的元素
    @Override
    public String toString(){
        return Arrays.toString(objects);
    }
}
