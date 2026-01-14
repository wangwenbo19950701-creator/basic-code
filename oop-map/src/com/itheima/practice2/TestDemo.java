package com.itheima.practice2;

import java.util.HashMap;
import java.util.Random;

/*
    某班级80名学生，举行春游活动，班长组织了四个景点进行投票（A，B，C，D）
    每个学生只能选一个景点，统计那个景点的人数最多

    思路：双列集合存储每一个学生和投票信息
 */
public class TestDemo {
    public static void main(String[] args) {
        //创建一个双列集合保存学生和投票结果
        HashMap<Student, String> hashMap = new HashMap<>();

        //创建80个学生并添加到双列集合中
        for (int i = 1; i <= 80; i++) {
            Student student = new Student();
            student.setNumber(i);
            //创建一个随机数，使用随机数来实现投票
            Random r = new Random();
            int random = r.nextInt(4) + 1;
            String s = switch (random) {
                case 1 -> "A";
                case 2 -> "B";
                case 3 -> "C";
                case 4 -> "D";
                default -> "";
            };
            hashMap.put(student,s);
        }

        //遍历出所有学生和选票情况
//        CountUtil.traversal(hashMap);

        //算出得票最高的景点
        System.out.println(CountUtil.countResult(hashMap));
    }
}
