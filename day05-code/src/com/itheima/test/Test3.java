package com.itheima.test;

import javax.lang.model.util.ElementScanner6;

public class Test3 {
    public static void main(String[] args) {
        /*
            定义一个数组，包含元素1，2，3，4，5
            要求遍历数组，并且奇数的元素变为原来的二分之一倍，偶数的元素变为原来的2倍
         */
        double [] arrDou={1,2,3,4,5};
        for (int i = 0; i < arrDou.length; i++) {
            if(arrDou[i]%2==0){
                arrDou[i]=arrDou[i]*2;
            }else {
                arrDou[i]=arrDou[i]/2;
            }
            System.out.println("数组第"+(i+1)+"个元素是："+arrDou[i]);
        }
    }
}
