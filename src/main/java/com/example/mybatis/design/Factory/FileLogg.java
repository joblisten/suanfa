package com.example.mybatis.design.Factory;

public class FileLogg implements Logg {
    @Override
    public void writeLogg() {
        System.out.println(" 文件操作" );
    }
}
