package com.example.mybatis.tool;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/*
步骤：任务-----线程池（任务队列仓库（管理任务）+线程（处理任务））-----cpu
运用线程池：
创建线程池---调用sumit（new Runnable(业务逻辑)）
              ||
             内部运行---加入任务+根据参数准备仓库和线程


   仓库队列的操作：
   第一种抛出异常，第二种返回特殊值，第三种操作成功前，无限期阻塞当前线程，第四种给定最大时间限制内阻塞
               1        2       3      4
               抛出异常  特殊值     阻塞      超时
         插入   add(e)    offer(e)   put(e)   offer(e,time,unit)
         移除   remove(e)  poll()    take()    poll(time,unit)
         检查   element()   peek()    不可用    不可用*/
public class Mythreadpool {
    //线程池基本组成部分：任务仓库，线程
    private BlockingQueue<Runnable> blockingQueue;//任务队列仓库
    private List<Thread> Threadwokers;//管理的线程
    private int poolSize;//线程数
    private int taskSize;//任务数
    /*
    线程创建，处理任务
     */
    public static class Wokers extends Thread{//具体工作的线程
        private Mythreadpool pool;

        public Wokers(Mythreadpool pool) {
            this.pool=pool;
        }
        @Override
        public void run() {
            while (true){//防止回收，重复利用
            Runnable task=null;
            try {
                task= this.pool.blockingQueue.take();//线程执行任务特性，没任务来就阻塞，处理任务
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (task!=null)
                task.run();
            System.out.println("线程："+Thread.currentThread().getName()+"执行完毕");
        }
        }
    }
    public Mythreadpool(int poolSize, int taskSize) {//初始化线程池构造器
       if(poolSize<=0||taskSize<=0)
           throw new IllegalArgumentException("非法参数");
       this.blockingQueue=new LinkedBlockingDeque<>(taskSize);//准备任务仓库
       this.Threadwokers= Collections.synchronizedList(new ArrayList<>());//准备线程管理集合：给线程集合加锁，使线程安全
        for (int i = 0; i <poolSize ; i++) { //参数传进来，new几个，线程池就有几个线程
            Wokers woker=new Wokers(this);//创建线程池内置的线程
            Threadwokers.add(woker);//线程加入线程集合去管理
            woker.start();//启动线程

        }
    }
    public boolean submit(Runnable task){
        return this.blockingQueue.offer(task);//插入操作，将任务插入到任务仓库队列里，抛出异常
    }
}
