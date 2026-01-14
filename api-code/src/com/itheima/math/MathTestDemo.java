package com.itheima.math;

public class MathTestDemo {
    public static void main(String[] args) {
        /*
            Math类是存在于Java.lang包下的类，不需要创建对象就可以使用（因为是工具类，所以也不能创建对象）
            常用方法：
            Math.abs(): 绝对值，如果传入的数字是正数，那返回的就是正数，传入的是负数，返回的就是负数
                        注意：如果数字为该类型的最小值 如int的-2147483648 编译不会报错，也可以正常执行，但会出bug，
                        因为int的最大值是2147483647 没有对应-2147483648的数字

            Math.ceil()：向上取整  传入一个double类型如1.2  则输出2.0 ,如果传入一个float类型的数字会被自动转换成double
            Math.floor():向下取整  传入一个double类型如1.8 则输出1,如果传入一个float类型的数字会被自动转换成double
            Math.round():四舍五入（只根据小数点后一位的数字判断是进一还是退一）  传入一个double或float类型的数
            Math.max(数字1，数字2):比较数字1和2的大小，返回较大的那个数字
                         注意：如果两个入参类型不一样则会先统一类型,再进行判断，编译不会出问题，也可以正常执行，但是打印结果可能会有问题
                         建议在使用之前就提前转化成一致的类型
                         char类型会被转换成int参与比较，如果比较的数是小数，那还会再转换成对应类型再进行比较
            Math.min(数字1，数字2):比较数字1和2的大小，返回较小的那个数字
            Math.pow(double类型数字，double类型的数字 几次方 )：求次方 -几次方也可以计算
            Math.random():生成一个0.00到1.00之间的随机数（不包含头尾），一般会使用java.util包下的Random类去代替这个功能
         */
        System.out.println(Math.abs(-2147483648));//输出-2147483648，bug
        System.out.println(Math.ceil(12.3f));//13
        System.out.println(Math.floor(10.8f));//10
        System.out.println(Math.round(12.35f));//12
        System.out.println(Math.round(13.825));//14
        System.out.println(Math.max(10.1f, 10.1));//10.100000381469727 数据类型不一样会自动转换
        System.out.println(Math.max('a', 10.1));//97.0 char类型会先转换成int，再转换成double，最后进行比较
        System.out.println(Math.max('a', 'b'));//98 自动转换成int进行比较
        System.out.println(Math.min('a', 'b'));//97
        System.out.println(Math.pow(2, 3));//8.0 2的3次方
        System.out.println(Math.random());//生成一个0.00到1.00之间的随机数（不包含头尾）
    }
}
