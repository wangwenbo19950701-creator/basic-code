package com.itheima.test;

public class Test3 {
    /*
        定义方法，判断两个整数是否相同
        要求兼容 byte short int long
     */
    public static void main(String[] args) {
        System.out.println(compare((byte) 1,(byte) -128));
    }
    public static boolean compare(int num,int num2){
        return num == num2;
    }
    public static boolean compare(byte num,byte num2){
        return num == num2;
    }
    public static boolean compare(short num,short num2){
        return num == num2;
    }
    public static boolean compare(long num,long num2){
        return num == num2;
    }
}
