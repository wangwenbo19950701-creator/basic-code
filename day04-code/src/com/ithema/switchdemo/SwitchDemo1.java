package com.ithema.switchdemo;

import javax.swing.text.AbstractDocument;
import java.util.Scanner;

public class SwitchDemo1 {
    public static void main(String[] args) {
        //switch用法
        //switch语句结构
        /*
          switch(表达式){
            case 值1:
                语句1;
                [break;]
            case 值2:
                语句2;
                [break;]
                ...
            [default:]
                [语句n;]
                [break;]

        注意点1.switch中的default可以省略，但是不建议省略，因为如果没有任何能匹配的值，switch就会失效了
               建议最好写在switch语句的末尾增加代码阅读性
        注意点2.case穿透：case穿透是由于不写break导致的，也就是说没有break的话代码会先匹配switch中表达式的值
                         然后从匹配的值的地方一直执行下去，直到遇到break或者}
        注意点3.switch中表达式的值必须是以下几种类型：byte、short、int、char、String、枚举

        switch和if的使用场景
            if适合用于范围的判断，比如60以下不合格，60-80及格，80-90良好，90-100优秀
            switch适合用于具体的值的判断，比如1.热干面，2.五爷小面，3.炸酱面，4.四季抻面
                ps：这个用if写也可以，但是代码的阅读性还是switch更高一点
         */
        //中午吃饭吃什么，看了下菜单，武汉1.热干面，有2.五爷小面，有3.炸酱面，还有4.四季抻面
            Scanner sc = new Scanner(System.in);
            System.out.println("请选择菜单：");
            System.out.println("1.热干面");
            System.out.println("2.五爷小面");
            System.out.println("3.炸酱面");
            System.out.println("4.四季抻面");
            int menuNum = sc.nextInt();
            switch(menuNum){
                case 1:
                    System.out.println("吃热干面");
                    break;
                case 2:
                    System.out.println("吃五爷小面");
                    break;
                case 3:
                    System.out.println("吃炸酱面");
                    break;
                case 4:
                    System.out.println("吃四季抻面");
                    break;
                default:
                    System.out.println("啥也不吃了");
            }
    }
}
