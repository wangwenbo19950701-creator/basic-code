package com.ithema.test;

public class Test5 {
    public static void main(String[] args) {
    /*
        累加思想
        注意：记录和的变量一定要写在外面，不然每次循环会被清除
        错误写法：
        for(int count= 1;count<=10;count++){
            int sum = 0;
            sum= sum+count;
        }
            System.out.println(sum);
        这个结果会报错，因为变量sum的作用域是for循环，所以for循环执行之后sum就被清除了

     */
    //打印1-10的和
        int sum =0;
        for(int count= 1;count<=10;count++){
            sum= sum+count;
        }
        System.out.println(sum);
    }
}
