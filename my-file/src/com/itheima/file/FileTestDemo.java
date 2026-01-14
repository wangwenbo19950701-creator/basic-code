package com.itheima.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTestDemo {
    /*
        File类：代表路径

        构造方法：
        public File(String pathname)：可以是相对路径也可以是绝对路径
        public File(String parent, String child)：入参1为到文件夹的路径，入参2为具体的文件名
        public File(File parent, String child)：可以把输出的文件路径变成链接
     */
    public static void main(String[] args) {
        File file1 = new File("C:\\Users\\wwb\\Desktop\\123.txt");
        File file2 = new File("C:\\Users\\wwb\\Desktop", "123.txt");
        File file33 = new File("com\\itheima\\file\\txt");
        File file3 = new File(file33, "123.txt");
        System.out.println(file1);
        System.out.println(file2);
        System.out.println(file3);

        System.out.println(file1.isFile());//判断是否是一个文件
        System.out.println(file1.isDirectory());//判断是否是一个文件夹
        System.out.println(file1.getAbsolutePath());//获取绝对路径
        System.out.println(file1.exists());//判断是否存在
        System.out.println(file33.getPath());//获取路径
        System.out.println(file3.length());//获取文件的大小（单位是字节）

        //获取最后修改时间（单位毫秒值）
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date = new Date(file1.lastModified());
        System.out.println(simpleDateFormat.format(date));

    }
}
