package com.itheima.set;

import java.util.HashSet;
import java.util.Iterator;
public class HashSetTestDemo2 {
    /*
        使用hashSet去重学生信息
        只要学生的属性值是一样的那么就认为是同一个人

        思路：需要在Javabean类中重写Object的equals和hashcode方法
        如果不重写，在往set系列集合中添加数据时会默认调用Object中的equals来比较地址值，
        这也就不能满足数据的去重了
        我们重写equals的目的是只要对象属性一致，就认为是同一个数据，然后用自己重写的hashcode方法来生成hashcode
        这样只要判定相同，同一个属性生成的hashcode也就会相同，这样Set集合就不会添加这个相同的数据了
     */
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan",16);
        Student s2 = new Student("lisi",18);
        Student s3 = new Student("wangwu",16);
        Student s4 = new Student("zhangsan",16);

        HashSet <Student> studentHashSet = new HashSet<>();
        studentHashSet.add(s1);
        studentHashSet.add(s2);
        studentHashSet.add(s3);
        studentHashSet.add(s4);

        Iterator<Student> iterator = studentHashSet.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
