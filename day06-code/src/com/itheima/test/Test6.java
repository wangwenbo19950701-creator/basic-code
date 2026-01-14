package com.itheima.test;

public class Test6 {
    /*
        101~200之间有多少个素数，输出所有素数
     */
    public static void main(String[] args) {
        System.out.println("有"+countNum(101,200)+"个素数");
    }

    public static int countNum(int start, int end) {
        int count = 0;
        for (int i = start; i <=end ; i++) {
            for (int j = 2; j <start ; j++) {
                if(i%j==0){
                    count++;
                    System.out.println(i);
                    break;
                }
            }
        }
        return count;
    }
}
