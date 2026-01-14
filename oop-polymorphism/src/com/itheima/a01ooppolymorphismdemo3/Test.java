package com.itheima.a01ooppolymorphismdemo3;

public class Test {
    public static void main(String... args) {
        B b = new C();
        b.show();
        System.out.println(b.name);

        A a = new B();
        a.show();

    }
}
