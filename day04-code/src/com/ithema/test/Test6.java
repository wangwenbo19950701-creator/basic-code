package com.ithema.test;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        //键盘输入两个正整数，打印出他们之间偶数的和
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
            int sum = 0;
            for (int count = num2; count <= num1; count++) {
                if (count % 2 == 0) {
                    //判断是不是偶数
                    sum = sum + count;
                }
            }
            System.out.println(sum);
        } else if (num1 < num2) {
            //如果第一个数小于第二个数
            num1 = num1 + 1;
            num2 = num2 - 1;
            int sum = 0;
            for (int count = num1; count <= num2; count++) {
                if (count % 2 == 0) {
                    //判断是不是偶数
                    sum = sum + count;
                }
            }
            System.out.println(sum);
        } else {
            System.out.println("输入的两个数相等,没有中间的数");
        }
    }
}
