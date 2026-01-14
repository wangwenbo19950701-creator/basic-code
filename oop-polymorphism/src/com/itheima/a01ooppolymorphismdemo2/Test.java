package com.itheima.a01ooppolymorphismdemo2;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("zhangsan");
        s.setAge(18);

        Teacher t = new Teacher();
        t.setName("lisi");
        t.setAge(30);

        showWho(s);
        showWho(t);

    }
    //多态的应用，可以把父类写成形参，这样就可以传父类和其子类的对象了，代码比较灵活
    public static void showWho(Person person){
        person.show();
    }
}
