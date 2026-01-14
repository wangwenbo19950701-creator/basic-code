package com.itheima.test;

import java.util.Scanner;

public class Test5 {
    /*
        卖机票
        需求：1.机票价格按照淡季，旺季，头等舱，经济舱来收费，输入机票原价，月份，头等舱或经济舱
             2.按照如下规则计算机票价格：
                旺季5-10月：头等舱9折，经济舱8.5折
                淡季11月-来年4月：头等舱7折，经济舱6.5折
     */
    public static void main(String[] args) {
        double ticketPrice=getTicketPrice();
        System.out.println("机票价格为："+Math.round((ticketPrice)));
    }

    public static double getTicketPrice(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价：");
        double ticketPrice= sc.nextDouble();
        System.out.println("请输入月份");
        int month=sc.nextInt();
        System.out.println("请输入舱位代号：1.头等舱 2.经济舱");
        int type=sc.nextInt();

        if(month>=5 && month<=10){
            if(type==1){
                ticketPrice=ticketPrice*0.9;
            }else{
                ticketPrice=ticketPrice*0.85;
            }
        }else{
            if(type==1){
                ticketPrice=ticketPrice*0.7;
            }else{
                ticketPrice=ticketPrice*0.65;
            }
        }
        return ticketPrice;
    }
}
