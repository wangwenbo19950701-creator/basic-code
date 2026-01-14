package com.itheima.test5;

public class TestPhone {
    public static void main(String[] args) {
        /*
            定义一个数组存储3部手机对象
            对象属性：品牌 价格 颜色
            求三部手机价格的平均值
         */

        //定义一个长度为3的数组，数据类型为Phone
        Phone [] phoneArray= new Phone[3];
        //创建三个手机的对象
        Phone p1=new Phone("华为P40",5999,"Blue");
        Phone p2=new Phone("OPPO ACE5",2999,"White");
        Phone p3=new Phone("APPLE 16",8999,"Black");
        //给phoneArray数组的元素赋值
        phoneArray[0]=p1;
        phoneArray[1]=p2;
        phoneArray[2]=p3;
        //声明一个变量存储手机总价格
        int sumPrice=0;
        //遍历出数组元素的价格元素
        for (int i = 0; i < phoneArray.length; i++) {
            sumPrice=sumPrice+phoneArray[i].getpPrice();
        }
        //※数据能不写死就不写死
        System.out.println(phoneArray.length+"部手机的平均价格为："+(sumPrice/phoneArray.length)+"元");
    }
}
