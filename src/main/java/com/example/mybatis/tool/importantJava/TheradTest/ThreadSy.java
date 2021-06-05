package com.example.mybatis.tool.importantJava.TheradTest;
/*
抢票：悲观锁;用户抢票不平均
 */
public class ThreadSy implements Runnable {
    //剩余票数
    static int count=10;
    //抢到第几张票
    static int num=0;
    //是否售完票
    boolean flag=false;

    @Override
    public void run() {
        while(true){
            //静态代码块
            synchronized (this){
                if(count<=0){
                    break;
                }
                count--;  //剩余票数-1
                num++;  //抢到第几张票
                System.out.println(Thread.currentThread().getName()+"抢到第"+num+"张票,剩余"+count+"票");
            }


        }


    }
    /*
          静态方法
           */
   /* private synchronized void sale(){
        if(count<=0){
            flag=true;
            return;
        }
        count--;
        num++;
        System.out.println(Thread.currentThread().getName()+"抢到第"+num+"张票,剩余"+count+"票");

    }*/

}
