package practice4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Test {
    /*
     * 1.要求从文本文件中读取字符串，将所有可以变成数字的字符变成int类型
     * 2.要求每3个数字为一组，判断是否为三角形（任意两边之和大于第三边）
     * 3.要求判断是什么三角形（a，b，c三个边，假设c为长边 a²+b²=c²为直角，<为钝角，>为锐角）
     * */
    static int triangleCount = 0;//三角形总数
    static int rightTriangle = 0;//直角三角形的总数
    static int acuteTriangle = 0;//锐角三角形的总数
    static int obtuseTriangle = 0;//钝角三角形的总数

    public static void main(String[] args) throws Exception {

        //------------------------获取文件中的所有数字并封装到ArrayList集合-------------------------
        File file = new File("C:\\Users\\wwb\\IdeaProjects\\basic-code\\my-practices\\src\\practice4\\sample.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        int i;
        ArrayList<Integer> arrayList = new ArrayList<>();
        //获取文本文件的每一个字符并判断是否可以转换成数字
        try (br) {
            while ((i = br.read()) != -1) {
                String temp = String.valueOf((char)i);
                try {
                    //转换成功的就加入ArrayList数组
                    arrayList.add(Integer.parseInt(temp));
                }catch (NumberFormatException e){
                    //不能转换成数字的直接舍弃
                }

            }
        }
        //------------------------获取文件中的所有数字并封装到ArrayList集合-------------------------

        ArrayList<Integer> temp = new ArrayList<>();

        //从arrayList拿出数据，三个为一组依次判断是不是三角形，是什么三角形

        for (Integer integer : arrayList) {
            //添加元素，如果不满足三个开始下一轮循环
            temp.add(integer);
            //满足三个元素就开始判断
            if(temp.size()==3){
                CheckTriangleUtil.checkTriangle(temp);
                //判断之后清空集合
                temp.clear();
            }

        }

        //输出一共有多少个三角形，都是什么类型的三角形
        System.out.println("一共有 "+Test.triangleCount+" 个三角形");
        System.out.println("直角三角形有 "+Test.rightTriangle+" 个");
        System.out.println("锐角三角形有 "+Test.acuteTriangle+" 个");
        System.out.println("钝角三角形有 "+Test.obtuseTriangle+" 个");
    }
}
