package com.itheima.simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTestDemo1 {
    /*
        格式化时间类，可以指定时间的显示格式
        无参构造方法：使用默认格式显示一个Date类型的数据
        有参构造：入参传递一个字符串来指定显示格式
        yyyy代表年
        MM大M代表月
        dd小d代表日

        HH大H代表小时
        mm小m代表分钟
        ss小s代表秒
        把Date类型的数据解析成字符串

        常用方法
        format(Date d):传递一个Date类型的数据，并把他转化成字符串
        parse(String s):传递一个字符串，并按照SimpleDateFormat中的格式显示时间
     */

    public static void main(String[] args) throws ParseException {
        //空参构造展示时间
        Date d1 = new Date(0L);
        SimpleDateFormat sdf1 = new SimpleDateFormat();
        //有参构造展示时间
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");

        String s = "1995年07月01日 00时00分00秒";

        //使用format方法把date类型的数据转化成字符串打印在控制台(默认显示格式)
        System.out.println(sdf1.format(d1));// 1970/1/1 上午9:00
        //使用指定格式来进行转换
        System.out.println(sdf2.format(d1));//1970年01月01日 09时00分00秒
        //使用parse方法把字符串转换成时间date类型并打印
        System.out.println(sdf2.parse(s));//Sat Jul 01 00:00:00 JST 1995

    }



}
