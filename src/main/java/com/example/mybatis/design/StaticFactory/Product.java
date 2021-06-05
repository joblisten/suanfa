package com.example.mybatis.design.StaticFactory;
/*
简单工厂类优点：对象创建和使用的分离，方便增加新的产品类
缺点：产品过于集中，指责过重，新产品需要增加新的子类，增加系统复杂度和理解度
使用场景：对象少的情况下

 */
public abstract class Product {
    private String  name;

    public abstract void make();
    public static Product  get(String  style){
        Product product=null;
        if (style.equalsIgnoreCase("apple"))
            product=new Apple();
        else    if(style.equalsIgnoreCase("orange"));
        product=new Orange();
        return product;

    }
}
