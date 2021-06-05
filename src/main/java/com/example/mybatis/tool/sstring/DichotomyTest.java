package com.example.mybatis.tool.sstring;

import org.springframework.stereotype.Service;

@Service
public class DichotomyTest {
    public void fet(){
        Dichotomy dichotomy=new Dichotomy(10000);
        dichotomy.Dinsert(20);
        dichotomy.Dinsert(10);
        dichotomy.Dinsert(40);
        dichotomy.Dinsert(250);
        dichotomy.Dinsert(190);
        dichotomy.Dinsert(333);
        dichotomy.Dinsert(54);
        dichotomy.Dinsert(4);
        dichotomy.Dinsert(2000);
        dichotomy.Dinsert(566);
        dichotomy.Dinsert(7465);
        dichotomy.Dinsert(232);
        dichotomy.Dinsert(54754);
        dichotomy.Dpirnt();

        if(dichotomy.Dfind(2000)!=dichotomy.Dsize())
            System.out.println("找到了"+""+"并且找了"+dichotomy.count);
        else
            System.out.println("没找到");


        dichotomy.Ddelect(4);
        dichotomy.Dpirnt();

    }
}
