package com.ithema.loopdemo;

public class WhileDemo {
    public static void main(String[] args) {
        /*
        for和while的应用场景（开发角度）
        for循环适合已知循环次数的场合
        while适合虽然不知道循环次数，但是知道循环结束的条件
         */
        //使用while打印1-10
        int i= 1;
        while(i<=10){
            System.out.println(i);
            i++;
        }
    }
}
