package com.itheima.test;

public class Test2 {
    public static void main(String[] args) {
        //定义一个数组，包含1，2，3，4，5，6，7，8，9，10
        //统计能被三整除的数的个数
        int[] arrInt = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int count = 0;
        for (int i = 0; i < arrInt.length; i++) {
            if(arrInt[i]%3==0){
                count++;
            }
        }
        System.out.println("能被3整除的数的个数是："+count+"个");
    }
}
