package com.itheima.a01ooppolymorphismdemo1;

public class TestJava {
    /*
        多态就是对象的多种形态

        使用条件
        1.必须有继承/实现关系
        2.必须有父类引用指向子类的对象 (使用父类创建子类的对象)
        3.必须有方法的重写

        使用多态调用成员变量和成员方法的特点
        1.使用多态调用成员变量时，编译看左边，运行也看左边
        2.使用多态调用成员方法时，编译看左边，运行要看右边

        多态的优势
        1.可以是代码变得更加易于维护
        2.使用父类作为参数类型，可以接收所有继承父类的子类的对象

        多态的弊端
        1.不能调用子类特有的方法（因为多态在编译的时候先看左面父类对象是否有这个方法，肯定是没有的，所以编译直接报错）
            解决方案：使用强制转换的方法把父类对象转换成子类对象就能解决
     */

    public static void main(String[] args) {
        //使用父类Animal创建Dog的子类对象
        Animal a = new Cat();
        //验证多态调用成员变量时，编译看左边，运行也看左边
        //编译时要看左边的a有没有name成员变量，没有就编译错误，有的话就输出Animal类型a的name成员变量的值
        System.out.println(a.name);//运行结果为“动物”
        //验证多态调用成员方法时，编译看左边，运行要看右边
        //编译时要看左边有没有show方法，没有就编译错误，有的话就要用a所代表的Cat类的show方法
        a.show();//运行结果是 "猫----show方法"
        /*多态的弊端演示
            不能调用子类特有的方法，解决方案是用强制转换的方式把父类对象变成子类对象就可以了
            转换类型的时候，不能瞎转，例如本来a对象是Dog类型，强转的时候写成Cat c = (Cat) a; 这么写会报ClassCastException类转换错误
         */
        //错误写法a.lookHome();
        //Dog d = (Dog) a;//强转
        //d.lookHome();//调用特有方法

        //遇到上述情况可以写个if判断  使用instanceof关键字判断变量所记录的类型，语法是 对象名 instanceof 对象类型 返回值时boolean

//        if(a instanceof Dog){
//            //变量a所存储的对象是Dog的话把a强转成Dog，这样就可以调用Dog的独有方法了
//            Dog d = (Dog)a;
//            d.lookHome();
//        }else if(a instanceof Cat){
//            //同上
//            Cat c = (Cat)a;
//            c.eat();
//        }

        /*
            JDK14之后的新特性
        if(a instanceof Dog d){
            //先判断a是否存储的是Dog对象，是的话直接把a强转成Dog，并调用独有方法，
            //相较于上面的写法，此写法省略了自己写强转的代码
            d.lookHome();
        }else if(a instanceof Cat c){
            //同上
            c.eat();
        }
         */

    }
}
