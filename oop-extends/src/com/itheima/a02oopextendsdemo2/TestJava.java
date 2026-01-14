package com.itheima.a02oopextendsdemo2;
//如果用其他包里的类要导包，使用import关键字
import com.itheima.a01oopextendsdemo1.*;

public class TestJava {
    //方法的重写override
    /*
        当子类继承父类，使用父类的成员方法时并不能满足子类的业务需求，
        子类可以再自己的类中写一个名字和父类的那个方法一样的方法，把方法体改成自己需要的样子
        这种成为方法的重写

        注意事项
        1.重写的方法名要与父类的方法名一致，且形参也一致
        2.重写方法时，子类的访问权限要大于等于父类（空着不屑<protected<public）
        3.重写方法时，子类重写的方法的返回值要小于等于父类的方法
        4.建议重写方法的时候父类什么样子类就什么样
        5.只有能被添加到虚方法表中的方法才能被重写（非private，非static，非final）

        如果是重写的方法，那上面要加@override注解

        与重载不同的是，重载发生再同一个类中，方法名一样但是参数个，种类，顺序的至少其中一个不同
        与返回值无关
     */
    public static void main(String[] args) {
        ChineseStudent c1 = new ChineseStudent();
        c1.food="米饭";
        c1.eat();

        //其他包的类
        Zi z1 = new Zi();
        z1.show();
    }
}
