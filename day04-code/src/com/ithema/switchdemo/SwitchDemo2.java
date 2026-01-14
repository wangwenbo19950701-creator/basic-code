package com.ithema.switchdemo;

import java.util.Scanner;

public class SwitchDemo2 {
    public static void main(String[] args) {
        /*switch在java12版本之后的一个新写法
            switch(表达式){
                case 值1 -> 语句块1;
                case 值2 -> 语句块2;
                ...
                default -> 语句块n;
            }
        */
        //中午吃饭吃什么，看了下菜单，武汉1.热干面，有2.五爷小面，有3.炸酱面，还有4.四季抻面
        Scanner sc =new Scanner(System.in);
        System.out.println("请选择菜单：");
        System.out.println("1.热干面");
        System.out.println("2.五爷小面");
        System.out.println("3.炸酱面");
        System.out.println("4.四季抻面");
        int menuNum = sc.nextInt();
        switch(menuNum) {
            case 1 -> System.out.println("吃热干面");
            case 2 -> System.out.println("吃五爷小面");
            case 3 -> System.out.println("吃炸酱面");
            case 4 -> System.out.println("吃四季抻面");
            default -> System.out.println("啥也不吃");
        }
    }
}
