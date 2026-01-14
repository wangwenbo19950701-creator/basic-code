package com.itheima.test;

import java.util.Scanner;

public class Test1 {
        /*
            定义一个方法，键盘输入两个数，用方法求这两个变量的和
         */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        double num1 = sc.nextDouble();
        System.out.println("请输入第二个数：");
        double num2 = sc.nextDouble();
        System.out.println(getSum(num1,num2));
    }

    public static double getSum(double num1,double num2){
        return num1 + num2;
    }
}
