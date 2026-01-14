package com.ithema.loopdemo;

public class DoWhileDemo {
    public static void main(String[] args) {
        //do while循环
        /*
        语法：do{
                循环体;
              }
              while(条件判断语句)
        先执行do里的循环体，然后再判断条件，如果是true则继续循环，如果是false则跳出循环
        也就是说do while至少会执行一次循环体
         */
        int i = 1;
        do {
            System.out.println("先输出一次循环体的内容");
            System.out.println("i=" + i);
            i++;
        } while (i < 5);
    }
}
