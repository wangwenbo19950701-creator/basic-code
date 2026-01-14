package com.itheima.object;

import com.google.gson.Gson;

public class ObjectTestDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        /*
            Object类是所有javabean类的默认继承的顶级父类

            常用方法：
            toString():默认打印的是对象的地址值，一般这个方法要重写到javabean类中，用来输出对象的属性值
            equals():默认比较调用者和入参对象的地址值，一般这个方法要重写到javabean类中，用来比较对象的属性值是否相等
                    注意：如果此方法被重写，那也必须要重写hashcode方法，不然可能会违反java后台对地址判断的逻辑
            clone():对象克隆，不能直接调用此方法，需要先实现cloneable的接口，再重写object中的clone方法才能用
                    注意：这个方法只能实现浅克隆，所谓浅克隆就是不管对象是基础数据类型还是引用数据类型，直接带入
                    这样一旦引用数据类型（如数组）内部元素发生改变，所有的克隆对象都会被改变
         */
        User u1 = new User("zhangsan", 1, new int[]{1, 2, 3});
        User u2 = (User) u1.clone();
//        toString():默认打印的是对象的地址值，一般这个方法要重写到javabean类中，用来输出对象的属性值
        System.out.println(u1.toString());


//        clone():对象克隆，不能直接调用此方法，需要先实现cloneable的接口，再重写object中的clone方法才能用
//                    注意：这个方法只能实现浅克隆，所谓浅克隆就是不管对象是基础数据类型还是引用数据类型，直接带入
//                    这样一旦引用数据类型（如数组）内部元素发生改变，所有的克隆对象都会被改变
//        u1.setId(3);//给对象u1的id修改成3
//        u1.getData()[0]=100;//给u1对象数组的0索引元素修改成100
//        System.out.println(u1.getId());//3
//        System.out.println(u1.getData()[0]);//100
//        System.out.println(u2.getId());//u2对象的id没有变成3
//        System.out.println(u2.getData()[0]);//u2对象的数组中0索引的元素也变成100

//        为了解决这个问题，以后对象克隆的时候要用Gson来做，把gson的jar包导入开发工具就可以开始拷贝了
//        第一步创建gson的对象
        Gson gson = new Gson();
//        把要被复制的源对象转化成json字符串赋值给s
        String s = gson.toJson(u1);
        System.out.println(s);
//        将字符串转化回对应的对象，注意第二个入参是类名.class
        u2= gson.fromJson(s,User.class);
//        此时如果再改变u1对象的任何属性，u2都不会收到影响
        System.out.println(u1.equals(u2));

        u1.setId(3);//给对象u1的id修改成3
        u1.getData()[0]=100;//给u1对象数组的0索引元素修改成100
        System.out.println(u1.getId());//3
        System.out.println(u1.getData()[0]);//100
        System.out.println(u2.getId());//1
        System.out.println(u2.getData()[0]);//1

    }
}
