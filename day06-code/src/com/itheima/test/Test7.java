package com.itheima.test;

import java.util.Random;

public class Test7 {
    /*
        定义一个随机验证码
        1.五位
        2.前四位a-z或A-Z 后一位是数字
     */
    public static void main(String[] args) {
        String[] azAZ = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String[] num = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        System.out.println(getRandomCode(azAZ,num));
    }

    /*
        遇到的问题：
        1.把count写在了循环里导致每次循环count的值被清除，正确的做法是写在循环外
        2.也可以使用StringBuilder这个类中的append方法和tostring方法来做这个题
            ①：append(获取的字符或字符串)将指定的字符串追加到此字符序列
            ②：toString()将此序列转换为字符串并返回

     */
    public static void getRandomCode() {
        String[] azAZ = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String[] num = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] newRandomCode = new String[5];
        Random r = new Random();
        int count = 0;
        for (int i = 0; i <= 4; i++) {
            if (i <= 3) {
                int randomNum = r.nextInt(52);
                newRandomCode[count] = azAZ[randomNum];
            } else {
                int randomNum = r.nextInt(10);
                newRandomCode[count] = num[randomNum];
            }
            count = count + 1;
        }
        //遍历新数组
        for (int i = 0; i < 5; i++) {
            System.out.print(newRandomCode[i]);
        }
    }

    //使用Stringbuilder来写
    public static String getRandomCode(String[] firstToFouth, String[] fifth) {
        String[] azAz = firstToFouth;
        String[] num = fifth;
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i <= 4; i++) {
            if(i<= 3){
                sb.append(azAz[r.nextInt(52)]);
            }else {
                sb.append(num[r.nextInt(10)]);
            }
        }
        String result=sb.toString();
        return result;
    }
}
