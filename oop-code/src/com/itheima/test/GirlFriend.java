package com.itheima.test;

public class GirlFriend {
    //创建一个女朋友类，属性有姓名，年龄，喜欢的东西，不喜欢的东西，心情值
    private String girlName;
    private int girlAge;
    private String[]likeThings;
    private String[]dislikeThings;
    private int moodValue;

    public void setGirlName(String girlName) {
        this.girlName = girlName;
    }

    public String getGirlName() {
        return girlName;
    }

    public void setGirlAge(int girlAge) {
        if(girlAge>17){
            this.girlAge=girlAge;
        }else if(girlAge>0 && girlAge<=17){
            System.out.println(girlAge+"岁啊，"+ "日子真是越来越刑了");
        }else{
            System.out.println("上辈子的女朋友？非法数据");
        }
    }
    public int getGirlAge() {
        return girlAge;
    }

    public void setLikeThings(String[] likeThings) {
        this.likeThings = likeThings;
    }
    public String[] getLikeThings() {
        return likeThings;
    }
}
