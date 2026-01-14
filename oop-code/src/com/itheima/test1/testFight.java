package com.itheima.test1;

import java.util.Scanner;

public class testFight {
    public static void main(String[] args) {
        //生成角色1
        Character1 c1 = new Character1("佣兵",100,12);
        //生成怪物1
        Character1 c2 = new Character1("蝙蝠",24,2);
        //回合制攻击
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入指令");
        System.out.println("攻击请按1  逃跑请按2");
        //判断双方是否是以存活的状态对战
        double monster=c2.getCharacterHealth();
        for (double player = c1.getCharacterHealth();player>0&& monster>0;) {
            int orders=sc.nextInt();
            if(orders==1){
                //攻击
                c2.Attacked(c1.getCharacterAtk());
                //判断怪物是否已死亡
                if(c2.getCharacterHealth()<=0){
                    break;
                }
                //怪物攻击
                c1.Attacked(c2.getCharacterAtk());
                //判断角色是否已死亡
                if(c1.getCharacterHealth()<=0){
                    break;
                }
                System.out.println("攻击请按1  逃跑请按2");
            }else if (orders==2){
                System.out.println("玩家逃跑了");
                break;
            }else{
                System.out.println("指令错误，请重新输入");
                System.out.println("请输入指令");
                System.out.println("攻击请按1  逃跑请按2");
            }


        }
    }
}
