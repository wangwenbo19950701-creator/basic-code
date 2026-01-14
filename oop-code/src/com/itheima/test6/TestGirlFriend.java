package com.itheima.test6;

public class TestGirlFriend {
    public static void main(String[] args) {
        /*
            定义一个数组存储4个女朋友的对象
            对象属性：姓名 年龄 性别 爱好
            1.计算出四个人的平均年龄
            2.统计比平均年龄低的人有几个，打印出他们的名字
        */

        //定义一个长度为4的数组，数据类型为GirlFriend
        GirlFriend [] girlFriendArray=new GirlFriend[4];

        //创建4个对象
        GirlFriend g1=new GirlFriend("小红",18,'女',"吃东西");
        GirlFriend g2=new GirlFriend("小芳",23,'女',"看演唱会");
        GirlFriend g3=new GirlFriend("莹莹",19,'女',"看电影");
        GirlFriend g4=new GirlFriend("姚姚",28,'女',"买东西");

        //把对象插入数组
        girlFriendArray[0]=g1;
        girlFriendArray[1]=g2;
        girlFriendArray[2]=g3;
        girlFriendArray[3]=g4;

        //声明变量存储年龄总数
        int sumAge=0;
        //声明变量统计人数
        int countPerson=0;
        //声明变量存储年龄平均值
        double averageAge=0;
        //遍历出所有元素的年龄属性值并赋值给sumAge
        for (int i = 0; i <girlFriendArray.length ; i++) {
            sumAge=sumAge+girlFriendArray[i].getGirlFriendAge();
        }
        averageAge=sumAge/girlFriendArray.length;
        //求出年龄平均值
        System.out.println(girlFriendArray.length+"个人的年龄平均值为："+averageAge+"岁");

        //遍历出比平均年龄小的人，统计的数据传给count，并输出名字
        for (int i = 0; i < girlFriendArray.length; i++) {
            if(girlFriendArray[i].getGirlFriendAge()<averageAge){
                countPerson++;
                System.out.println(girlFriendArray[i].getGirlFriendName());
            }
        }
        System.out.println("小于平均年龄的人数是："+countPerson+"人");
    }
}
