package com.itheima.generics2;

import java.util.ArrayList;

public class MyArrayUtil {
    private MyArrayUtil(){

    }

    //入参为一个集合，添加整个集合方法
    //注意，泛型写在方法中需要定义，也就是在修饰符的后面写上泛型，入参也写上泛型
    public static<E> void addAll(ArrayList<E> arrayList,E...addItem){
        for (E e : addItem) {
            arrayList.add(e);
        }
    }
}
