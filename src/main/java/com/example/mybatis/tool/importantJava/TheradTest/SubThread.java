package com.example.mybatis.tool.importantJava.TheradTest;
public class SubThread implements Runnable{
    private Re re;
    private SubThread (Re re){
        this.re=re;
    }

    @Override
    public void run() {
        for (int i=0;i<5;i++) {
            try {
                this.re.sub();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}