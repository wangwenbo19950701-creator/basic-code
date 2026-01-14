package com.ithema.loopdemo;

public class ForDemo {
    public static void main(String[] args) {
        //for循环
        /*
        for循环的语法
        for(初始化表达式;布尔表达式;步进表达式){
            循环体；
        }
        注意：初始化表达式也可以拉到外面写，然后for里面的初始化表达式可以空着

        循环开始先用布尔表达式判断，如果为false，跳出循环
        如果为true，则执行循环体，然后执行步进表达式，再判断布尔表达式，重复步骤直到布尔表达式判断为false
         */

        //练习：打印5次HelloWorld
        for(int count =5;count>0;count--){
            System.out.println("HelloWorld");
        }
    }
}
