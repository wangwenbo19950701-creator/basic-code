package practice1;

import java.util.Arrays;
import java.util.Random;

public class Test1 {
    //给定一个int类型的数组和一个数字，要求删除数组中等于这个数字的元素
    public static void main(String[] args) {
        //给定数组和数字
        int[] arr = new int[10];
        int num = 3;
        System.out.println("给定的数字是" + num);
        for (int i = 0; i < arr.length; i++) {
            //随机生成一个0-10的数字
            arr[i] = new Random().nextInt(11);
        }
        //打印生成的数组
        System.out.println("生成的数组为：" + Arrays.toString(arr));

        //通过过滤器产生新的数组并打印
        int[] newArr = Arrays.stream(arr).filter((int value) -> {
                    if (value != num) {
                        return true;
                    }
                    return false;
                }
        ).toArray();
        System.out.println("过滤后的数组：" + Arrays.toString(newArr));

    }
}
