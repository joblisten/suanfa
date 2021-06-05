package com.example.mybatis.design.Factory;
/*
创建某一业务工厂，如文件业务，数据库

工厂模式
优点：添加新产品无需修改工厂，增加了扩展性
缺点：增加系统复杂度
 */
public interface LoggFactory {
    Logg  creatLogg();
}
