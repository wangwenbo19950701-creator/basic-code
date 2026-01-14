package com.itheima.test;

import javax.swing.text.MaskFormatter;
import java.util.Scanner;

public class Test4 {
    /*
        定义一个数组，包含元素{11，22，33，44，55}
        要求：
        1.定义一个方法，用于遍历数组，并以{11，22，33，44，55}的方式打印出来
        2.定义一个方法，用于获取数组中最大值
        3.定义一个方法，用于判断数组中是否存在某个数字
        4.定义一个方法，用于复制数组，可以设置从哪一个复制到哪一个
     */
    public static void main(String[] args) {
        int [] arrInt={11,22,33,44,55};
        printArrInt(arrInt); //调用遍历数组方法
        System.out.println("数组中元素的最大值为："+getMax(arrInt));//调用获取最大值方法
        System.out.println(isExist(arrInt));
        int copyArrInt[]=copyArrayInt(arrInt);
        printArrInt(copyArrInt);
    }
    //遍历数组方法
    public static void printArrInt(int [] arrI){
        for (int i = 0; i < arrI.length; i++) {
            if(i==0){
                System.out.print("数组的所有元素为："+"{"+arrI[i]);
            }else if (i==(arrI.length-1)){
                System.out.println(","+arrI[i]+"}");
            }else {
                System.out.print(","+arrI[i]);
            }
        }
    }

    //获取数组中最大值方法
    public static int getMax(int [] arrI){
        int temp =arrI[0];
        for (int i = 1; i < arrI.length; i++) {
            if(temp<arrI[i]){
                temp=arrI[i];
            }
        }
        return temp;
    }

    //判断数字在数组中存在与否方法
    public static String isExist(int[]arrI){
        Scanner sc = new Scanner(System.in);
        System.out.println("执行判断存在与否方法");
        System.out.println("请输入一个整数：");
        int num=sc.nextInt();
        String message="没有这个数";
        for (int i = 0; i < arrI.length; i++) {
            if(num==arrI[i]){
                message="数组中存在这个数";
                break;
            }
        }
        return message;
    }

    //复制数组方法
    public static int[] copyArrayInt(int[]arrI){
        Scanner sc = new Scanner(System.in);
        System.out.println("执行赋值数组操作");
        System.out.println("请输入起始位置：");
        int numStart=sc.nextInt();
        System.out.println("请输入结束位置：");
        int numEnd=sc.nextInt();
        int[] copiedArray= new int[numEnd-numStart+1];
        int x = 0;//复制数组的初始角标
        for (int i = numStart-1;i < numEnd; i++) {
          copiedArray[x]=arrI[i];
          x++;
        }
        return copiedArray;
    }
}
