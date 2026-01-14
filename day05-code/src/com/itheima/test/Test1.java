package com.itheima.test;

public class Test1 {
    public static void main(String[] args) {
        //定义一个数组，包含1，2，3，4，5，6，7，8，9，10
        //计算它们的和
        int [] arrInt={1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for (int i = 0; i < arrInt.length; i++) {
            sum=sum+arrInt[i];
        }
        System.out.println("数组元素之和为："+sum);
    }
}
