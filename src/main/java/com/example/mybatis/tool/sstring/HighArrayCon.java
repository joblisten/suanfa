package com.example.mybatis.tool.sstring;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/*
对ArrayContain的封装
冒泡排序
 */

public class HighArrayCon {
    private long[] a;
    private int nElme;

    public HighArrayCon(int max) { // 初始化数组
        a=new long[max];
        nElme=0;    //数组下表从0
    }
    /*
    选择排序：将最大或者最小的找出来，最后交换
    互相比较，每符合条件比较一次就标记一次，最后，把最大的或者最小的跟最先位置比较的再交换


    比冒泡排序KUAI很多，交换次数少了，
    交换次数是O（N）
    但都是比较次数O（N平方）找最小，
     */
    public void selectSort(){
        int min;    //这是标记
        int out,in;
        long temp=0;
        for (out= 0; out<nElme-1 ; out++) { //比较次数同冒泡排序一样，没有变
            min=out;    //这里代表是最大或者最小是有序的已经不用比较
            for (in=out+1;in<nElme;in++)    //从有序的下一个，内循环运行到结束
                if(a[in]<a[min])
                    min=in; //找到最小的了

                    temp=a[out];    //让最大的跟原先比较的交换
                    a[out]=a[min];  //
                    a[min]=temp;
        }

    }
        /*
            冒泡排序：每次相邻两个比较就每次交换，直到将最大的或者最小的先找出来，比较和交换都是O（N的平方）
          */
    public void bbleSort(){   //冒泡排序

        int in,out;
        long temp=0;
        for (out=nElme-1;out>0;out--)   //如果out>1则会排序少一次，外循环一次，内循环要循环结束
            for (in=0;in<out;in++)
                if (a[in]>a[in+1]){ //前一个大于后一个，调换位置,＞大于是递增
                    temp=a[in];
                    a[in]=a[in+1];
                    a[in+1]=temp;
                    /*
                    if (a[in]>a[in+1]){     这是递减
                    temp=a[in];
                   a[in]=a[in+1];
                   a[in+1]=temp;
                   }
                     */
                }
    }


    public boolean findKey(long diractionKey){ //查找数组
        int j;
        for (j = 0; j <nElme ; j++)
            if (a[j]==diractionKey)
                break;  // 找整个数组
            if (j==nElme)  //没有时，等于数组长度
                return false;
            else
                return true;
    }
    public void insertKey(long diractionKey){  //插入数组值
          a[nElme]=diractionKey;
          nElme++;

    }
    public boolean delectKey(long diractionKey) {  //删除数组值
        int j;
        for (j = 0; j < nElme; j++)
            if (a[j] == diractionKey)
                break;
            if (j == nElme) return false;   //数组没有这个值，删除不了
            else {
                for (int k = j; k< nElme; k++)  //删除值的向前移动
                    a[k] = a[k + 1];
                 nElme--;
                return true;
            }
    }public void printKey(){  //输出数组内容
        for (int j = 0;  j< nElme; j++) {
            System.out.print(a[j]+" ");
            System.out.println(" " );

        }



    }
}
