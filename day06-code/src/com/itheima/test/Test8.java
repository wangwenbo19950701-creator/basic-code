package com.itheima.test;

public class Test8 {
    /*
        把一个数组的元素复制到另一个数组中
     */
    public static void main(String[] args) {
        String [] charactorNames = {"マーセナリー","魔法使い","盗賊","戦士","アーチャー"};
        iterationArray(copyArray(charactorNames));
    }

    public static String[] copyArray(String[] willCopy){
        String[]copiedArray=new String[willCopy.length];
        for (int i = 0; i < willCopy.length; i++) {
            copiedArray[i]=willCopy[i];
        }
        System.out.println("コピー完了");
        return copiedArray;
    }

    public static void iterationArray(String [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
