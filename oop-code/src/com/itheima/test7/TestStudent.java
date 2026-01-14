package com.itheima.test7;

import java.util.Scanner;

public class TestStudent {
    /*
        定义一个长度为3的数组，数组存储1-3名学生对象作为初始数据
        学生的学号，姓名各不相同
        学生的属性：学号 姓名 年龄
        1.再次添加一个学生对象，并在添加的时候判断学号的唯一性--------------------√
        2.添加完毕后遍历所有学生信息-------------------------------------------√
        3.通过id删除学生信息--------------------------------------------------√
            如果存在则删除，不存在则提示删除失败
        4.删除完毕后遍历所有学生信息。-----------------------------------------√
        5查询数组id为“heima002”的学生，如果存在，将他的年龄+1岁-----------------√
     */
    public static void main(String[] args) {
        //创建一个长度为3的数组
        Student [] studentArray= new Student[3];
        //插入一条初始数据
        Student s2 = new Student("heima001","WANG WENBO",29);
        studentArray[0]=s2;

        //添加两个学生
        Student s1= new Student();
        s1.addStudentMethod(studentArray,s1);
        Student s3 = new Student();
        s3.addStudentMethod(studentArray,s3);

        //遍历数组
        for (int i = 0; i < studentArray.length; i++) {
            if(studentArray[i]!=null){
                System.out.println("学生ID："+studentArray[i].getId()+"  学生姓名："+studentArray[i].getStudentName()+"  学生年龄"+studentArray[i].getStudentAge());
            }
        }
        //删除数据
        s1.deleteStudentMethod(studentArray,"heima002");
        //再次遍历数组
        for (int i = 0; i < studentArray.length; i++) {
            if(studentArray[i]!=null){
                System.out.println("学生ID："+studentArray[i].getId()+"  学生姓名："+studentArray[i].getStudentName()+"  学生年龄"+studentArray[i].getStudentAge());
            }
        }

        //查询学生并修改其年龄
        s1.selectStudentMethod(studentArray,"heima001");
        //再次遍历数组
        for (int i = 0; i < studentArray.length; i++) {
            if(studentArray[i]!=null){
                System.out.println("学生ID："+studentArray[i].getId()+"  学生姓名："+studentArray[i].getStudentName()+"  学生年龄"+studentArray[i].getStudentAge());
            }
        }

    }

}
