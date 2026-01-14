package com.itheima.a02innerclassdemo2;

public class Outer {

    //私有的成员内部类
    private class Inner{
        int innerNum;

        public Inner() {
        }

        public Inner(int innerNum) {
            this.innerNum = innerNum;
        }

        public int getInnerNum() {
            return innerNum;
        }

        public void setInnerNum(int innerNum) {
            this.innerNum = innerNum;
        }
    }

    public Outer() {
    }

    public Inner getInstance(){
        return new Inner();
    }
}
