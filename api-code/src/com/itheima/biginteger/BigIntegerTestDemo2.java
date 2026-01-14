package com.itheima.biginteger;

import java.math.BigInteger;

public class BigIntegerTestDemo2 {
    public static void main(String[] args) {
        /*
            因为BigInteger是一个对象，所以不能直接使用运算符进行计算
            要使用他的内置方法来计算，而因为BigInteger的对象中的内容是不可变的，所以计算过后会再内存中生成一个新的BigInteger对象

            内置方法：
            add()加法
            substract()减法
            multiply()乘法
            divide()整除，只返回商
            divideAndRemainder()返回一个数组，长度为2，索引0代表商，索引1代表余数
            equals()重写过后的equals方法，比较两个对象的属性值
            pow()平方
            max/min()比较调用者和入参谁大/小，返回大/小的那个
            intValue()转换为int类型的整数
         */

//        验证通过计算，原本的BigInteger类型不会改变，而是生成一个新的地址
        BigInteger bigInteger= BigInteger.valueOf(10);
        BigInteger bigInteger1 = BigInteger.valueOf(5);
        bigInteger=bigInteger.add(bigInteger1);
        System.out.println(bigInteger);
        //地址不同所以是新生成的
        System.out.println(bigInteger.equals(bigInteger.add(bigInteger1)));
    }
}
