package com.itheima.simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTestDemo2 {
    /*
        用字符串表示时间2000-11-11
        并将其转化成2000年11月11日
     */

    //思路：先把字符串转化成date，再获取date的毫秒值赋值给新的date，最后把date转化成指定格式

    public static void main(String[] args) throws ParseException {
        //指定字符串
        String s = "2000-11-11";
        //设定格式
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        //使用sdf2格式把字符串变成Date类型，并获取其毫秒值
        long time = sdf2.parse(s).getTime();
        //把毫秒值赋值给新的Date类型的数据并用sdf1按要求打印日期
        System.out.println(sdf1.format(new Date(time)));
    }
}
