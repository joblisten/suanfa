package com.example.mybatis.tool.stackAndqueen;
/*
普通队列
 */
public class Myqueue {
    private int maxSize;//队列最大值
    private long[] queuArry;
    private int front;//队头
    private int rear;//队尾
    private int nEleum;//计算

    public Myqueue(int maxSize) {
        this.maxSize=maxSize;
        queuArry=new long[maxSize];
        front=0;
        rear=-1;
        nEleum=0;
    }
    public int  size(){
        return nEleum;
    }
    public void insert(long j){
        //插入之前判断是否满了
        if(rear==maxSize-1)
            rear=-1;
        queuArry[++rear]=j;//从队尾插入，队尾移动
        nEleum++;
    }
    public long peek(){
        return queuArry[front];
    }
    public long remove(){
        //删除只能从队头删,队头移动
        long temp=queuArry[front++];
        if (front==maxSize)
            front=0;
        nEleum--;
        return temp;
    }
    public boolean  isFull(){
        return (nEleum==maxSize);
    }
    public boolean  isEmpty(){
        return (nEleum==-1);
    }
}
