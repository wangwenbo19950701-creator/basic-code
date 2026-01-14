package com.itheima.test;

import java.util.Random;

public class Test5 {
    /*
        定义一个数组， 包含元素1，2，3，4，5，打乱里面的数据
     */
    public static void main(String[] args) {
        Random r = new Random();
        int [] arrayInt={1,2,3,4,5};
        int temp = 0;
        for (int i = 0; i < arrayInt.length; i++) {
            int randomNum= r.nextInt(arrayInt.length);
            temp = arrayInt[i];
            arrayInt[i] = arrayInt[randomNum];
            arrayInt[randomNum] = temp;
        }

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println(arrayInt[i]);
        }
    }
}
