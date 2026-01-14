package com.itheima.extendpractice;

public class Character extends LivingCreature{
    //角色类子类继承生物类父类
    /*
        到底什么东西被继承了，什么东西没有被继承
        1.子类不能继承父类的构造方法，因为构造方法的方法名必须与类名一致，如果真的继承了构造方法会违背这个原则
        2.子类可以继承父类的所有成员变量，只是静态变量不可以直接拿来使用，而是得用setter和getter的方法获取
        3.子类可以继承父类的虚方法，其他方法不能被继承

        虚方法表：继承的时候存在的一张“表”，里面存储的是虚方法
        怎么判断是否为虚方法
        1.方法没有被private修饰
        2.方法不是静态的（没有被static修饰）
        3.没有被final修饰

        以上三条满足方法就会记录到虚方法表中，方便在子类调用虚方法的时候，不需要一级一级找，提高了程序效率
     */

    private int charAttack;//角色的攻击力
    private int charDefence;//角色的防御力
    private int charSpeed;//角色的速度
    private int charCrital;//角色的暴击率

    //构造方法
    public Character() {
    }

    public Character(String name, int life, String status, int charAttack, int charDefence, int charSpeed, int charCrital) {
        super(name, life, status);
        this.charAttack = charAttack;
        this.charDefence = charDefence;
        this.charSpeed = charSpeed;
        this.charCrital = charCrital;
    }

    //setter和getter

    public int getCharAttack() {
        return charAttack;
    }

    public void setCharAttack(int charAttack) {
        this.charAttack = charAttack;
    }

    public int getCharDefence() {
        return charDefence;
    }

    public void setCharDefence(int charDefence) {
        this.charDefence = charDefence;
    }

    public int getCharSpeed() {
        return charSpeed;
    }

    public void setCharSpeed(int charSpeed) {
        this.charSpeed = charSpeed;
    }

    public int getCharCrital() {
        return charCrital;
    }

    public void setCharCrital(int charCrital) {
        this.charCrital = charCrital;
    }

    public void useSkill(String name){
        System.out.println(name+"使用技能");
    }
}
