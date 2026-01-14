package com.itheima.methoddemo;

public class MethodDemo3 {
    /*
        方法的重载
        当多个方法在同一个类中，方法名一样，但参数的个数/参数的类型/参数的顺序有某一个或多个不一样的，
        称作方法的重载オーバーロード

        判断是否为方法的重载与返回值无关，系统是通过参数来判断到底调用的是哪个方法
        哪个被调用，方法名就会高亮显示
        下面为例子
     */
    public static void main(String[] args) {
        methodOverload(1.0);
    }
    public static void methodOverload() {
    }
    public static int methodOverload(int num){
        return 0;
    }
    public static void methodOverload(int num1,int num2){
    }
    public static void methodOverload(double num){
    }
    /*
        以上都是方法重载的例子
     */
}
