package com.example.mybatis.tool.importantJava.model;

import java.io.Serializable;

/*
单例模式：
懒汉，延迟加载，调用getInstance()方法，对象才创建
提供一个静态方法让客户端调用。双重判断

破坏单例模式：反射，序列化，克隆
 */
public class student2 implements Serializable,Cloneable{
    private static volatile boolean iscreat=false;//默认第一次创建

    private static student2 s=null;

    /*
    构造方法私有化，外部不能new
     */
    private student2(){
        if(iscreat)
            throw new   RuntimeException("");
        iscreat=true;

    }
    public static student2 getInstance(){
        if(s==null){
            synchronized (student2.class){
                if(s==null)
                    s=new student2();
            }
        }
        return s;
    }

    /*
    防止克隆
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return s;
    }

    /*
    防止序列号破坏
     */
    private Object  readResolve(){
        return s;
    }
}
