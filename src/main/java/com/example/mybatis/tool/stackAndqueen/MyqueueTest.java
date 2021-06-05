package com.example.mybatis.tool.stackAndqueen;

import org.springframework.stereotype.Service;

@Service
public class MyqueueTest {
    public static void main(String[] args) {
        Myqueue myqueue=new Myqueue(10);
        myqueue.insert(20);
        myqueue.insert(10);
        myqueue.insert(40);
        myqueue.insert(50);
        myqueue.insert(60);
        myqueue.remove();
        myqueue.remove();
        myqueue.insert(70);
        myqueue.insert(80);


        while (!myqueue.isEmpty()){
            long n=myqueue.remove();
            System.out.println("n = " + n);
        }

    }
}
