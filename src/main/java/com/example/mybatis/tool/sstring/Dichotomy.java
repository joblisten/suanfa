package com.example.mybatis.tool.sstring;
/*
二分法查找：
 */
public class Dichotomy {
    private long[] a;
    private int nEleme;
    int count=0; // 记录查找次数
    public Dichotomy(int max) {
        a=new long[max];
        nEleme=0;
    }
    public int Dsize(){
        return nEleme;
    }

    public int Dfind(long searchKey){

        int lowIndex=0; // 数组头
        int uperIndex=nEleme-1; // 数组尾
        int curIn; //中间数

        while(true){
            curIn=(lowIndex+uperIndex)/2; //每次都到查找到中间
            if (a[curIn]==searchKey)
                return curIn;     // 找到了,返回下标

            else if (lowIndex>uperIndex)
                return nEleme;   // 没找到，返回数组长度

            else {

                if (a[curIn]<searchKey) // 中间数小了，头部要变
                    lowIndex=curIn+1;
                else
                    uperIndex=curIn-1; //中间数大了，尾部要变
            }
            count++;
        }

    }

    public void  Dinsert(long insertKey){ //递增数组，找到一个比我大的就行；递减数组，找到一个比我小的就行
        int j;
        for (j = 0; j <nEleme ; j++)
            if (a[j]>insertKey)  // 数组排序：插入时，找到一个大于插入的数时,就停止
                break;
        for (int k = nEleme; k >j ; k--)   // 让插入数之后的数向后挪
            a[k]=a[k-1];

            a[j]=insertKey;  //  插入需要插入的值
            nEleme++;
    }

    public boolean Ddelect(long delectKey){
        int j=Dfind(delectKey); // 从find方法获取
        if (j==nEleme)
            return false;
        else
            for (int i = j; i <nEleme ; i++)
            a[i]=a[i+1];

            nEleme++;
            return true;
    }

    public void Dpirnt(){
        for (int i = 0; i <nEleme ; i++)
            System.out.print(a[i]+" ");
            System.out.println();
        System.out.println("count = " + count);

    }
}
