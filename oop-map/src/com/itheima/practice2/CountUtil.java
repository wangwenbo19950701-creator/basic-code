package com.itheima.practice2;

import java.time.temporal.Temporal;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class CountUtil {
    private CountUtil() {

    }

    //遍历方法
    public static void traversal(HashMap hashMap) {
        Set<Student> set = hashMap.keySet();
        //使用增强for循环遍历
        for (Student student : set) {
            System.out.println(student.toString() + " 选票结果是：" + hashMap.get(student));
        }
    }

    //统计选票结果方法
    public static String countResult(HashMap hashMap) {
        //创建一个双列集合保存景点和景点得票数并初始化内容
        HashMap<String,Integer> result = new HashMap<>();
        result.put("A",0);
        result.put("B",0);
        result.put("C",0);
        result.put("D",0);
        Set<Student> set = hashMap.keySet();
        for(Student s : set){
            String s1= (String) hashMap.get(s);
            switch (s1){
                case "A"-> {
                    Integer integer = result.get("A");
                    integer = integer + 1;
                    result.put("A",integer);
                }
                case "B"-> {
                    Integer integer = result.get("B");
                    integer = integer + 1;
                    result.put("B",integer);
                }
                case "C"-> {
                    Integer integer = result.get("C");
                    integer = integer + 1;
                    result.put("C",integer);
                }
                case "D"-> {
                    Integer integer = result.get("D");
                    integer = integer + 1;
                    result.put("D",integer);
                }
            }
        }
        //打印票数
        System.out.println(result.entrySet());
        String s =  compare(result);
        return s;
    }

    //判断得票数最高的景点，要考虑票数相同的情况
    private static String compare(HashMap<String,Integer> hashMap){
        //先遍历出最大值，再看哪个景点票数与最大值相等就可以了
        Integer max = 0;
        String result="得票数最高的是：";
        //求最大值
        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            if(entry.getValue()>=max){
                max = entry.getValue();
            }
        }

        //看哪个值等于最大值
        for (Map.Entry<String, Integer> entry : entries) {
            if(entry.getValue()==max){
                result=result+entry.getKey();
            }
        }
        return result;
    }
}
