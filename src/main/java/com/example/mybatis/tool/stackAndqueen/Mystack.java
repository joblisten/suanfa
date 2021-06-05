package com.example.mybatis.tool.stackAndqueen;
/*
用数组实现栈
 */
public class Mystack {
    private Long[] stackArray;
    private int max;
    private int top;

    public Mystack(int maxSize) {
        max=maxSize;
        stackArray= new Long[max];
        top=-1;
    }
    /*
    进栈
     */
    public void push(long j){   //进栈之前指针就往上移了
        stackArray[++top]=j;

    }
    /*
    出栈
     */
    public long pop(){
        return stackArray[top--];
    }
    /*
    查看
     */
    public long peek(){
        return stackArray[top];
    }
    public boolean  isEmpty(){  //判断是否为空，也为遍历pop提供条件

        return (top==-1);
    }
    public boolean  isFull(){
        return (top==max-1);
    }
}
