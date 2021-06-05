package com.example.mybatis.tool.sstring;


/*
数组查找
 */

public class ArrayTest {

    public void testt(){
        ArrayContain arrayContain=new ArrayContain(10);
        int nElme=10; // 记录数
        int j;
        arrayContain.setElme(0,77);
        arrayContain.setElme(1,17);
        arrayContain.setElme(2,34);
        arrayContain.setElme(3,19);
        arrayContain.setElme(4,90);
        arrayContain.setElme(5,75);
        arrayContain.setElme(6,38);
        arrayContain.setElme(7,20);
        arrayContain.setElme(8,15);
        arrayContain.setElme(9,59);
        /*
        遍历整个数组
         */
        for (j=0;j<nElme;j++)
            System.out.print(arrayContain.getElme(j)+" ");
            System.out.println();

        int searchKey=59; // 需要寻找的数
        for (j=0;j<nElme;j++){
            if (arrayContain.getElme(j)==searchKey)
                break;
            // 从数组头找到尾
        }
            if (j==nElme) //显然找到了j会小于10，没找到j会等于10；
                System.out.println("searchKey = " + searchKey+"没找到了");
            else
                System.out.println("searchKey = " + searchKey+"找到了");


        int delectKey=15;

        for (j=0;j<nElme;j++){
        if (arrayContain.getElme(j)==delectKey)
                break;
        }

            for (int k=j;k<(nElme-1);k++)
                arrayContain.setElme(k , arrayContain.getElme(k+1));
                nElme--;


        for (j=0;j<nElme;j++)
            System.out.print(arrayContain.getElme(j)+" ");
            System.out.println();

    }
}
