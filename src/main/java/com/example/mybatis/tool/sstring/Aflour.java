package com.example.mybatis.tool.sstring;
/*
分成多少几元几毛几分
 */
public class Aflour {

    public Aflour() {

    }

    public void getaa(int a, int b, int c,int money){
        int n;
        int count=0;
        int[] aaaa=new int[10000];
        for (int i = 0; i <a ; i++)
            for (int j = 0; j <b ; j++)
                for (int k = 0; k <c ; k++) {
                    n=(10*i)+(5*j)+(k*2);
                    count++;
                    aaaa[count++]=n;
                System.out.print(n+"   "); }
        System.out.println();
       int g;
        for (g= 0;  g<count ; g++)
            if (aaaa[g]==money)
                break;
            if (g==count)
                System.out.println("找不到完整的"+money+"元");
            else
                System.out.println("找到啦"+money+"元");








    }
}
