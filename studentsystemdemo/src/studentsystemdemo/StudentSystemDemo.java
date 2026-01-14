package studentsystemdemo;

import java.util.ArrayList;

public class StudentSystemDemo {
    /*
        做一个控制台端的学生登录系统
        要求
      已完成1.需要有增加学生，删除学生，修改学生，查询学生，退出程序五个功能，代号分别为1，2，3，4，0
      已完成2.学生类的学生属性：ID 姓名 年龄 家庭住址
      已完成3.操作添加功能时需要保证学生ID唯一
      已完成4.操作删除功能需要用学生ID，存在则删除，不存在则提示不存在并返回菜单
      已完成5.操作修改功能需要用学生ID，存在则继续输入学生信息，不存在则提示不存在并返回菜单
      已完成6.操作查询功能如果学生存在则打印所有学生信息，不存在则提示当前无此学生，请添加之后再查询
     */
    public static void main(String[] args) {
        //创建用于存储学生对象的集合
        ArrayList<Student> students = new ArrayList<>();
        //初始登陆界面（中文）
        MainMenu.mainMenuChinese(students);

    }

}
