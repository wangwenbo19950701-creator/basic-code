package com.itheima.test;

public class Charactor {
    /*
        标准的JavaBean类:
        1.名字要见名知意
        2.至少写两个构造方法（一个空参和一个全参数有参构造）
        3.为每个成员变量提供getter和setter方法,提供toString方法，如果有其他行为也要写上
        构造方法：把对象实例化，系统自动调用的方法，构造方法的名称必须与类名相同，且没有返回值，支持方法重载
        构造方法如果没在类中自定义编写的话，创建对象的时候系统会自动生成一个空参的构造方法
        如果自定义了构造方法，那系统就不会再自动生成空参构造方法
     */
    private String cName;
    private int cHealth;
    private int cDefence;
    private int cAttack;
    private int cSpeed;
    private int cCritical;
    private boolean cIsAlive;

    //空参构造
    public Charactor() {

    }

    //有参构造
    public Charactor(String cName, int cHealth, int cDefence, int cAttack, int cSpeed, int cCritical, boolean cIsAlive) {
        this.cName = cName;
        this.cHealth = cHealth;
        this.cDefence = cDefence;
        this.cAttack = cAttack;
        this.cSpeed= cSpeed;
        this.cCritical=cCritical;
        this.cIsAlive = cIsAlive;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public int getcHealth() {
        return cHealth;
    }

    public void setcHealth(int cHealth) {
        this.cHealth = cHealth;
    }

    public int getcDefence() {
        return cDefence;
    }

    public void setcDefence(int cDefence) {
        this.cDefence = cDefence;
    }

    public int getcAttack() {
        return cAttack;
    }

    public void setcAttack(int cAttack) {
        this.cAttack = cAttack;
    }

    public int getcSpeed() {
        return cSpeed;
    }

    public void setcSpeed(int cSpeed) {
        this.cSpeed = cSpeed;
    }

    public int getcCritical() {
        return cCritical;
    }

    public void setcCritical(int cCritical) {
        this.cCritical = cCritical;
    }

    public boolean iscIsAlive() {
        return cIsAlive;
    }

    public void setcIsAlive(boolean cIsAlive) {
        this.cIsAlive = cIsAlive;
    }
    //攻击行为------------------待添加
    public int playerAttack(Charactor Attacker,Charactor Defender){

        return 0;
    }

    //判断是否受击--------------待添加
    public boolean playerHit(Charactor Attacker,Charactor Defender){

        return true;
    }

    //判断是否死亡
    public boolean playerDead(int cHealth){
        if(cHealth<= 0){
            return true;
        }else{
            return false;
        }
    }
}
