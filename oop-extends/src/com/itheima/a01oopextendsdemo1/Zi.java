package com.itheima.a01oopextendsdemo1;

public class Zi extends Fu{
    String name = "Zi";
    public Zi(){

    }
    @Override
    public void show(){
        String name = "子类成员方法内部的Zi";
        //当父类和子类有同样的参数名称时，直接带入参数名称则触发就近原则
        //想显示子类的参数要用this关键字
        //如果想显示父类的参数名称就要用到super关键字
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
