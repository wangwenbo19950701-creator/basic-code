package practice3;

import java.util.Arrays;
import java.util.List;

public class Test {
    //二路归并法查找中位数
    //给定两个正序的int数组，合并两个数组并找出中位数
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4};
        findMiddleNum(arr1, arr2);

    }

    private static double findMiddleNum(int[] arr1, int[] arr2) {
        //合并数组
        int[] newArray = concatArrays(arr1, arr2);

        //判断数组长度是单是双
        if(newArray.length%2==0){
            //双数情况
        }else {

        }
        return 0;
    }

    private static int[] concatArrays(int[] arr1, int[] arr2) {
        List<int[]> ints = Arrays.asList(arr1, arr2);
        int[] arrNew = new int[arr1.length + arr2.length];
        int length = 0;
        for (int[] anInt : ints) {
            for (int i : anInt) {
                arrNew[length] = i;
                length++;
            }
        }
        Arrays.sort(arrNew);
        return arrNew;
    }
}
