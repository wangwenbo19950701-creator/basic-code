package com.ithema.test;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        //键盘输入两个正整数，统计这两个数之间能被5和3整除的数有多少个
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");//键盘输入第一个数
        int num1 = sc.nextInt();
        System.out.println("请输入第二个整数：");//键盘输入第二个数
        int num2 = sc.nextInt();
        //判断这两个数的大小
        if (num1 > num2) {
            //如果第一个数大于第二个数
            num1 = num1 - 1;
            num2 = num2 + 1;
            int count = 0;
            for (int i = num2; i <= num1; i++) {
                //判断是否能被3和5整除
                if (i % 3 == 0 && i % 5 == 0) {
                    count++;
                }
            }
            System.out.println("能被3和5整除的数有" + count + "个");
        } else if (num1 < num2) {
            //如果第一个数小于第二个数
            num1 = num1 + 1;
            num2 = num2 - 1;
            int count = 0;
            for (int i = num1; i <= num2; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    //判断是否能被3和5整除
                    count++;
                }
            }
            System.out.println("能被3和5整除的数有" + count + "个");
        } else {
            System.out.println("输入的两个数相等,没有中间的数");
        }
    }
}
