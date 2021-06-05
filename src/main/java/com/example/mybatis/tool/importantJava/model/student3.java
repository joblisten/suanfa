package com.example.mybatis.tool.importantJava.model;
/*
单例模式；用静态内部类
 */
public class student3 {
    private static class stud {
        private static student3 instance = new student3();

    }
    private student3(){

    }

    private static student3 getInstance(){
        return stud.instance;
    }

}
