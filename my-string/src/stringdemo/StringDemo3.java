package stringdemo;

import javax.imageio.metadata.IIOMetadataFormatImpl;

public class StringDemo3 {
    /*
        拼接数组中的字符串，并打印到控制台
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        String s1= changeString(arr);
        System.out.println(s1);
    }

    //转换字符
    public static String changeString(int []array){
        String newString=new String();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if(i==0){
                sb.append("["+array[i]+",");
            }else if(i==array.length-1){
                sb.append(array[i]+"]");
            }else{
                sb.append(array[i]+",");
            }
        }
        newString=sb.toString();
        return newString;
    }
}
