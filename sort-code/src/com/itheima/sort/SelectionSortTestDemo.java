package com.itheima.sort;

public class SelectionSortTestDemo {
    /*
        选择排序：用开头的数跟其他所有数去比较，如果小于比较的数，则与之换位

        如：6，2，4，3，5，1 ->2，6，4，3，5，1
     */
    public static void main(String[] args) {
        int [] arr = {5,3,8,4,6,9,7,1,2,10};
        int count = arr.length;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < count; j++) {
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]= temp;
                }
            }
        }
        for(int num: arr){
            System.out.println(num);
        }
    }
}
