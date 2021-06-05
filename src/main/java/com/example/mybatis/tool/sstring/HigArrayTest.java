package com.example.mybatis.tool.sstring;

import org.springframework.stereotype.Service;

@Service
public class HigArrayTest {
    public void getKey(){
        HighArrayCon highArrayCon=new HighArrayCon(20);
        highArrayCon.insertKey(30);
        highArrayCon.insertKey(20);
        highArrayCon.insertKey(50);
        highArrayCon.insertKey(70);
        highArrayCon.insertKey(15);
        highArrayCon.insertKey(0);

        //highArrayCon.bbleSort();//冒泡排序
        highArrayCon.selectSort();
        highArrayCon.printKey();
/*
        if(highArrayCon.findKey(20))
            System.out.println(" 找到了"+20);
        else
            System.out.println("没找到");
        if(highArrayCon.delectKey(70))
            System.out.println(" 删除成功");
        else
            System.out.println("删除失败");


        highArrayCon.printKey();*/
    }

}
