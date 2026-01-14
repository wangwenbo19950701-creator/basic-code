package stringdemo;

import java.util.Scanner;

public class StringDemo4 {
    /*
        键盘输入一个字符串，反转此字符串并控制台打印
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.next();
        System.out.println(翻转(s));
    }

    public static String 翻转(String s){
        StringBuilder sb=new StringBuilder();
        sb.append(s);
        sb.reverse();
        String newString=sb.toString();
        return newString;
    }

}
