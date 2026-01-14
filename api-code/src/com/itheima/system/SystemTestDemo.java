package com.itheima.system;

import java.util.ArrayList;

public class SystemTestDemo {
    public static void main(String[] args) {
        /*
            System类是系统方面的类，
            常用的方法有
            exit(0或其他整数)：0表示正常关机，其他整数表示非正常关机
            currentTimeMillis()：返回从1970年1月1日0点0分0秒到目前代码执行的毫秒时间(Long类型)，如果换算需要对数据再做处理
            arraycopy(被拷贝的数组名,从那一位开始拷贝,拷贝到哪个数组，拷贝操作从目的数组的哪个角标开始，拷贝几个元素)

            注意1：如果拷贝的数组是基本数据类型，拷贝的和被拷贝的数组的数据类型必须保持一致（不会自动转化）否则执行会报错（编译不会报错）
            注意2：需要考虑数组越界异常
            注意3：如果拷贝的数组是引用数据类型，子类的数组可以复制到父类里面去

         */
        System.exit(0);
        System.out.println(System.currentTimeMillis());
    }
}
