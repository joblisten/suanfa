package com.example.mybatis.tool.importantJava.TheradTest;

public class ThreadLocalT {
    private static ThreadLocal<Long> threadLocal=new ThreadLocal<>();
    public static void main(String[] args) {
        tast t=new tast();
        new Thread(t).start();
        new Thread(t).start();

    }
    static class tast implements Runnable{

        @Override
        public void run() {
            Long re=threadLocal.get();
            if(re==null){
                threadLocal.set(System.currentTimeMillis());
                System.out.println(Thread.currentThread().getName()+threadLocal.get());

            }


        }
    }
}
