package com.itheima.test;

public class Phone {
    //创建一个手机的JavaBean类
    //面向对象编程
    /*
        1.类：用来描述一类事物的特征和行为
        2.对象：具体的事物，是类的实例化

        举个例子：类就好比是一张设计图，如果我要定义一个和手机，那首先就要创建一个手机的设计图，并且赋予其属性(名词)和其功能(动词)
                 对象就是我用这个设计图来造出手机，这个手机可以是苹果也可以是华为，价钱可以是几百也可以是几千,可以打电话和玩游戏

        总结：类就是泛指的手机，而对象就是具体的手机
     */
    //-----------------------------------------------------------------------------------------------------

    //属性
    /*
        注意，定义属性的时候只初始化不要赋值，修饰符要用private来确保数据是合法数据
     */
    private String phoneName;
    private int phonePrice;

    //功能
    /*
        使用setPhoneName()【接受手机名】和getPhoneName【返回手机名】来接受传参和返回参数
     */
    public void setPhoneName(String pName) {
        //调用此方法可以将入参pName中的值赋值给属性phoneName
        phoneName = pName;
    }

    public String getPhoneName() {
        //如果想返回phoneName的值，就调用此方法
        return phoneName;
    }

    public void setPhonePrice(int pPrice) {
        // 判断传入的价格是否大于0
        if (pPrice > 0) {
            // 如果大于0，则将传入的价格赋值给phonePrice
            phonePrice = pPrice;
        } else {
            // 如果小于等于0，则输出错误信息
            System.out.println("价格不能小于0,非法数据");
        }
    }

    // 获取手机价格
    public int getPhonePrice() {
        return phonePrice;
    }

    public void playGame(){
        System.out.println("玩游戏");
    }

    public void call(){
        System.out.println("打电话");
    }
}
