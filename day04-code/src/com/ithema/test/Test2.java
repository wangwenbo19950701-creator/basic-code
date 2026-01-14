package com.ithema.test;

public class Test2 {
    public static void main(String[] args) {
        //现在有一款无人驾驶的汽车
        //对于汽车的运行规则，红灯停，绿灯行，黄灯慢
        boolean isGreen = true;
        boolean isRed = false;
        boolean isYellow = false;
        if(isGreen){
            System.out.println("go");
        }else if(isRed){
            System.out.println("stop");
        }else{
            System.out.println("slow");
        }
    }
}
