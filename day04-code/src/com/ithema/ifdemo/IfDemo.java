package com.ithema.ifdemo;

import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
        //朋友见老丈人，如果酒量大于2，则会得到老丈人的表扬，否则不搭理
        Scanner sc = new Scanner(System.in);
        //键盘录入酒量
        System.out.println("你能喝多少：");
        int beernum = sc.nextInt();
        //判断酒量
        if (beernum > 2) {
            System.out.println("老丈人表扬你");
        }else{
            System.out.println("？？？");
        }
    }
}
