package com.itheima.biginteger;

import java.math.BigInteger;
import java.util.Random;

public class BigIntegerTestDemo1 {
    public static void main(String[] args) {
        /*
            BigInteger类，大整数类，用来接收位数超过Long类型的整数，
            BigInteger的容量也是有限的，但是非常庞大，可以理解成无限
            有三个构造方法：
            常用
            public BigInteger(int num,Random random)获取一个2的n次方的随机数，第一个入参代表n次方，第二个是一个Random对象

            常用
            public BigInteger(String s) 可以把字符串转化成整数（前提是字符串必须是数字且不能有小数点，不然会报错）

            不常用
            public BigInteger(String s,int radix) 获取指定进制的整数，第一个入参是字符串整数，第二个入参是进制
            注意第一个入参需要遵循第二个入参的进制要求（如2进制的话，第一个入参里就只能有0或1）

            BigInteger类还有一个静态方法valueOf(long l)
         */

//        常用
//        public BigInteger(int num,Random random)获取一个2的n次方的随机数，第一个入参代表n次方，第二个是一个Random对象
//        BigInteger bigInteger = new BigInteger(4, new Random());
//        System.out.println(bigInteger);


//        常用
//        public BigInteger(String s) 可以把字符串转化成整数（前提是字符串必须是数字且不能有小数点，不然会报错
//        静态方法valueOf处理不了比Long类型大的数字，这个方法可以解决这个问题
//        BigInteger bigInteger = new BigInteger("123456789");

//        BigInteger类还有一个静态方法valueOf(long l)，如果传值超过了long类型的大小，编译报错
//        虽然有这个缺点，但是这个方法对常用的数字（-16到+16）进行了处理，使得效率比public BigInteger(String s)这种创建方法高
//        如果数字是（-16到+16），这个数字会像String的串池一样会被复用，所以节省内存
//        BigInteger bigInteger1 = BigInteger.valueOf(13L);
//        System.out.println(bigInteger1);
    }
}
