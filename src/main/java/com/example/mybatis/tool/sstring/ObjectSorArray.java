package com.example.mybatis.tool.sstring;

public class ObjectSorArray {
   private ObjectSor[] objectSors;
   private int  nElems;

    public static void main(String[] args) {
        ObjectSorArray  objectSorArray=new ObjectSorArray(20);
        objectSorArray.insetr("a","a",10);
        objectSorArray.insetr("g","g",10);
        objectSorArray.insetr("f","f",10);
        objectSorArray.insetr("h","h",10);
        objectSorArray.insetr("b","b",10);
        objectSorArray.insetr("j","j",10);
        objectSorArray.insetr("c","c",10);
        objectSorArray.insetr("e","e",10);
        objectSorArray.insetr("d","d",10);
        System.out.println(" 排序前:");
        objectSorArray.display();

        System.out.println(" 排序后：" );
        objectSorArray.objectSort();
        objectSorArray.display();

    }
    public ObjectSorArray(int   max) {
        objectSors=new  ObjectSor[max];
        nElems=0;
    }
    public void insetr(String lastName,String firstName,int age){
       objectSors[nElems]= new ObjectSor(lastName,firstName,age);
       nElems++;

    }
    public void display(){
        for (int i = 0; i <nElems ; i++)
            objectSors[i].toString();
            System.out.println("    ");

    }
    /*
    一般插入排序:定义好位置和标记，取出位置，并标记好。
    判断标记是否>0，并且前面与后面大小（）
     */
    public void nomalSort(){
        int in,out;
        long[]  a=new long[10];
        for (out=0;out<nElems;out++){
            long temp=a[out];   //取出位置
            in=out;              //标记好
            while (in>0&&a[in]>a[in-1]){    //如果前一个大于后一个，则交换位置
                a[in]=a[in-1];
                --in;   //每换一次，标记的移动一次
            }
            a[in]=temp; //没进入循环时，给回原来位置；循环时，给到最小的位置
        }


    }
    /*
    对象插入排序，根据姓名排序
     */
    public void objectSort(){
        int in,out;
        for (out=0;out<nElems;out++)
        {
            ObjectSor temp=objectSors[out];
            in=out;
            while (in>0&&objectSors[in-1].getLastName().compareTo(temp.getLastName())>0)//根据String的字母顺序进行比较，返回值大于0，前面条件前
            {
                objectSors[in]=objectSors[in-1];
                --in;
            }
            objectSors[in]=temp;
        }
    }
}
