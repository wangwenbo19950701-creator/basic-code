package com.ithema.test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //如果小明考试考了全班第一，小红就答应做他女朋友
        //全班人知道这事以后主动交白卷成全他们，所以他只需要考过小红就行了
        //设置小红的成绩
        int xhScore = 96;
        Scanner sc= new Scanner(System.in);
        //键盘录入小明的成绩
        System.out.println("请输入小明的成绩：");
        int xmScore = sc.nextInt();
        //判断成绩
        if(xmScore> xhScore){
            System.out.println("小红做小明女朋友");
        }else{
            System.out.println("滚");
        }

    }
}
