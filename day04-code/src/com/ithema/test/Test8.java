package com.ithema.test;

public class Test8 {
    public static void main(String[] args) {
        //珠穆朗玛峰的高度是8844.43米=8844430毫米，如果我有一张足够大的0.1毫米厚的纸，要对折多少次才能超过山的高度
        int count =0; //计数器，记录对折次数
        double paperWidth = 0.1; //纸张初始厚度，单位为毫米
        while (paperWidth<=8844430){ //当纸张厚度小于珠穆朗玛峰的高度时，继续对折
            count++; //对折次数加1
            paperWidth=paperWidth*2; //纸张厚度翻倍
        }
        System.out.println("对折"+count+"次后，纸的厚度超过珠穆朗玛峰的高度");
    }
}
