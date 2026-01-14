package com.itheima.codeblockdemo1;

import java.util.ArrayList;

public class Test {
    /*
        代码块：使用{}来包裹的代码

        代码块分为
        1.局部代码块：写在方法里的代码块，目前已淘汰
        2.构造代码块：写在成员变量位置的代码块，一旦创建对象，优先于创建对象执行的代码块，因为不够灵活，也被淘汰
        3.静态代码块：在代码块前面加上static关键字，随着类的加载而执行，只能执行一次，一般用于数据的初始化，写在main方法的上面

     */

    //main方法是static修饰的，而static修饰的东西只能访问static，所以集合students也要用static
    static ArrayList<Student> students = new ArrayList<>();

    static {
        Student s1 = new Student("wang", 25);
        students.add(s1);
    }
    /*
        为什么要这样写，而不把上面这段代码放到main方法里面？
        原因：main方法也是可以被调用的，一旦放到main方法里面会出现多次调用多次添加的情况，浪费内存，
            这样做代码只会添加一次，目的是防止这种情况
     */

    public static void main(String[] args) {
        //遍历集合或数组的新写法：for(接收集合或数组类型的变量:集合名或数组名){循环体}
        //大括号可以省略
        for(Student a:students)
            System.out.println(a.getName());

    }
}
