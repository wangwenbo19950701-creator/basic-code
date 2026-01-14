package com.itheima.generics1;

public class GenericsClassTestDemo {
    /*
        泛型：泛型就像一个看大门的，指定了传入集合中数据的类型
        如果集合不指定泛型，代码也不会报错，默认集合接收Object类型

        泛型不只是可以写在集合上，还可以写在类上，方法上，接口上
        类上有泛型的叫做----泛型类
        方法上有泛型的叫----泛型方法
        接口上有泛型的叫----泛型接口

        这些写法是应用于数据不知道或者不确定到底是什么类型的时候。
        当使用者使用了这个类/方法/接口的时候，就会确定这个泛型到底是什么类型
        系统也会在底层把这个类型赋值给这个类/方法/接口
     */
    public static void main(String[] args) {
        //创建了模拟集合的对象，并且指定了泛型String
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        System.out.println(myArrayList.add(123));
        myArrayList.add(456);
        System.out.println(myArrayList.get(0));
        System.out.println(myArrayList.toString());
    }
}
