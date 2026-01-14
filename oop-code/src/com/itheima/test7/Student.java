package com.itheima.test7;

import java.util.Scanner;

public class Student {
    /*
        定义一个长度为3的数组，数组存储1-3名学生对象作为初始数据
        学生的学号，姓名各不相同
        学生的属性：学号 姓名 年龄
        1.再次添加一个学生对象，并在添加的时候判断学号的唯一性
        2.添加完毕后遍历所有学生信息
        3.通过id删除学生信息
            如果存在则删除，不存在则提示删除失败
        4.删除完毕后遍历所有学生信息。
        5查询数组id为“heima002”的学生，如果存在，将他的年龄+1岁
     */

    //成员变量
    private String studentName;
    private String id;
    private int studentAge;

    //无参构造
    public Student() {

    }

    //有参构造
    public Student(String id, String studentName, int studentAge) {
        this.id = id;
        this.studentName = studentName;
        if (studentAge > 5) {
            this.studentAge = studentAge;
        } else {
            System.out.println("年龄不大于5，年龄赋值失败");
        }
    }

    //setter和getter
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    //添加学生的信息方法
    public void addStudentMethod(Student[] array, Student s1) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生id");
        String id = sc.next();
        s1.setId(id);
        System.out.println("请输入学生姓名");
        sc.nextLine();//避免出现空格读取不到
        String name = sc.nextLine();
        s1.setStudentName(name);
        System.out.println("请输入学生年龄");
        int age = sc.nextInt();
        s1.setStudentAge(age);

        /*
        //判断形参数组中元素是否为null，如果是则插入学生对象
        for (int i = 0; i < array.length; i++) {
            if(array[i]==null){
                array[i]=s1;
                System.out.println("插入对象成功！");
                System.out.println("-----------------------------------------------");
                break;
            }
        }
        */

        //把s1对象赋值给array中的元素
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                //如果数组元素为空，则赋值
                array[i] = s1;
                for (int j = 0; j < array.length; j++) {
                    //判断如果ID重复，则还原数组元素为空，并输出添加失败语句
                    //因为array[j]元素的地址值和s1的地址值是不一样的，所以要用equals不能用==
                    if (j != i && array[j] != null && array[j].getId().equals(s1.getId())) {
                        array[i] = null;
                        System.out.println("学生ID重复，添加失败");
                        break;
                    }
                }
                break;
            }
        }
    }
    //删除学生方法
    public void deleteStudentMethod(Student[] array, String id) {
        boolean flag = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && id.equals(array[i].getId())) {
                array[i] = null;
                System.out.println("删除成功");
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("没有这个id的数据，请检查是否输入错误");
        }
    }
    //查询学生方法
    public void selectStudentMethod(Student [] array,String id){
        Scanner sc = new Scanner(System.in);
        boolean flag=true;
        for (int i = 0; i < array.length; i++) {
            if(array[i]!=null&&id.equals(array[i].getId())){
                flag=false;
                System.out.println("已查询到结果,是否修改信息,输入1修改，其他退出");
                int input=sc.nextInt();
                if(input==1){
                    System.out.println("修改为多少岁");
                    input=sc.nextInt();
                    array[i].setStudentAge(updateStudentAgeMethod(input));
                }else{
                    System.out.println("已退出选择");
                    break;
                }
            }
        }
        if(flag){
            System.out.println("没有这个ID");
        }
    }

    //修改学生年龄
    public int updateStudentAgeMethod(int input){
        return input;
    }
}
