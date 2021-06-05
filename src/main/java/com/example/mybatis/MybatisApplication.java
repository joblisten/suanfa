package com.example.mybatis;


import com.example.mybatis.tool.importantJava.Te;
import com.example.mybatis.tool.importantJava.TheradTest.ThreadLo;
import com.example.mybatis.tool.importantJava.TheradTest.ThreadSy;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MybatisApplication {

    public static void main(String[] args) {
/*
        SpringApplication.run(MybatisApplication.class, args);
        Mythreadpool mythreadpool=new Mythreadpool(3,3);
        mythreadpool.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("你好");
            }
        });*/

       //ThreadSy threadTest=new ThreadSy();  // synchronized
        ThreadLo threadTest=new ThreadLo();
        Thread t1=new Thread(threadTest,"a");
        Thread t2=new Thread(threadTest,"b");
        Thread t3=new Thread(threadTest,"c");
        Thread t4=new Thread(threadTest,"d");
        t1.start();
        t2.start();
        t3.start();
        t4.start();




    }

}
