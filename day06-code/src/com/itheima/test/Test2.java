package com.itheima.test;

import java.util.Scanner;

public class Test2 {
    /*
        定义一个方法，要求可以比较两个长方形的周长谁大谁小
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个长方形的长度：");
        double length1 = sc.nextDouble();
        System.out.println("请输入第一个长方形的宽度：");
        double width1 = sc.nextDouble();
        System.out.println("请输入第二个长方形的长度");
        double length2 = sc.nextDouble();
        System.out.println("请输入第二个长方形的宽度：");
        double width2 = sc.nextDouble();
        System.out.println(compareResult(length1,width1,length2,width2));
    }

    public static String compareResult(double length1, double width1, double length2, double width2){
        if((length1+width1)*2==(length2+width2)*2) {
            return "相等";
        }else if((length1+width1)*2>(length2+width2)*2){
            return "第一个大";
        }else {
            return "第二个大";
        }

    }
}
