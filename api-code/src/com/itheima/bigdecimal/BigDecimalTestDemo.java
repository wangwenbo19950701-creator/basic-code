package com.itheima.bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalTestDemo {
    public static void main(String[] args) {
        /*
            BigDecimal类，用来解决小数计算时不精确的问题和表示较大的小数
            他的构造方法有很多，推荐使用传入字符串的那个，极不推荐使用传入double类型的那个，因为还是会有不精确的问题
            如果小数没有超出double的范围，可以用valueOf的方式获取，可以节约内存，如果超出了就new出来

            常用方法
            add()
            substract()
            multiply()
            divide()
            divide(BigDecimal类型,保留小数点后几位,四舍五入方法)
            RoundingMode的方法
            up:远离0的方向，如5.6变成6  -5.6变成-6
            down:接近零的方向 如5.6变成5 -5.6变成-5
            ceil:向正无穷大方向 如5.6变成6 -5.6变成-5
            floor:向负无穷大方向 如5.6变成5  -5.6变成-6
            half_up :真正意义上的四舍五入

            扩展：
            BigDecimal的底层存储方式跟BigInteger还是有点区别的
            BigDecimal拿到一个小数（如1.23），他会把这个小数拆成'1','.','2','3'这四个部分，
            分别对应ASCII码表中的值来存储成一个byte类型的数组
         */

        //展示不精确的结果
        System.out.println("0.09+0.01不精确的结果："+(0.09+0.01));
        //展示精确的结果
        BigDecimal bigDecimal = new BigDecimal("0.13");
        BigDecimal bigDecimal1 = new BigDecimal("0.03");
        System.out.println("0.09+0.01精确的结果："+bigDecimal.add(bigDecimal1));
        bigDecimal.divide(bigDecimal1,2, RoundingMode.HALF_UP);

    }
}
