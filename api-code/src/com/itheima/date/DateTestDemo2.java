package com.itheima.date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class DateTestDemo2 {
    public static void main(String[] args) {
        /*
            练习1：输出从时间原点过了一整年的时间
            练习2：随机输出两个日期，比较谁前谁后
         */

        getStartTimePassOneYear();
        getRandomTimeToCompare();
    }

    private static void getStartTimePassOneYear() {
        //练习1

        //从时间原点过了一整年的时间=时间原点的毫秒值(0L)+(1000L*60*60*24*365)【一年的毫秒值】
        Date d1 =new Date(0L+(1000L*60*60*24*365));
        System.out.println(d1);
    }

    private static void getRandomTimeToCompare(){
        //获取随机数：如果随机数不屑范围，那就是在int的范围内随机生成一个整数
        Random r = new Random();
        //获取第一个随机时间点和毫秒值:因为int随机数可能是负数，所以要用绝对值变成正数
        Date d1 = new Date(Math.abs(r.nextInt()));
        long d1Time = d1.getTime();
        System.out.println("第一个时间点的毫秒值："+d1Time);
        //获取第二个随机事件点和毫秒值
        Date d2 = new Date(Math.abs(r.nextInt()));
        long d2Time = d2.getTime();
        System.out.println("第二个时间点的毫秒值："+d2Time);
        //用第一个时间点比较第二个时间点，谁大返回谁
        if(d1Time>d2Time){
            System.out.println("第一个时间点更靠前");
        }else if(d1Time<d2Time){
            System.out.println("第二个时间点更靠前");
        }else{
            System.out.println("相等");
        }

    }
}
