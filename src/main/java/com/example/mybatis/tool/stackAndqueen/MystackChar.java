package com.example.mybatis.tool.stackAndqueen;

public class MystackChar {
    private char[] stackArray;
    private int max;
    private int top;

    public MystackChar(int maxSize) {
        max=maxSize;
        stackArray= new char[max];
        top=-1;
    }
    /*
    进栈
     */
    public void push(char j){   //进栈之前指针就往上移了
        stackArray[++top]=j;

    }
    /*
    出栈
     */
    public char pop(){
        return stackArray[top--];
    }
    /*
    查看
     */
    public char peek(){
        return stackArray[top];
    }
    public boolean  isEmpty(){  //判断是否为空，也为遍历pop提供条件

        return (top==-1);
    }
    public boolean  isFull(){
        return (top==max-1);
    }
}
