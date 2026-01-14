package com.itheima.sort;

import java.util.Random;
import java.util.Scanner;

public class RecursionSortTestDemo {
    /*
        递归：递归算法就是不断重复的调用自己，把一个大问题简化成多个小问题的方法。
            例如方法中再次调用本方法

        注意：使用递归算法时必须要写递归结束条件，如果不写就会一直调用下去直到栈内存被撑爆

        练习：假设现在有n级楼梯，一次可以上两级或一级，问最少需要几步才能登顶
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入台阶数");
        //设置台阶数
        int num = Integer.parseInt(sc.nextLine()) ;
        //步数
        int step=0;
        int i = countSteps(num,step);
        System.out.println("上 "+num+" 级楼梯需要 "+i+"步");
    }

    //递归计算步数方法
    public static int countSteps(int num,int step){
        //计数器，记录需要的步数
        int count = step;
        //递归结束条件
        if(num-1<=1){
            return count+1;
        }
        //如果结束条件不成立，则步数+1
        count++;
        //用剩余的楼梯级数和目前的步数继续带入计算方法，直到得出最终的步数
        return countSteps(num-2,count);
    }
}
