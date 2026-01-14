package com.itheima.generics2;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsMethodTestDemo {
    /*
        泛型方法：如果一个方法的入参不确定，也可以使用泛型来表示
     */
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        MyArrayUtil.addAll(arrayList,123,456,789,135,246);
        Iterator<Integer> iterator = arrayList.iterator();
        System.out.println(arrayList);
//        while (iterator.hasNext()){
//            System.out.println();
//        }
    }
}
