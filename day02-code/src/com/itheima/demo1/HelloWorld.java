package com.itheima.demo1;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        //打印HelloWorld语句
        System.out.println("HelloWorld");
        System.out.println("请输入一个整数");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println("您输入的是"+ i);
    }

}
//小结：Idea的架构为project（项目）> module（模块）> package（包/文件夹）> class（类）