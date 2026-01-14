package com.ithema.test;

import java.text.DateFormatSymbols;
import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        //键盘录入一个大于等于2的整数x，打印他的平方根，结果只保留整数部分，舍去小数部分
        //思路：从1*1开始计算，把计算的结果和x进行比较，如果大于x则输出
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个大于等于2的整数");
        int x = sc.nextInt();
        while (x<2){
            System.out.println("输入的数字小于2，请重新输入一个大于等于2的整数");
            x = sc.nextInt();
        }
        int z = 1;
        while (z * z <= x) {
            z++;
        }
        System.out.println("X的平方根整数部分是："+(z-1));
    }
}
