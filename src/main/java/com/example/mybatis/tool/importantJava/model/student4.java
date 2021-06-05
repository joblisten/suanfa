package com.example.mybatis.tool.importantJava.model;

import javax.lang.model.element.NestingKind;/* 构建器模式 */

public class student4 {
    private int id;
    private String name;
    private String sex;
    private String souce;
    private String sum;

    private student4(Builder builder) {
        id = builder.id;
        name = builder.name;
        sex = builder.sex;
        souce = builder.souce;
        sum = builder.sum;
    }

    public static class Builder {
        private int id;
        private String name;
        private String sex;
        private String souce;
        private String sum;

        public Builder(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public Builder sex(String val) {
            sex = val;
            return this;
        }

        public Builder souce(String val) {
            souce = val;
            return this;
        }

        public Builder sum(String val) {
            sum = val;
            return this;
        }

        public student4 build() {
            return new student4(this);
        }
    }
    /*
    客户端调用：
    student4    student=new Builder(1,"a").sex("nv").souce("90").build();
    */
}
