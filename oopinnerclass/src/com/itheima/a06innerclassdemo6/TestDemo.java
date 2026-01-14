package com.itheima.a06innerclassdemo6;

public class TestDemo {
    /*
        匿名内部类：就是一个没有名字的类（实际上有名字：外部类类名$匿名内部类名 只不过不需要我们自己起）

        语法 new 接口名/父类名(){
            @Override
            重写的方法
        };

        注意：
        1.匿名内部类中有继承/实现关系，必须有方法重写，而且有创建对象这三个操作
        2.匿名内部类创建的对象可以直接点自己的方法
            new 接口名/父类名(){
                @Override
                重写的方法
            }.方法名;
        3.匿名内部类可以当成一个值 赋值给自己父类的对象的变量

            父类类型 变量名= new 接口名/父类名(){
                                @Override
                                重写的方法
                            };
        4.使用场景：当一个类或者接口只使用一次，就可以用内部类传递接口或父类的对象实现接口多态，而不需要特意定义一个类，从而简化代码
     */
    public static void main(String[] args) {
        //使用接口多态的形式创建对象并接收参数
        Swim s = new Swim() {
            @Override
            public void swim() {
                System.out.println("蛙泳");
            }
        };

        s.swim();

        //继承也一样
        Animal a = new Animal() {
            @Override
            public void eat() {
                System.out.println("狗吃骨头");
            }
        };
        a.eat();

        //直接输出也可以
        new Swim(){
            @Override
            public void swim(){
                System.out.println("蝶泳");
            }
        }.swim();
    }
}
