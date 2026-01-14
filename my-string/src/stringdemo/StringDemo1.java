package stringdemo;

import java.util.Scanner;

public class StringDemo1 {
    /*
        已知正确的用户名密码，模拟用户登录
        要求有根据相应的操作有相应的提示
     */
    public static void main(String[] args) {
        String correctUserName = new String("wang");
        String correctPassword = new String("123456");
        Scanner sc = new Scanner(System.in);
        int count = 3;//初始化输入错误次数
        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入用户名");
            String inputUserName = sc.next();
            System.out.println("请输入用户名");
            String inputPassword = sc.next();
            if (inputUserName.equals(correctUserName) &&inputPassword.equals(correctPassword)) {
                System.out.println("用户校验成功，正在登录");
                System.out.println("登陆成功");
                count = 3;//重置登陆失败次数
                break;
            } else {
                count=count-1;
                if(count!=0){
                    System.out.println("用户校验失败，错误，还剩 " + count + "次机会");
                }else {
                    System.out.println("用户已被锁定");
                }
            }

        }
    }
}
