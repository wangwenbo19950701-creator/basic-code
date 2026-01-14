package com.itheima.simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SimpleDateFormatTestDemo3 {
    /*
        判断到底参加上了秒杀活动了吗
        秒杀活动开始时间2023年11月11日 00:00:00
        结束时间：2023年11月11日 00:10:00

        第一个人参加时间2023年11月11日 00:01:00
        第二个人参加时间2023年11月11日 00:11:00
     */
    public static void main(String[] args) throws ParseException {
        String startTime = "2023年11月11日 00:00:00";
        String endTime = "2023年11月11日 00:10:00";
        String time1 = "2023年11月11日 00:01:00";
        String time2 = "2023年11月11日 00:11:00";

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

        long startTimeMillionSecond = sdf1.parse(startTime).getTime();
        long endTimeMillionSecond = sdf1.parse(endTime).getTime();
        long time1MillionSecond = sdf1.parse(time1).getTime();
        long time2MillionSecond = sdf1.parse(time2).getTime();

        if(time1MillionSecond<startTimeMillionSecond||time1MillionSecond>endTimeMillionSecond){
            System.out.println("第一个人没参加上");
        }else {
            System.out.println("第一个人参加上了");
        }

        if(time2MillionSecond<startTimeMillionSecond||time2MillionSecond>endTimeMillionSecond){
            System.out.println("第二个人没参加上");
        }else {
            System.out.println("第二个人参加上了");
        }

    }

}
