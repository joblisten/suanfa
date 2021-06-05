package com.example.mybatis.design;


import com.example.mybatis.design.AbreastFactory.SpringSkinFactory;
import com.example.mybatis.design.Factory.FileLoggFactory;
import com.example.mybatis.design.Factory.Logg;
import com.example.mybatis.design.Factory.LoggFactory;

public class test {
    public static void main(String[] args) {
       /* Product product= Product.get("apple");
        product.make();*/

        /*LoggFactory loggFactory=new FileLoggFactory();
        Logg logg=loggFactory.creatLogg();
        logg.writeLogg();*/
        SpringSkinFactory  springSkinFactory=new SpringSkinFactory();
        springSkinFactory.creatButton();
        springSkinFactory.creatText();




    }
}
