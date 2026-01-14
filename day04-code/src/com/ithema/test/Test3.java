package com.ithema.test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //键盘输入星期，打印休息日或是工作日
        Scanner sc = new Scanner(System.in);
        int weekNum = sc.nextInt();
        if (weekNum > 0 && weekNum <= 7) {
            switch (weekNum) {
                case 1 -> System.out.println("星期一，工作日");
                case 2 -> System.out.println("星期二，工作日");
                case 3 -> System.out.println("星期三，工作日");
                case 4 -> System.out.println("星期四，工作日");
                case 5 -> System.out.println("星期五，工作日");
                default -> System.out.println("周末，休息日");
            }
        } else {
            System.out.println("输入有误");
        }

    }
}
