package com.example.mybatis.tool.importantJava.TheradTest;

public class AddThread implements Runnable{
    private Re re;
    private AddThread (Re re){
        this.re=re;
    }

    @Override
    public void run() {
        for (int i=0;i<5;i++) {
            try {
                this.re.add();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}