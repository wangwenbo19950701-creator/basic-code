package com.itheima.object;

import java.util.Arrays;
import java.util.Objects;

public class User implements Cloneable{
//    要成为被克隆的对象必须要实现cloneable的接口
//    成员变量
    private String name;
    private int id;
    private int [] data;
//    无参构造
    public User(){

    }
//    有参构造
    public User(String name,int id,int [] data){
        this.name=name;
        this.id=id;
        this.data=data;
    }
//setter和getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", data=" + Arrays.toString(data) +
                '}';
    }

    //  重写的equals方法
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(name, user.name) && Arrays.equals(data, user.data);
    }
//  如果重写equals就必须要重写hashCode方法
    @Override
    public int hashCode() {
        int result = Objects.hash(name, id);
        result = 31 * result + Arrays.hashCode(data);
        return result;
    }
//    重写的clone方法
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
