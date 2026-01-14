package studentsystemdemo;

import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {
    //控制主菜单显示的工具类

    /*
        工具类的特点：只用于帮助我们做一些事，不能描述任何事物
        1.成员方法必须用static修饰
        2.构造方法要私有化，因为工具类不能描述任何事物，创建工具类的对象没有任何意义
        3.调用方法：类名直接调用(推荐使用)/对象调用      语法：类名.方法名（【参数】）
            ※静态方法只能使用静态的变量或方法，不能使用非静态的变量和方法，静态方法中也没有this关键字
        4.工具类的方法必须私有化，切要加static修饰
     */

    //使用定义常量的方式来增加switch的阅读性
    /*
        常量的命名方式 一个单词全部大写，多个单词全部大写且每个单词 _ 隔开
        一般用private + final的方式来写常量
     */
    private static final String ADD_STUDENT = "1";
    private static final String DELETE_STUDENT_INFO = "2";
    private static final String CHANGE_STUDENT_INFO = "3";
    private static final String SHOW_STUDENT_INFO = "4";

    //构造方法
    private MainMenu() {

    }


    //简体中文界面
    public static boolean mainMenuChinese(ArrayList<Student> students) {
        //简体中文界面界面
        System.out.println("-----------------欢迎使用学生系统--------------------");
        System.out.println("当前语言：简体中文");
        System.out.println("输入1----添加学生");
        System.out.println("输入2----删除学生");
        System.out.println("输入3----修改学生");
        System.out.println("输入4----查询学生");
        System.out.println("输入9----更改语言/Change Language/日本語で示す");
        System.out.println("输入0----退出程序");
        System.out.println();
        System.out.println("请输入数字");
        System.out.println("----------------------------------------------------");
        System.out.println("注意：输入错误超过10次系统会强制退出，输入正确指令后错误次数刷新");
        System.out.println("----------------------------------------------------");

        //设定变量input，用于接收用户指令，设置成String类型防止接受数据时数据类型不对的问题
        String inputNum;
        //用于记录输入错误次数
        int countMistake = 0;
        //主循环loop
        loop:
        while (true) {
            Scanner sc = new Scanner(System.in);
            inputNum = sc.next();
            switch (inputNum) {
                //添加学生
                case ADD_STUDENT ->{
                    System.out.println("执行添加学生信息操作");
                    students= StudentInfoUtils.addStudentCh(students,countMistake);
                    //防止递归调用方法造成的栈溢出问题
                    if (mainMenuChinese(students)) {
                        break loop;
                    }
                    /*
                       递归调用会占用内存，重复次数多会造成内存溢出，修改为上面的方式防止此类情况发生
                       mainMenuChinese(students);
                       break loop;
                     */
                }
                //删除学生
                case DELETE_STUDENT_INFO -> {
                    System.out.println("执行删除学生信息操作");
                    StudentInfoUtils.deleteStudentInfoCh(students);
                    if(mainMenuChinese(students)){
                        break loop;
                    }
                }
                //修改学生
                case CHANGE_STUDENT_INFO -> {
                    System.out.println("执行修改学生信息操作");
                    StudentInfoUtils.changeStudentInfoCh(students,countMistake);
                    if(mainMenuChinese(students)){
                        break loop;
                    }
                }
                //查询学生
                case SHOW_STUDENT_INFO -> {
                    //循环命名loopshowStudentInfo，方便跳出循环
                    loopShowStudentInfo:
                    while (true){
                        System.out.println("执行查询学生信息操作");
                        System.out.println("----------------------------------------------------");
                        System.out.println("1.查询所有学生信息");
                        System.out.println("2.根据学生id查询学生信息");
                        System.out.println("0.返回");
                        System.out.println("----------------------------------------------------");
                        //选择查询业务
                        inputNum=sc.next();
                        //业务菜单
                        switch (inputNum){
                            case "1"-> {
                                System.out.println("您选择了查询所有学生信息");
                                System.out.println("----------------------------------------------------");
                                StudentInfoUtils.showALLStudentInfoCh(students);
                                //返回菜单
                                if (mainMenuChinese(students)) {
                                    break loopShowStudentInfo;
                                }
//                                mainMenuChinese(students);
//                                break loopShowStudentInfo;
                            }
                            case "2"-> {
                                System.out.println("您选择了根据学生id查询学生信息");
                                System.out.println("----------------------------------------------------");
                                StudentInfoUtils.showStudentInfoCh(students);
                                //返回菜单
                                if (mainMenuChinese(students)) {
                                    break loopShowStudentInfo;
                                }
//                                mainMenuChinese(students);
//                                break loopShowStudentInfo;
                            }
                            case "0"-> {
                                System.out.println("您选择了返回");
                                if (mainMenuChinese(students)) {
                                    break loopShowStudentInfo;
                                }
//                                mainMenuChinese(students);
//                                break loopShowStudentInfo;
                            }
                            default -> {
                                countMistake++;
                                if (countMistake < 10) {
                                    System.out.println("没有这个命令，还剩 " + (10 - countMistake) + " 次输入机会");
                                } else {
                                    System.out.println("输入错误次数过多，强制退出程序");
                                    ForcedExit.exit();
                                }
                                continue loopShowStudentInfo;
                            }
                        }
                    }
                }
                //更改语言
                case "9" -> {
                    loopChangeLanguage:
                    while (true) {
                        System.out.println("----------------------------------------------------");
                        System.out.println("请选择语言界面");
                        System.out.println("1.简体中文");
                        System.out.println("2.English");
                        System.out.println("3.日本語");
                        System.out.println("0.返回菜单/Previous/戻す");
                        System.out.println("请选择语言界面");
                        //接收选择语言的数字指令
                        inputNum = sc.next();
                        switch (inputNum) {
                            case "1", "0" -> {
                                //返回
                                //刷新输入错误次数
                                countMistake = 0;
                                if (mainMenuChinese(students)) {
                                    break loopChangeLanguage;
                                }
//                                MainMenu.mainMenuChinese(students);
//                                break loopChangeLanguage;
                            }
                            case "2" -> {
                                //选择别的语言菜单，跳出本语言的菜单的循环程序
                                //刷新输入错误次数
                                countMistake = 0;
                                if (mainMenuEnglish()) {
                                    break loop;
                                }
//                                MainMenu.mainMenuEnglish();
//                                break loop;
                            }
                            case "3" -> {
                                //选择别的语言菜单，跳出本语言的菜单的循环程序
                                //刷新输入错误次数
                                countMistake = 0;
                                if (mainMenuJapanese()) {
                                    break loop;
                                }
//                                MainMenu.mainMenuJapanese();
//                                break loop;
                            }
                            default -> {
                                countMistake++;
                                if (countMistake < 10) {
                                    System.out.println("没有这个命令，还剩 " + (10 - countMistake) + " 次输入机会");
                                } else {
                                    System.out.println("输入错误次数过多，强制退出程序");
                                    ForcedExit.exit();
                                }
                                continue loopChangeLanguage;
                            }
                        }
                    }
                }
                //退出程序
                case "0" -> {
                    ForcedExit.exit();
                    //break loop;
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
        return true;
    }


    //English Menu
    public static boolean mainMenuEnglish() {
        System.out.println("------Welcome to use Student Management System------");
        System.out.println("Language：English");
        System.out.println("input 1----Add student information");
        System.out.println("input 2----Delete student information");
        System.out.println("input 3----Change student information");
        System.out.println("input 4----Search student information");
        System.out.println("input 9----更改语言/Change Language/言語変更");
        System.out.println("input 0----Exit");
        System.out.println();
        System.out.println("Please enter a number");
        System.out.println("----------------------------------------------------");
        return true;
    }

    //日本語の画面
    public static boolean mainMenuJapanese() {
        System.out.println("-学生管理システムご利用くださいまして、ありがとうございます-");
        System.out.println("言語：日本語");
        System.out.println("入力 1----学生の情報を追加する");
        System.out.println("入力 2----学生の情報を削除する");
        System.out.println("入力 3----学生の情報を更新する");
        System.out.println("入力 4----学生の情報を調べる");
        System.out.println("入力 9----更改语言/Change Language/日本語で示す");
        System.out.println("入力 0----システムを退出する");
        System.out.println();
        System.out.println("数字を入力してください");
        System.out.println("----------------------------------------------------");
        return true;
    }
}
