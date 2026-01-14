package com.itheima.methoddemo;

public class MethodDemo1 {
        /*
            什么是方法：
            方法是运行程序的最小单位

            方法的作用：
            避免重复度高的代码反复出现

            注意：
            1.方法的定义无法嵌套，但调用可以
            2.方法如果不被调用就不执行
            3.在执行程序中遇到方法要先进入方法，直到方法结束再从进入方法的位置继续执行程序
            语法：
            public static 返回数据类型(无返回值写void) (【形参1】,...没有入参这里空着){
                方法体
                【return 返回值;】
            }

            方法的调用有三种
            1.直接调用：方法名();
            2.赋值调用：数据类型 变量名 = 方法名(); 也就是把方法中返回的结果赋值给一个变量
            3.输出调用：System.out.println(方法名()); 也就是把方法中返回的结果输出到控制台
            4.方法与方法之间没有任何上下级关系，他们都是独立的
         */
    public static void main(String[] args) {
        methodNoValue();
        methodValue(10);
        System.out.println(methodValue2(20));
    }
    public static void methodNoValue(){
        System.out.println("我是无返回值无入参的方法");
        System.out.println("请用直接调用的方式调用我");
    }

    public static void methodValue(int num){
        System.out.println("我是无返回值有入参的方法");
        System.out.println("请用赋值调用的方式调用我");
    }

    public static int methodValue2(int num){
        System.out.println("我是有返回值有入参的方法");
        System.out.println("请用输出调用的方式调用我");
        return num;
    }


}
