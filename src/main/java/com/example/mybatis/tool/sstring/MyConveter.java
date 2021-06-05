package com.example.mybatis.tool.sstring;

import java.io.IOException;

/*
十六进制转10进制
 */
public class MyConveter {
    private long d=0;
    private int x=0;
    private char  ch=' ';
    public void conGet(){
        try {
            ch= (char) System.in.read();
            while(ch!='\r'){
                switch (ch){
                    case '0': case '1':case '3':case '4':case '5': case '6':
                    case '7':case '8':case '9':
                        x=(ch-'0');
                        break;  //匹配到了退出
                    case 'A': case 'B':case 'C':case 'D':case 'E': case 'F':
                      x=(ch-'A')+10;
                      break;
                    case 'a': case 'b':case 'c':case 'd':case 'e': case 'f':
                        x=(ch-'A')+10;
                        break;
                }
                d=d*16+x;   //执行权位叠加
                ch= (char) System.in.read();    //继续读取下一个字符


            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
