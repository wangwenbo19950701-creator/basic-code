package com.ithema.test;

import java.nio.channels.NonWritableChannelException;
import java.util.Scanner;

public class Test14 {
    public static void main(String[] args) {
        //键盘输入一个整数，判断其是不是质数
        //质数的概念：只能被1和本身整除的数字
        System.out.println("请输入一个整数");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean flag = true;//质数为true合数为false
        if (num == 1) {
            //判断输入数字是否为1
            System.out.println("1不是质数也不是合数");
        } else {
            //判断是否为质数
            int i = 2;
            while (i < num) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
                i++;
            }
            if (flag) {
                System.out.println(num + "是质数");
            } else {
                System.out.println(num + "不是质数");
            }
        }
    }
}
