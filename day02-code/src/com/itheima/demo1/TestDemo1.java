package com.itheima.demo1;

import java.util.Scanner;

/*键盘输入两个整数，打印他们的和*/
public class TestDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        //把键盘输入的整数赋值给i
        int i = sc.nextInt();
        //把输入的整数提示给操作者
        System.out.println("你输入的整数是："+i);
        //把i赋值给num1
        int num1 = i;
        System.out.println("请输入第二个整数：");
        //把键盘输入的整数赋值给i
        i = sc.nextInt();
        //把输入的整数提示给操作者
        System.out.println("你输入的整数是："+i);
        //把i赋值给num2
        int num2 = i;
        System.out.println("第一个数和第二个数相加的和为 "+(num1 + num2));
    }
}
