package stringdemo;

import java.util.ArrayList;
import java.util.Scanner;

public class StringDemo9 {
    /*
        金额转换成中文大写数字，并添加单位
        最大可以处理10位数字

        思路
        将数字4位4位拆开，一次摘出末尾数字并做数据处理和数据清洗
     */
    public static void main(String[] args) {
        //设定字典对照
        String[] arrayUnit1 = {"", "十", "百", "千"};
        String[] arrayUnit2 = {"万", "億", "兆", "京"};
        String[] arrayNum = {"〇", "一", "二", "三", "四", "五", "六", "七", "八", "九",};
        //Scanner sc = new Scanner(System.in);
        int inputNum = 1010100101;//sc.nextInt();
        boolean flag = true;
        StringBuilder sb1 = new StringBuilder();
        int count1 = 0;//记录数字的位数，如果位数没超过4位数时可以作为4位数以下的添加单位使用
        int count2 = 0;//大于等于4位数并小于8位数时使用
        int count3 = 0;//大于等于8并小于12位数时使用
        int c; //取末尾位用
        int d = inputNum;
        //判断如果输入的是0，则不走循环，直接输出结果并shutdown
        if (inputNum == 0) {
            System.out.println("入力したのは〇である");
            System.out.println(sb1.append("無料になります").toString());
            flag = false;
            System.exit(0);
        }
        while (flag) {
            c = d % 10;//取末尾的一位数
            d = d / 10;//摘掉末尾一位数之后的值
            //判断变量c所在的位数
            if (c == 0) {
                //如果取出的末尾一位c等于0的话，位数count1进一并执行下一轮循环
                count1++;
                count2++;
                count3++;
                continue;
            }


            //添加单位
            if (count1 == 0) {
                //第一位非零的数字则直接拼接
                sb1.append(arrayNum[c]);
            } else if (count1 >= 1 && count1 < 4) {
                //第二位数到第四位数拼接时加“十”，“百”，“千”
                if ((arrayUnit1[count1] + arrayNum[c]).equals("十一") || (arrayUnit1[count1] + arrayNum[c]).equals("百一")) {
                    sb1.append(arrayUnit1[count1]);
                } else {
                    sb1.append(arrayUnit1[count1]).append(arrayNum[c]);
                }
            } else if (count1 >= 4 && count1 < 8) {
                //第二位数到第四位数拼接时加“十”，“百”，“千”和单位“万”
                count2 = count1 - 4;
                //检测是否包含"万"字  ->string的contains方法可以检测某一段字符串中是否包含另一个字符串
                if (sb1.toString().contains("万") == false && c != 1) {
                    //不包含万字且变量c不等于1，添加万字
                    sb1.append(arrayUnit2[0]).append(arrayUnit1[count2]).append(arrayNum[c]);
                } else if (sb1.toString().contains("万") == false && c == 1) {
                    //不包含万字且变量c等于1，添加万字，去掉一
                    sb1.append(arrayUnit2[0]).append(arrayUnit1[count2]).append(arrayNum[c]);
                    //检测是否存在“一十”：如果字符串中包含“万十一”则删除最后添加的字符，也就是“一”
                    if (sb1.toString().contains("万十一") == true|| sb1.toString().contains("万百一") == true) {
                        sb1.deleteCharAt(sb1.length() - 1);
                    }
                } else {
                    //包含万字不添加，判断有没有出现“一十一”的情况
                    if ((arrayUnit1[count2] + arrayNum[c]).equals("十一") || (arrayUnit1[count2] + arrayNum[c]).equals("百一")) {
                        sb1.append(arrayUnit1[count2]);
                    } else {
                        sb1.append(arrayUnit1[count2]).append(arrayNum[c]);
                    }
                }
            } else if (count1 >= 8 && count1 < 12) {
                //第二位数到第四位数拼接时加“十”，“百”，“千”和单位“億”
                count3 = count2 - 3;
                //检测是否包含"億"字  ->string的contains方法可以检测某一段字符串中是否包含另一个字符串
                if (sb1.toString().contains("億") == false && c != 1) {
                    //不包含万字且变量c不等于1，添加億字
                    sb1.append(arrayUnit2[1]).append(arrayUnit1[count3]).append(arrayNum[c]);
                } else if (sb1.toString().contains("億") == false && c == 1  ) {
                    //不包含万字且变量c等于1，添加億字，去掉一
                    sb1.append(arrayUnit2[1]).append(arrayUnit1[count3]).append(arrayNum[c]);
                    count2++;
                    //检测是否存在“一十”：如果字符串中包含“億十一”则删除最后添加的字符，也就是“一”
                    if (sb1.toString().contains("十一") == true) {
                        sb1.deleteCharAt(sb1.length()-1);
                    }
                }else if(sb1.toString().contains("億") == true && c != 1){
                    sb1.append(arrayUnit2[1]).append(arrayUnit1[count3 + 1]).append(arrayNum[c]);
                }
                else {
                    sb1.append(arrayUnit1[count3]).append(arrayNum[c]);
                    //包含億字不添加，判断有没有出现“一十一”的情况
                    if ((arrayUnit1[count3] + arrayNum[c]).equals("十一") || (arrayUnit1[count3] + arrayNum[c]).equals("百一")) {
                        sb1.deleteCharAt(sb1.length() - 1);
                    } else {
                        break;
                    }
                }
            } else {
                //超过10位数直接break;
                break;
            }
            //变量d如果为0，则结束循环，输出结果
            if (d == 0) {
                break;
            }
            count1++;
        }
        System.out.println(sb1.reverse().toString() + "円になります");
    }

}
