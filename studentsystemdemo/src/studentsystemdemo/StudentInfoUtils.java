package studentsystemdemo;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentInfoUtils {
    //添加学生信息的工具类
    private StudentInfoUtils() {

    }

    /*
        中文菜单添加学生方法
        必要参数：
        1.存储学生元素的集合
        2.输入错误次数
     */
    public static ArrayList<Student> addStudentCh(ArrayList<Student> students, int countMistake) {
        System.out.println("请输入学生id，格式：2025+js+学生编号");
        System.out.println("----------------------------------------------------");
        Scanner sc = new Scanner(System.in);
        //用于id不唯一还想再次输入时调用addStudenCh的入参和全部输入正确时的出参
        ArrayList<Student> studentsDefault = students;
        //用于用于id不唯一还想再次输入时调用addStudenCh的入参---暂不开启参数
        //int countMistakeDefault = countMistake;
        //创建布尔变量用于接受核对ID后的值
        boolean idFlag;
        //创建一个学生对象
        Student s1 = new Student();
        //接收学生ID，名字，住址
        String input = sc.next();
        //接受学生的年龄
        int studentAge = 0;
        loopAdd:
        while (true) {
            //核对学生id是否唯一
            idFlag = idIsOnly(students, input);
            if (idFlag) {
                //插入学生ID
                s1.setStudentId(input);
                System.out.println("学生id插入成功");
                System.out.println("----------------------------------------------------");
                //插入学生名字
                System.out.println("请输入学生名字");
                input = sc.next();
                s1.setStudentName(input);
                System.out.println("学生名字插入成功");
                System.out.println("----------------------------------------------------");
                //插入学生住址
                System.out.println("请输入学生住址");
                input = sc.next();
                s1.setStudentAddress(input);
                System.out.println("学生住址插入成功");
                System.out.println("----------------------------------------------------");
                //插入学生年龄
                System.out.println("请输入学生年龄，年龄区间不在6到30之间会被判定数据不合法，系统会强制改成18岁");
                studentAge = sc.nextInt();
                sc.nextLine();
                //判断年龄数据是否符合常识,超出范围自动变成18岁
                if (studentAge > 6 && studentAge < 30) {
                    s1.setStudentAge(studentAge);
                    System.out.println("学生年龄插入成功");
                    break loopAdd;
                } else {
                    s1.setStudentAge(18);
                    System.out.println("输入年龄的数据不合法，已自动修改为18岁");
                    break loopAdd;
                }
            } else {
                System.out.println("输入的id：" + input + "不唯一");
                System.out.println("1.重新输入");
                System.out.println("0.返回菜单");
                System.out.println("----------------------------------------------------");
                input = sc.next();
                switch (input) {
                    case "1" -> {
                        //重新输入id，然后开始新一轮循环
                        System.out.println("----------------------------------------------------");
                        System.out.println("您选择了重新输入");
                        System.out.println("请输入学生id，格式：2025+js+学生编号");
                        input = sc.next();
                        continue loopAdd;
                    }
                    case "0" -> {
                        if (MainMenu.mainMenuChinese(students)) {
                            break loopAdd;
                        }
//                        防止内存溢出，不能这么写
//                        MainMenu.mainMenuChinese(students);
//                        break loopAdd;
                    }
                    default -> {
                        //输入错误时的判断
                        countMistake++;
                        if (countMistake < 10) {
                            System.out.println("没有这个命令，还剩 " + (10 - countMistake) + " 次输入机会");
                        } else {
                            System.out.println("输入错误次数过多，强制退出程序");
                            ForcedExit.exit();
                        }
                    }
                }
            }
        }
        studentsDefault.add(s1);
        System.out.println("学生对象添加成功");
        System.out.println("学生ID：" + s1.getStudentId() + " 学生姓名：" + s1.getStudentName() + " 学生年龄：" + s1.getStudentAge() + " 学生住址" + s1.getStudentAddress());
        return studentsDefault;
    }

    //删除学生方法
    public static void deleteStudentInfoCh(ArrayList<Student> students) {
        //先判断集合是否为空，集合为空则直接返回菜单，反之执行下面语句
        if (students.isEmpty()) {
            System.out.println("----------------------------------------------------");
            System.out.println("数据库中没有学生，请核对信息");
            System.out.println("返回菜单");
            System.out.println("----------------------------------------------------");
        } else {
            //输入指令
            Scanner sc = new Scanner(System.in);
            System.out.println("----------------------------------------------------");
            System.out.println("请输入学生id");
            String input = sc.next();
            //若集合中有输入的学生id，则flag变量变为false
            boolean flag = true;
            for (int i = 0; i < students.size(); i++) {
                if (students.get(i).getStudentId().equals(input)) {
                    students.remove(i);
                    System.out.println("id为 " + input + " 的学生已被删除");
                    System.out.println("返回菜单");
                    System.out.println("----------------------------------------------------");
                    flag = false;
                    break;
                }
            }
            //若集合中没有输入的学生id，flag的值保持为true则执行下列语句
            if (flag) {
                System.out.println("没有id为 " + input + " 这个学生,请核对信息");
                System.out.println("返回菜单");
                System.out.println("----------------------------------------------------");
            }
        }

    }

    //修改学生的方法
    public static void changeStudentInfoCh(ArrayList<Student> students,int countMistake) {
        //先判断集合是否为空，集合为空则直接返回菜单，反之执行下面语句
        if (arrayListIsEmpty(students)) {
            System.out.println("----------------------------------------------------");
            System.out.println("数据库中没有学生，请核对信息");
            System.out.println("返回菜单");
            System.out.println("----------------------------------------------------");
        } else{
            Scanner sc = new Scanner(System.in);
            System.out.println("----------------------------------------------------");
            System.out.println("请输入学生id");
            String input = sc.next();
            //若集合中有输入的学生id，则flag变量变为false
            boolean flag=true;
            //集合中存在输入的id则执行修改，否则退回菜单
            loop:
            for (int i = 0; i < students.size(); i++) {
                if (students.get(i).getStudentId().equals(input)){
                    flag=false;
                    //询问修改属性值
                    System.out.println("----------------------------------------------------");
                    System.out.println("修改学生的哪个属性值");
                    System.out.println("1.id(警告：id必须是唯一的，否则会修改失败)");
                    System.out.println("2.名字");
                    System.out.println("3.年龄");
                    System.out.println("4.住址");
                    System.out.println("0.返回主菜单");
                    System.out.println("----------------------------------------------------");
                    input=sc.next();
                    switch (input){
                        case "1" ->{
                            //执行修改学生id
                            System.out.println("请输入新的学生id");
                            input=sc.next();
                            //判断id是否唯一，条件为true，执行修改，反之提示id重复请核对信息，返回主菜单
                            if(idIsOnly(students,input)){
                                students.get(i).setStudentId(input);
                                System.out.println("学生id修改完成，返回主菜单");
                                System.out.println("----------------------------------------------------");
                                break loop;
                            }else{
                                System.out.println("输入的id：" + input + "不唯一，请核对信息");
                                System.out.println("返回主菜单");
                                System.out.println("----------------------------------------------------");
                            }
                        }
                        case "2" ->{
                            //执行修改学生姓名
                            System.out.println("请输入新的学生姓名");
                            input=sc.next();
                            students.get(i).setStudentName(input);
                            System.out.println("学生姓名修改完成，返回主菜单");
                            System.out.println("----------------------------------------------------");
                            break loop;
                        }
                        case "3" ->{
                            //执行修改学生年龄
                            //插入学生年龄
                            System.out.println("请输入新的学生年龄，年龄区间不在6到30之间会被判定数据不合法，系统会强制改成18岁");
                            int studentAge = sc.nextInt();
                            sc.nextLine();
                            //判断年龄数据是否符合常识,超出范围自动变成18岁
                            if (studentAge > 6 && studentAge < 30) {
                                students.get(i).setStudentAge(studentAge);
                                System.out.println("学生年龄插入成功");
                                break loop;
                            } else {
                                students.get(i).setStudentAge(18);
                                System.out.println("输入年龄的数据不合法，已自动修改为18岁");
                                break loop;
                            }
                        }
                        case "4" ->{
                            //执行修改学生地址
                            System.out.println("请输入新的学生地址");
                            input=sc.next();
                            students.get(i).setStudentAddress(input);
                            System.out.println("学生地址修改完成，返回主菜单");
                            System.out.println("----------------------------------------------------");
                            break loop;
                        }
                        case "0" ->{
                            //执行返回操作
                            System.out.println("返回主菜单");
                            break loop;
                        }
                        default ->{
                            //输入错误时的判断
                            countMistake++;
                            if (countMistake < 10) {
                                System.out.println("没有这个命令，还剩 " + (10 - countMistake) + " 次输入机会");
                            } else {
                                System.out.println("输入错误次数过多，强制退出程序");
                                ForcedExit.exit();
                            }
                        }
                    }
                }
            }

            if (flag){
                System.out.println("没有id为 " + input + " 这个学生,请核对信息");
                System.out.println("返回菜单");
                System.out.println("----------------------------------------------------");
            }
        }
    }


    /*
       根据id查询某个学生信息的方法
       必要参数
       1.存储所有学生的集合
       2.输入要查询的学生id
    */
    public static void showStudentInfoCh(ArrayList<Student> students) {
        //输入学生id
        System.out.println("请输入学生id");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        //定义布尔变量flag，默认为true，如果找到学生信息则变为false
        boolean flag = true;
        //如果根据id找到了学生，则控制台打印学生信息
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentId().equals(s1)) {
                flag = false;
                System.out.println("----------------------------------------------------");
                System.out.println("查找了id为 " + s1 + " 的学生");
                System.out.println("学生信息如下：");
                System.out.println("id: " + students.get(i).getStudentId() + " 学生姓名： " + students.get(i).getStudentName() + " 学生年龄：" + students.get(i).getStudentAge() + "学生住址：" + students.get(i).getStudentAddress());
                System.out.println("----------------------------------------------------");
                System.out.println("已返回主菜单");
                break;
            }
        }

        //找不到学生信息的情况返回找不到，然后退回主界面
        if (flag) {
            System.out.println("----------------------------------------------------");
            System.out.println("根据" + s1 + "这个id没有找到学生，请核对id之后再查询");
            System.out.println("----------------------------------------------------");
            System.out.println("已返回主菜单");
        }
    }

    //查询并显示所有学生信息方法
    public static void showALLStudentInfoCh(ArrayList<Student> students) {
        if (students.isEmpty()) {
            System.out.println("----------------------------------------------------");
            System.out.println("数据库中没有存储任何学生，返回菜单");
            System.out.println("----------------------------------------------------");
        } else {
            System.out.println("----------------------------------------------------");
            System.out.println("id\t学生姓名\t学生年龄\t学生住址\t");
            for (int i = 0; i < students.size(); i++) {
                System.out.println(students.get(i).getStudentId() + "\t" + students.get(i).getStudentName() + "\t" + students.get(i).getStudentAge() + "\t" + students.get(i).getStudentAddress());
            }
            System.out.println("----------------------------------------------------");
            System.out.println("共有" + students.size() + "条数据");
            System.out.println("返回菜单");
            System.out.println("----------------------------------------------------");
        }

    }


    /*
        English
     */
//    public static ArrayList<Student> addStudentEn(ArrayList<Student> students){
//        return ;
//    }
    /*
        日本語
     */

//    public static ArrayList<Student> addStudentJap(ArrayList<Student> students){
//
//    }


    /*判断学生id是否唯一方法
        必要参数：
        1.存储所有学生信息的集合
        2.输入的学生id
     */
    public static boolean idIsOnly(ArrayList<Student> students, String id) {
        //声明布尔变量id用于返回数据
        boolean idFlag = true;
        //判断如果集合为空则直接返回true
        if (students.isEmpty()) {
            return idFlag;
        }
        //遍历集合核对输入的id的唯一性
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentId().equals(id)) {
                idFlag = false;
                break;
            }
        }
        return idFlag;
    }

    //判断集合是否为空
    public static boolean arrayListIsEmpty(ArrayList<Student> students) {
        boolean flag = false;
        if (students.isEmpty()) {
            flag = true;
        }
        return flag;
    }
}
