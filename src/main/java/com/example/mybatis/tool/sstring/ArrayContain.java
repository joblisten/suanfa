package com.example.mybatis.tool.sstring;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


public class ArrayContain {
    private Long[] a;

    public ArrayContain( int size) { //  构造器初始话数组大小
        a=new Long[size];
    }

   public long getElme(int index){ //通过下标找到数组值
        return a[index];
   }
   public void setElme(int index ,long value){ //把通过下表和值给数组赋值
        a[index]=value;
   }
}
