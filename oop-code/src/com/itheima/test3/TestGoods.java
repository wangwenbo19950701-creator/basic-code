package com.itheima.test3;

import java.util.Scanner;

public class TestGoods {
    public static void main(String[] args) {
        Goods [] goodsArray= new Goods[3];
        Scanner sc = new Scanner(System.in);
        //创建三个商品对象
        Goods g1=new Goods(001,"洗发水1L",15.0,3000);
        Goods g2=new Goods(002,"方便面",2,3000);
        Goods g3=new Goods(003,"矿泉水600ml",1,2000);

        //插入数据
        goodsArray[0]=g1;
        goodsArray[1]=g2;
        goodsArray[2]=g3;

        //验证
        for (int i = 0; i < goodsArray.length; i++) {
            Goods G= goodsArray[i];
            System.out.println("商品id为："+ G.getGId());
            System.out.println("商品名称为："+ G.getGName());
            System.out.println("商品价格为："+ G.getGValue()+"元");
            System.out.println("商品库存为："+ G.getGRemainAmount());
            System.out.println();
        }
    }
}
