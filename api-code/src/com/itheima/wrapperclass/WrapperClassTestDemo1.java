package com.itheima.wrapperclass;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class WrapperClassTestDemo1 {
    /*
        键盘录入一些1-100的整数并添加到集合中
        直到集合的所有数据和超过200为止
     */

    public static void main(String[] args) throws InputMismatchException{
        //创建一个集合
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("请输入一个数字");
        //计算和的变量
        int sum = 0;
        while (true){
            try{
                //键盘录入
                Scanner sc = new Scanner(System.in);
                //判断是否为数字，不是数字会捕获异常开始新一轮循环
                Integer input = sc.nextInt();
                if(input<1||input>100){
                    System.out.println("数字不在1-100之间，重新输入");
                    System.out.println("请输入一个数字");
                    continue;
                }
                //通过判断，则添加到集合中
                arrayList.add(input);
                sum=sum+input;
                if(sum<=200){
                    System.out.println("现在集合中的和是："+sum);
                    System.out.println("请输入一个数字");
                    continue;
                }else {
                    System.out.println("集合中的和为："+sum+"，超过200了");
                    return;
                }
            }catch (InputMismatchException e){
                System.out.println("输入的不是数字，请重新输入");
                continue ;
            }

        }

        //判断集合的所有值的和是否大于200
    }
}
