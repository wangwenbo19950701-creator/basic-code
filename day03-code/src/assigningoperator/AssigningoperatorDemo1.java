package assigningoperator;

public class AssigningoperatorDemo1{
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        a += b; // 这条语句就等于a = a + b;
        System.out.println(a);
        System.out.println(b);

        //细节
        short s = 1;
        s += 1;
        // 这条语句严格意义上说并不等于 s = s + 1;
        // 因为s + 1的结果是int类型，而s是short类型
        // 所以s转换成了int类型，然后 + 1得到了一个int的结果，最后进行赋值操作
        // 而s本身是short类型，+=自带强制转换，把int类型的结果转化成了short
        // ※所以 +=，-=， *=，/=，%= 都自带强制转换
        System.out.println(s);
    }

}
