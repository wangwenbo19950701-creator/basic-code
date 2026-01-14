package com.itheima.test4;

import java.util.Scanner;

public class TestCar {
    public static void main(String[] args) {
        Car[] carArray = new Car[3];
        Scanner sc = new Scanner(System.in);
        //插入数据
        for (int i = 0; i < carArray.length; i++) {
            //注意，创建对象不能写在循环外面
            //每循环一次，都要新new一个对象，对象的地址值都是不一样的
            //如果写在外面，对象的地址值不变，只是对成员变量的值进行了修改，输出的结果全都是一样的数据
            Car c = new Car();
            carArray[i] = c;
            //插入数组元素i的成员变量
            System.out.println("请输入汽车品牌（字符串类型）");
            String cBland = sc.nextLine();
            carArray[i].setcBland(cBland);

            System.out.println("请输入汽车价格（int类型）");
            int cPrice = sc.nextInt();
            carArray[i].setcPrice(cPrice);
            /*
                注意：如果在nextLine方法前面用过nextInt等方法的时候要多加一个nextLine方法，
                不然会出现下面的nextLine直接读取到了回车而跳过输入
                nextInt等方法是遇到 空格，制表符，回车就停止接收数据
                未接受的数据到下一次键盘录入的时候会直接被显示

                nextLine与其他的有区别，他只遇到回车的时候会停止接收数据
             */
            sc.nextLine();//--------------------------------------------------很重要
            System.out.println("请输入汽车颜色（字符串类型）");
            String cColor = sc.nextLine();
            carArray[i].setcColor(cColor);
        }

        //遍历数组
        for (int i = 0; i < carArray.length; i++) {
            System.out.println(carArray[i].getcBland());
            System.out.println(carArray[i].getcPrice());
            System.out.println(carArray[i].getcColor());
            System.out.println();
        }
    }
}
