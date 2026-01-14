package com.itheima.test6;

public class GirlFriend {
    /*
        定义一个数组存储4个女朋友的对象
        对象属性：姓名 年龄 性别 爱好
        1.计算出四个人的平均年龄
        2.统计比平均年龄低的人有几个，打印出他们的名字
     */

    //创建成员变量
    private String girlFriendName;
    private int girlFriendAge;
    private char girlFriendGender;
    private String getGirlFriendHobby;

    //无参构造
    public GirlFriend() {

    }

    //有参构造
    public GirlFriend(String girlFriendName, int girlFriendAge, char girlFriendGender, String getGirlFriendHobby) {
        this.girlFriendName = girlFriendName;
        this.girlFriendAge = girlFriendAge;
        this.girlFriendGender = girlFriendGender;
        this.getGirlFriendHobby = getGirlFriendHobby;
    }

    //setter和getter方法
    public String getGirlFriendName() {
        return girlFriendName;
    }

    public void setGirlFriendName(String girlFriendName) {
        this.girlFriendName = girlFriendName;
    }

    public int getGirlFriendAge() {
        return girlFriendAge;
    }

    public void setGirlFriendAge(int girlFriendAge) {
        this.girlFriendAge = girlFriendAge;
    }

    public char getGirlFriendGender() {
        return girlFriendGender;
    }

    public void setGirlFriendGender(char girlFriendGender) {
        this.girlFriendGender = girlFriendGender;
    }

    public String getGetGirlFriendHobby() {
        return getGirlFriendHobby;
    }

    public void setGetGirlFriendHobby(String getGirlFriendHobby) {
        this.getGirlFriendHobby = getGirlFriendHobby;
    }
}
