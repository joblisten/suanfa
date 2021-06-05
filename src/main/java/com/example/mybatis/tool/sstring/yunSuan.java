package com.example.mybatis.tool.sstring;


import com.example.mybatis.tool.importantJava.TheradTest.Re;

public class yunSuan {
    public static void aa(){
        int a=10;
        int b=a++;  //b先拿到a的值，然后a再自加
        int c=++a;  //a先自加，c在拿a的值
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
    public static void bb(){
        int a=2;
        int b=2;
        if(a++==3&++b==3){  //a先判断，在自增；b先自增，在判断
            a=7;
        }
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        int x=105;
        while(true){
            if(x++>105){
                break;
            }
        }
        System.out.println("x = " + x);


        int x1=2,y1=5;
        switch (x){
            default:y1++;  //switch都要判断一次
            case 3:y1++;
            case 4:y1++;
            case 5:y1++;
        }
        System.out.println("x1 = " + x1);
        System.out.println("y1 = " + y1);


        Boolean b1=true;
        if(b1==false) //b1=false 是把false赋值在给b;而==cais才是判断
            System.out.println(" a");
        else if(b1) System.out.println(" b");   //b1表示是ture，不管b1之前取什么值
        else if(!b1) System.out.println(" c");   //!b1表示是false
        else System.out.println("d");




    }
    public static int cc(){

        int q=10;
        return q++; //先运算在自增

    }

        public static int div(int a, int b) {
            try {
                return a / b;
            }catch(NullPointerException e){
                System.out.println("ArithmeticException");
            }
            catch (ArithmeticException e) {
                System.out.println("ArithmeticException");
            }
            catch(Exception e){
                System.out.println("Exception");
            }finally {
                System.out.println("finally");
            }
            return 0;
        }
    public static void hh() {
        int[] a = new int[]{5, 2, 1, 4, 6,8};
        int[] b = new int[]{2, 0, 5, 2, 2, 4, 3, 1, 0, 4, 0};
        String tel = " ";
        for(int t:b)
            tel+=a[t];
        System.out.println("tel = " + tel);
    }






    public static void main(String[] args) {

        System.out.println("robbit(12) = " + robbit(12));

    }
    public static int robbit(int i) {
        if (i < 2)
            return i==0?0:1;

        return robbit(i-1) + robbit(i-2);
    }


}

