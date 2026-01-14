package com.itheima.test1;

import com.itheima.test.Charactor;

import java.util.Set;

public class Character1 {
    //成员变量
    private String characterName;
    private double characterHealth;
    private double characterAtk;

    //set get方法
    public void setCharacterName(String characterName){
        this.characterName=characterName;
    }

    public String getCharacterName(){
        return characterName;
    }

    public void setCharacterHealth(double characterHealth){
        this.characterHealth=characterHealth;
    }

    public double getCharacterHealth(){
        return characterHealth;
    }

    public void setCharacterAtk(double characterAtk){
        this.characterAtk=characterAtk;
    }

    public double getCharacterAtk(){
        return characterAtk;
    }
    //空参构造
    public Character1(){

    }
    //有参构造
    public Character1(String characterName,double characterHealth,double characterAtk){
        this.characterName=characterName;
        this.characterHealth=characterHealth;
        this.characterAtk=characterAtk;
    }
    /*
    //攻击指令
    public double attack(){
        return characterAtk;
    }
    */

    //受击判断
    public void Attacked(double characterAtk){
        //受击
        this.characterHealth=this.characterHealth-characterAtk;
        //死亡判断
        if(characterHealth<=0){
            System.out.println(characterName+"死亡,"+"游戏结束");
        }else{
            System.out.println(characterName+"被击中，"+"受到了"+characterAtk+"点伤害，"+"剩余生命值"+characterHealth+'\n');
        }
    }
}
