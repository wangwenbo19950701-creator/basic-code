package com.itheima.demo1;

import java.util.Scanner;

//键盘输入一个3位数，在前台打印这个数的百位，十位和个位
public class TestDemo1 {
    public static void main(String[] args) {
        //输入一个三位数，使用变量i接收
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int i = sc.nextInt();
        //判断输入的数字是否是三位数
        if(i>999 || i<100){
            System.out.println("输入的数字不是三位数");
            //如果不是三位数，则进入下列循环
            for(int count = 0;count<3;count++){
                System.out.println("请重新输入");
                int i1 = sc.nextInt();
                if(i1>999 || i1<100){
                    System.out.println("输入的数字不是三位数");
                }else{
                    int hundred = i1 / 100;
                    int ten = i1 % 100 / 10;
                    int one = i1 % 10;
                    System.out.println("这个数的百位是" + hundred);
                    System.out.println("这个数的十位是" + ten);
                    System.out.println("这个数的个位是" + one);
                    System.out.println("程序执行完毕");
                    break;
                }
               // count++;
                if(count == 3){
                    //输入错误超过3次，结束程序
                    System.out.println("输入错误，程序结束");
                    break;
                }
            }
        }else {
            //如果是三位数，则进入下列代码
            int hundred = i / 100;
            int ten = i % 100 / 10;
            int one = i % 10;
            System.out.println("这个数的百位是" + hundred);
            System.out.println("这个数的十位是" + ten);
            System.out.println("这个数的个位是" + one);
            System.out.println("程序执行完毕");
        }
    }
}
