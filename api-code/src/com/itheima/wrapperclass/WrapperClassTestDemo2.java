package com.itheima.wrapperclass;

import java.util.Scanner;

public class WrapperClassTestDemo2 {
    /*
        自己实现parseInt方法转换成整数
        字符串中只能有数字
        最长10位，最少1位
        0不能开头
     */
    public static void main(String[] args) {
        //设置一个字符串变量
        Scanner sc = new Scanner(System.in);
        loop:
        while (true){
            System.out.println("请输入一个1到10位的数字");
            String s = sc.nextLine();
//        Integer integer = Integer.parseInt(s);
//        System.out.println(integer);
            //判断首位是否为0
            if(s.charAt(0)=='0'&&s.length()!=1){
                System.out.println("开头不可以是0");
                continue;
            }
            //判断位数是否在1到10位之间
            if(s.length()<1||s.length()>10){
                System.out.println("位数不在1到10位之间");
                continue;
            }
            StringBuilder sb = new StringBuilder();
            //把输入的字符串翻转，也就是个位在第一位，生成一个新的字符串
            String newString= sb.append(s).reverse().toString();
            //创建数字对照
            char [] arr = {'0','1','2','3','4','5','6','7','8','9'};
            //创建Integer对象接收结果
            double num=0;
            //使用查表法
            for (int i = 0; i < newString.length(); i++) {
                for (int j = 0; j < arr.length; j++) {
                    //利用数字字典对照一个一个查找表
                    if(newString.charAt(i)==arr[j]){
                        if (i==0){
                            num=num+j;
                            break;
                        }
                        num=num+j*Math.pow(10,i);
                        break;
                    }
                    System.out.println("有其他非数字字符，请重新输入");
                    continue loop;
                }
            }
            Integer integer = (int)num;
            System.out.println("已变为包装类的对象 "+integer);
            break;
        }

    }
}
