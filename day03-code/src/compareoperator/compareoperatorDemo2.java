package compareoperator;

import java.util.Scanner;

public class compareoperatorDemo2 {
    public static void main(String[] args) {
        //键盘输入两个整数，第一个数字代表自己的时髦程度，第二个数字代表对方的时髦程度
        //若自己的数字大于对方，则相亲成功，返回true，反之失败，返回false
        //数字区间在（1~10）
        Scanner s = new Scanner(System.in);;
        System.out.println("请输入我的时髦程度：");
        int me = s.nextInt();//输入我的时髦程度
        System.out.println("请输入对方的时髦程度：");
        int you = s.nextInt();//输入对方的时髦程度
        if (me > you){
            System.out.println(true);
            System.out.println("相亲成功");
        }else {
            System.out.println(false);
            System.out.println("相亲失败");
        }
    }
}
