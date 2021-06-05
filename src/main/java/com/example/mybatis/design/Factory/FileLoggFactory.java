package com.example.mybatis.design.Factory;

public class FileLoggFactory implements LoggFactory {
    @Override
    public Logg creatLogg() {
        Logg  logg=new FileLogg();
       return logg;
    }


}
