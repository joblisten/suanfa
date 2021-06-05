package com.example.mybatis.tool.sstring;

import java.util.ArrayList;

public class queshiNumber {
    public static void main(String[] args) {


        //1-6不重复，但是长度为5，总会有缺失的数
        int n=8;

        ArrayList arrayList=new ArrayList<Integer>();
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(6);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(8);
        arrayList.add(7);
        for (int i=1;i<=n;)
        {
            if (arrayList.contains(i))
                i++;
            else {
                System.out.printf("缺失的数字是" + i);
                break;
            }
        }

    }
}
