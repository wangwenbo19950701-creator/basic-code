package com.itheima.sort;

public class QuickSortTestDemo {
    /*
        快速排序：运行速度远超于其他排序方式，与之相对的是逻辑非常困难

        基准数归位：快速排序的精髓，
        1.把角标为0的数字定义为基准数
        2.定义起点（角标为1的地方）和终点（数组最后的角标）
        3.先用终点角标上的元素与基准数比较
            角标上的元素比基准数大，则向左移动一位继续比较
            直到角标上的元素比基准数小，这时角标停止移动
        4，再用起点角标的元素与基准数比较
            角标上的元素比基准数小，则向右移动一位继续比较
            直到角标上的元素比基准数大并且起点指针与终点指针不指向同一个元素的时候，把起点和终点指向的元素进行互换
            然后重复3和4的步骤
        5.如果起点和终点都指向同一个元素，那么就把这个元素和基准数的互换位置，此时基准数归位
     */

    public static void main(String[] args) {
        //创建一个数组
        int[] arr = {6, 9, 7, 6, 8, 12, 2, 43};
        //创建基准数
        int baseNum = 0;
        //初始起点
        int startIndex = 1;
        //初始终点
        int endIndex = arr.length - 1;

        loop:
        while (true) {
            //移动终点坐标
            for (int i = endIndex; i < arr.length; i--) {
                endIndex = i;
                if (arr[i] > arr[baseNum]) {
                    continue;
                }
                //锁定终点坐标
                break;
            }

            //移动起点坐标
            for (int i = startIndex; i < arr.length; i++) {
                //判断起点和终点如果指向同一个元素，结束循环
                if(startIndex==endIndex){
                    break loop;
                }
                startIndex = i;
                if (arr[i] < arr[baseNum]) {
                    continue;
                }
                //锁定终点坐标
                break;
            }

            //如果指向不同则交换这两个地方的内容继续循环
            int temp = 0;
            temp = arr[endIndex];
            arr[endIndex] = arr[startIndex];
            arr[startIndex] = temp;
        }

        //当起点和终点指向了同一个元素，交换此元素和基准数的内容
        if (startIndex == endIndex&& arr[startIndex]!=arr[endIndex]) {
            int temp = 0;
            temp = arr[baseNum];
            arr[baseNum] = arr[startIndex];
            arr[startIndex] = temp;
        }else {
            int temp = 0;
            temp = arr[baseNum];
            arr[baseNum] = arr[startIndex-1];
            arr[startIndex-1] = temp;
        }


        for (int i : arr) {
            System.out.println(i);
        }
    }
}
