package com.example.mybatis.design.Apdeter;

public class Adapter implements Imobilephone {
    huawei  h;

    public Adapter(huawei h) {
        this.h = h;
    }

    @Override
    public String goole() {
        return null;
    }

    @Override
    public String apple() {
        return null;
    }
    public String huaw(){
        return h.hua();
    }

}
