package com.itheima.record;

public record Student(String name,int id, String[] hobby) {
    /*
        record类型的类
        特点：比传统的代码简洁
        1.record类型的类的权限修饰符只能是public或什么都不写。因为这个类型是final修饰的，所以不可以被继承
          虽然不可以被继承，但是record还是可以实现接口的
          record自己默认继承Record类（不需要自己写extends）
        2.record类型的类中不能声明非static修饰的成员变量
        3.record类型的类会自动生成一个全部参数的构造方法
          虽然也支持自己写一个全部参数的构造方法（一定要是全部参数的，少一个都不行）
          但是方法体也得是传统类型的this.XX=XX;
        4.record类型的类中的成员变量是final修饰的，所以不可以修改
        5.record类型的类会自动重写toString，equals，hashcode等常用方法
        6.record类型的类会自动生成和入参名字完全一样的“getter”方法，如入参中的name的getter就叫name(){}
          当然也可以自己写，自己写了之后系统就不会再自己生成了，但是方法得是传统的getter的样子，方法体可以随便写
          注意：如果继承的接口中有跟record的“getter”方法同名的，就算接口中的方法是default修饰的，java也会去校验
                接口中方法的返回值和record默认生成的返回值是否一致，不一致会抛出异常，编译不会报错

        record中可以写的东西：
        1.构造方法（全参数的，空参构造需要在方法体中调用全参构造方法直接赋值）
        2.静态的成员变量
        3.静态代码块
        4.成员方法
        5.内部类和内部接口
     */

    /*
        3.record类型的类会自动生成一个全部参数的构造方法
        虽然也支持自己写一个全部参数的构造方法（一定要是全部参数的，少一个都不行）
        但是方法体也得是传统类型的this.XX=XX;
    */
    public Student(String name,int id, String[] hobby){
        this.name=name;
        this.id=id;
        this.hobby=hobby;
    }

    private class Test2{

    }
    //或者使用空参构造，方法体中直接调用本类的全部参数构造方法直接赋值（不推荐）
//    public Student(){
//        this("123",1,new String[]{"1"});
//    }

}
