package com.ithema.test;

public class Test11 {
    public static void main(String[] args) {
        //逢七过游戏，在1-100中，凡是碰到带7的或7的倍数要喊过，其他数字正常报数
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0 || i % 10 == 7 || i/10==7) {
                System.out.println("过");
                continue;
            }
            System.out.println(i);
        }
    }
}
