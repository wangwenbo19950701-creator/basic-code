package com.ithema.test;

import java.util.Random;
import java.util.Scanner;

public class Test13 {
    public static void main(String[] args) {
        //程序随机生成一个1-100的数字，猜出数字并打印出来猜的次数
        Random r = new Random();
        int num = r.nextInt(100) + 1;
        //System.out.println(num); //作弊代码
        //在小括号里写的就是生成随机数的范围，包头不包尾：比如写100，那范围就是0~99
        /*
            生成任意范围的随机数秘诀
            例如生成10 ~ 25的随机数
            1.先把最小范围变成0 也就是10 - 10   25 - 10  等于0~15
            2.15 + 1 把结果写到nextInt()里面  nextInt(16);
            3.把第一步减去的数在外面加回来  nextInt(16)+10;
         */
        System.out.println("输入一个1-100范围内的整数");
        Scanner sc = new Scanner(System.in);
        int insertNum = sc.nextInt();//输入的数字
        int count = 0;//记录猜数次数
        if (num == insertNum) {
            //一次猜中
            System.out.println("好家伙一次猜对，就是" + num);
        } else {
            while (num != insertNum) {
                if (num > insertNum) {
                    //猜的数小了
                    System.out.println("猜小了");
                } else {
                    //猜的数大了
                    System.out.println("猜大了");
                }
                System.out.println("再输入一次");
                count++;
                insertNum = sc.nextInt();
            }
            count++;
            System.out.println("猜对了，数字是" + num + "，一共猜了" + count + "次");
        }
    }
}
