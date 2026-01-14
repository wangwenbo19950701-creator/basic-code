package stringdemo;

public class StringDemo2 {
    /*
        使用控制台遍历字符串
     */
    public static void main(String[] args) {
        String s1 = "我信春哥1234";
        int count = 0;
        //String类的方法：
        //charAt：返回调用此方法的字符串对象的当前索引中的值
        //length:可以获取字符串的长度
        for (int i = 0; i < s1.length(); i++) {
            count++;
            System.out.print(s1.charAt(i));
        }
        System.out.println();
        System.out.println("共有"+count+"个字符");
    }
}
