package practice2;

public class Test {
    public static void main(String[] args) {
        //给定两个整数M和N，M为红包总金额，N为一共几个人
        int M = 100;
        int N = 5;
        //设置红包数=人数
        RedPack.count = N;
        //创建一个线程类型的数组
        Thread[] threads = new Thread[N];

        RedPack redPack = new RedPack(M);
        //按照红包个数创建线程
        for (int i = 0; i < N; i++) {
            threads[i] = new Thread(redPack, "第" + (i + 1) + "个人");
        }
        //启动线程
        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
        }
    }
}
