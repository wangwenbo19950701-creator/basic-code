package stringdemo;

import java.util.Scanner;

public class StringDemo6 {
    /*
        手机号中间4位屏蔽
        例：17642060474 → 176****0474
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入13位手机号");
        String input = sc.next();
        System.out.println(telNumPassword(input));
    }

    //对手机号进行加密处理
    public static String telNumPassword(String telNum){
        StringBuilder sb=new StringBuilder(telNum);
        return sb.replace(3,6,"****").toString();
    }
}
