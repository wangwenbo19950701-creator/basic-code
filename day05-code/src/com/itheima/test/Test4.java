package com.itheima.test;

import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
        /*
            定义一个长度为10的数组，随机生成10个1~100的随机数，把他们装进数组
            要求：
            1.计算所有元素之和
            2.计算平均值
            3.统计有多少个元素小于平均值

            注意：一个循环只能干一件事，不然修改代码会很难，要养成习惯
         */
        Random r = new Random();
        int[] arrInt = new int[10];
        int sum = 0;//用来存储所有元素之和
        int count=0;//用来统计有多少个元素小于平均值

        //将生成的随机数插入数组
        for (int i = 0; i < arrInt.length; i++) {
            int num = r.nextInt(100) + 1;
            arrInt[i]=num;
            System.out.println(arrInt[i]);
        }

        //计算所有元素之和
        for (int i = 0; i < arrInt.length; i++) {
            sum=sum+arrInt[i];
        }
        System.out.println("所有元素之和为："+sum);

        //求平均值
        double avg=0;//用来存储平均值
        avg=sum/arrInt.length;
        System.out.println("平均值为："+avg);

        //统计有多少个元素小于平均值
        for (int i = 0; i < arrInt.length; i++) {
            if(arrInt[i]<avg){
                count++;
            }
        }
        System.out.println("有"+count+"个元素小于平均值");
    }
}
