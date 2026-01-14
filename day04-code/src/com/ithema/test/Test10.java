package com.ithema.test;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        //键盘输入两个数，求这两个数的商和余数
        //要求不使用 / % 运算符
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个被除数：");
        int num1 = sc.nextInt();//获取第一个整数3
        System.out.println("请输入一个除数：");
        int num2 = sc.nextInt();//获取第二个整数3
        int count =0; //记录商
        while((num1-num2)>=0){
            num1=num1-num2;
            count++;
        }
        System.out.println("商为"+count+"余数为"+num1);
    }
}
