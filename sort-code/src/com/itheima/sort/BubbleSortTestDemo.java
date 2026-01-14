package com.itheima.sort;

public class BubbleSortTestDemo {
    /*
        冒泡排序:指把相邻的数据依次两两比较，小的放前面，大的放后面

        特点：每一轮循环都可以少一次 如果有n个数据，那就需要进行n-1轮循环

        步骤1.角标1的元素与角标2的元素相比
        步骤2.若大于角标二的元素，则temp=角标1元素;角标2元素=角标1元素;角标2元素=temp
        步骤3.角标2元素与角标1元素相比。。
     */
    public static void main(String[] args) {
        int [] arr = {5,3,2,4,6,1,8,7,9,10};
        //设置循环次数初始值
        int count = arr.length;//初始值为5
        for (int i = 0; i <arr.length ; i++) {
            //优化：如果count=1代表现在就剩一个数据没排序了，不需要在往下执行了
            if(count==1){
                break;
            }
            //优化，因为最后一次交换数据是角标8的元素交换角标9的元素，
            // 而代码中j+1是10，角标10是不存在的，所以写count-1可以减少一次不必要的循环
            for (int j = 0; j < count-1; j++) {
//                if(j+1>=count){
//                    break;
//                }
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            count--;
        }

        for(int num : arr){
            System.out.println(num);
        }
    }
}
