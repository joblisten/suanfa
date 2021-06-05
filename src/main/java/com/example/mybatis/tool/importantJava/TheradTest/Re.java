package com.example.mybatis.tool.importantJava.TheradTest;


public class Re {
    private int num=0;
    private boolean flag=true; //true加法,false减法
    public synchronized void add() throws InterruptedException {
        while(flag==false){
            super.wait();
        }
        Thread.sleep(100);
        this.num++;
        System.out.println(Thread.currentThread().getName()+"加法num="+num);
        this.flag=false;
        super.notifyAll();
    }

    public synchronized void sub() throws InterruptedException {
        while(flag==true){
            super.wait();
        }
        Thread.sleep(200);
        this.num++;
        System.out.println(Thread.currentThread().getName()+"减法num="+num);
        this.flag=true;
        super.notifyAll();
    }
}




