package com.itheima.a01innerclassdemo1;

public class Car {
    private String cName;
    private int cPrice;
    class Engine{
        private String engName;
        private int engPrice;

        //内部类构造方法
        public Engine() {
        }

        public Engine(String engName, int engPrice) {
            this.engName = engName;
            this.engPrice = engPrice;
        }

        public String getEngName() {
            return engName;
        }

        public void setEngName(String engName) {
            this.engName = engName;
        }

        public int getEngPrice() {
            return engPrice;
        }

        public void setEngPrice(int engPrice) {
            this.engPrice = engPrice;
        }

        //内部类的方法：显示引擎的信息
        public void show(){
            System.out.println("引擎名："+this.engName+" 引擎价格："+this.engPrice);
        }
    }

    public Car() {
    }

    public Car(String cName, int cPrice) {
        this.cName = cName;
        this.cPrice = cPrice;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public int getcPrice() {
        return cPrice;
    }

    public void setcPrice(int cPrice) {
        this.cPrice = cPrice;
    }

    //显示车的信息
    public void show (){
        System.out.println("车名："+this.cName+" 价格："+this.cPrice);
    }
}
