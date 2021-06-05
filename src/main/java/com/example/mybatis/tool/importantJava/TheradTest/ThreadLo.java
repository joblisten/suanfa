package com.example.mybatis.tool.importantJava.TheradTest;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/*
jdk1.5之后用lock代替synchronized
 */
public class ThreadLo implements Runnable {
    //剩余票数
    static int count=10;
    //抢到第几张票
    static int num=0;
    //是否售完票
    boolean flag=false;
    final Lock lock=new ReentrantLock();

    @Override
    public void run() {
        while(!flag){
            sale();
        }


    }

    private  void sale(){
        lock.lock();try{
        if(count<=0){
            flag=true;
            return;
        }
        count--;
        num++;
        System.out.println(Thread.currentThread().getName()+"抢到第"+num+"张票,剩余"+count+"票");}
        finally {
            lock.unlock();
        }

    }

}
