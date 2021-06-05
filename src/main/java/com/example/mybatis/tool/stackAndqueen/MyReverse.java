package com.example.mybatis.tool.stackAndqueen;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
单词翻转
 */
public class MyReverse {

    public static void main(String[] args)throws IOException {
        BufferedReader  bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String  s=bufferedReader.readLine();    //读取字符串
        MystackChar mystackChar=new MystackChar(s.length());    //创建栈

        System.out.println(" 你输入的是：" +s);
        for (int i = 0; i <s.length() ; i++) {
            char ch=s.charAt(i);    //遍历字符串成字符
            mystackChar.push(ch);       //进栈
        }
        String  outPut="  ";
        while (!mystackChar.isEmpty()){
            char ch2=mystackChar.pop();
            outPut=outPut+ch2;
        }
        System.out.println("翻转之后是：" + outPut);
    }
}
