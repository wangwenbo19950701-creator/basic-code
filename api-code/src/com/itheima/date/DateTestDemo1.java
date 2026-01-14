package com.itheima.date;

import java.util.Date;

public class DateTestDemo1 {
    public static void main(String[] args) {
        /*
            Date日期类：java用Date来描述日期，时间精确到毫秒
            1秒=1000毫秒

            有两个创建对象的方法
            空参创建：代表系统当前时间
            带参创建：代表从时间原点（1970年1月1日0时0分0秒）开始+入参的时间
            注意：入参时Long类型的
                有时差：中国+8 1970年1月1日8时0分0秒 日本+9 1970年1月1日9时0分0秒

            常用方法
            getTime：获取当前对象（Date类型）的毫秒值
         */

        //创建日期对象
        Date d1 = new Date();
        System.out.println(d1);//输出：Fri May 30 21:27:36 JST 2025

        Date d2 = new Date(0L);
        System.out.println(d2);//输出：Thu Jan 01 09:00:00 JST 1970 写代码的时候人在日本

        long time = d1.getTime();
        System.out.println(time);//输出对象的毫秒值
    }
}
