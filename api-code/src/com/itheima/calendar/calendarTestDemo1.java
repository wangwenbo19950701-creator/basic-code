package com.itheima.calendar;

import java.util.Calendar;
import java.util.Date;

public class calendarTestDemo1 {
    /*
        calendar日历类：可以获取时间的信息（纪元，年，月，日，星期。。。）

        calendar类是一个抽象类，所以不可以直接去new对象
        而是调用一个getInstance的静态方法来获取日历类对象

        常用方法
        getInstance：静态方法，获取一个日历类对象
        getTime：返回一个Date类型的数据
        setTime(Date d)：设置日期

        get([calendar中的常量]):获取日历类中的某一个字段，这个字段是根据传入的常量来的
        set([calendar中的常量], int 修改的值)：修改日历类中的某一个字段，这个字段是根据传入的常量来的
            注意：在老外的意识里，周日是一周的开始，
            所以星期日对应索引1，星期一对应索引2。。。
            月份的索引是0-11，0代表1月，1代表2月。。。不能超过这个范围
        add([calendar中的常量]，int 加/减多少)：加/减日历类中的某一个字段，这个字段是根据传入的常量来的
     */


    public static void main(String[] args) {
        //获取日历类对象
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        //getTime：返回一个Date类型的数据
        System.out.println(calendar.getTime());
        //setTime(Date d)：设置日期
        calendar.setTime(new Date());
        System.out.println(calendar.getTime());

        //get([calendar中的常量]):获取日历类中的某一个字段，这个字段是根据传入的常量来的
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        //set([calendar中的常量], int 修改的值)：修改日历类中的某一个字段，这个字段是根据传入的常量来的
        calendar.set(Calendar.YEAR,1994);
        System.out.println(calendar.get(Calendar.YEAR));
        //add([calendar中的常量]，int 加/减多少)：加/减日历类中的某一个字段，这个字段是根据传入的常量来的
        calendar.add(Calendar.YEAR,1);
        System.out.println(calendar.get(Calendar.YEAR));
    }
}
