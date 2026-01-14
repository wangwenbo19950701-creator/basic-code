package stringdemo;

import java.util.Scanner;

public class StringDemo5 {
    /*
        键盘输入一个字符串，判断是否为对称字符串，并输出是还是不是
     */
    public static void main(String[] args) {
        isdb();
    }

    public static void isdb(){
        System.out.println("请输入字符串");
        Scanner sc = new Scanner(System.in);
        StringBuilder sb=new StringBuilder(sc.next());
        if(sb.toString().equals(sb.reverse().toString())){
            System.out.println("是对称字符串");
        }else {
            System.out.println("不是对称字符串");
        }
    }
}
