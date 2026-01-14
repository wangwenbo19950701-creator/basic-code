package com.itheima.arraydemo;

public class ArrayDemo1 {
    public static void main(String[] args) {
        /*
        数组的静态初始化：
        数组数据类型 [] 数组名 = new 数据类型[]{元素1,元素2,元素3,...};
        简化写法：
        数组数据类型 [] 数组名 = {元素1,元素2,元素3,...};

        注意：数组的长度取决于元素的多少，并且数组一旦被创建，长度就不能更改
         */

        //定义一个数组存储五个学生的年龄
        int [] arrayAge={19,19,20,21,18};
        //定义一个数组存储三个学生的姓名
        String [] arrayName={"张三","李四","王五"};
        //定义一个数组存储四个学生的身高
        double [] arrayHeight={1.75,1.78,1.80,1.83};
    }
}
