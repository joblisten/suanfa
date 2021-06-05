package com.example.mybatis.design.Clonee;
/*
原型模式
 */
public class CloneeProperty extends Cloneee {
    public String getArr() {
        return arr;
    }

    public void setArr(String arr) {
        this.arr = arr;
    }

    private String  arr;

    @Override
    public Cloneee clonee() {
        Cloneee cloneee=new CloneeProperty();
        ((CloneeProperty) cloneee).setArr(this.arr);
        return cloneee;
    }
}
