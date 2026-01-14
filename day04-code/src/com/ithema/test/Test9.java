package com.ithema.test;

import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        //键盘录入一个整数，并判断是不是回文数
        //思路：把这个数倒过来之后再与原来的数进行比较，二者相等则是回文数
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();//比如12321
        int temp = num;//用于过后比较的数
        int temp2 =0;//用于存放倒过来的数
        while (num!=0){
            int ge = num % 10;//拿到个位1
            temp2= temp2*10+ge;//拼接拿到的数temp2=0*10+1=1
            num= num/10;//去掉拿过的数num=1232
        }
        if (temp == temp2){
            System.out.println("是回文数");
        }else {
            System.out.println("不是回文数");
        }
    }
}
