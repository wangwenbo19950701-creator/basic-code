package com.itheima.a01innerclassdemo1;

public class TestDemo {
    /*
        内部类：当某个事物中的某个属性不属于这个事物本身，且单独存在毫无意义时，就可以把这种属性封装成为内部类

        注意：
        1.内部类可以直接访问外部类的成员变量，包括私有的成员变量，
          而外部类不能直接访问内部类的成员变量，需要创建内部类的对象才可以
          访问方式：①外部类编写方法，对外提供内部类的对象 ②直接用外部类类名.内部类类名.对象名=new 外部类类名().new 内部类类名();创建
        2.内部类不能访问外部类的成员方法，外部类也不能访问内部类的成员方法
     */

    public static void main(String[] args) {
        Car c1 = new Car("奥拓",1000000);
        c1.show();
        Car.Engine e =  c1.new Engine("双钻",200000);
        e.show();
    }
}
