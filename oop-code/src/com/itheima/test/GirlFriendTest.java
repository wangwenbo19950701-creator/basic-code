package com.itheima.test;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend gf = new GirlFriend();
        gf.setGirlName("白井黑子");
        System.out.println(gf.getGirlName());

        gf.setGirlAge(18);
        System.out.println(gf.getGirlAge()+"岁");

        String[] Things = {"吃饭","睡觉","花钱"};
        gf.setLikeThings(Things);

        System.out.println();
        for (int i = 0; i < gf.getLikeThings().length; i++) {
            System.out.print(gf.getLikeThings()[i]);
        }
    }
}
