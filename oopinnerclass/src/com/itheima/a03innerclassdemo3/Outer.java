package com.itheima.a03innerclassdemo3;

public class Outer {
    int a = 10;
    class inner{
        int a = 20;
        public void show(){
            int a =30;
            //怎么让下面三个输出语句按照注释的结果输出

            /*
                在创建对象的时候因为是用Outer.inner O1= new Outer().new inner();创建的，
                当new inner()被执行的时候额外记录一个外部类地址值
                也就是说此时堆内存里的inner对象里面记录了一个int a=20和一个outer.this（外部类的地址值）
                所以如果要输出10，就要用outer.this来找到外部类的地址，从而使用外部类的成员变量a
             */
            System.out.println(Outer.this.a);//10
            //因为a=20在方法里没有，要去他所在的方法里找有没有a=20，所以要用this.a
            System.out.println(this.a);//20
            //就近原则，直接写a
            System.out.println(a);//30
        }
    }
}
