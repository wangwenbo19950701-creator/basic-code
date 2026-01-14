package com.itheima.methoddemo;

public class MethodDemo5 {
    /*
        基本数据类型和引用数据类型

        基本数据类型：byte、short、int、long、float、double、char、boolean
        特点：存储的数据是在栈内存里实际的数据

        引用数据类型：包括String 数组等，
        特点：需要用new关键字来声明创建的，存储的数据是在堆内存里的地址值，通过地址值在堆内存中找到指定的位置和数据

        在调用方法时，对于这两个数据类型的差异如下
     */
    public static void main(String[] args) {
        //基础数据类型实验
        int num=10;
        System.out.println(num);//输出10
        change(num);
        System.out.println(num);//还是10
        //结果：形参对于基础数据类型没有影响，因为方法是独立的，
        //     而且main里定义的num并不是change方法里的形参num（局部变量），change方法执行过后就出栈了，
        //     导致局部变量的num也从内存消失了，所以main里的num值没有变
        //     如果要让赋值能成功，change方法得改写成有返回值的形式并用main的num去接这个返回值

        //引用数据类型实验
        int [] arrInt=new int[]{1,2,3};
        System.out.println(arrInt[1]);//打印2
        change(arrInt);//此时arrInt地址值就被传给array这个形参了
        System.out.println(arrInt[1]);//打印20
        //结果：形参对于引用数据类型是有影响的，因为引用数据类型本身存储的就是地址值，
        //     它指向堆内存的指定区域，再从此区域中获取值
        //     所以当change方法入参arrInt数组时，方法中的形参就被赋予了arrInt的地址值
        //     顺着这个地址值找到了里面角标是1的元素并修改了他的值为20
        //     就算change方法结束出栈了，堆中的数据也已经被修改了，
        //     此时在输出arrInt[1]时，就变成20了而并非原来的2
    }

    public static void change(int num) {
        num=100;
    }

    public static void change(int[]array){
        array[1]=20;
    }
}
