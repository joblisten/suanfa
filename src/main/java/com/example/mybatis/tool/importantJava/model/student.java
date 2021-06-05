package com.example.mybatis.tool.importantJava.model;
/*饿汉
 */
public class student {
    private static final student s=new student();
    private student(){

    }
    public static student getInstance(){
        return s;
    }


}


