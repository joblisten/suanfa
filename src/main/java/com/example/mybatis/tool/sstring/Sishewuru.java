package com.example.mybatis.tool.sstring;

import java.io.IOException;

/**
 * 四舍五人
 */
public class Sishewuru {

    public static void main(String[] args) throws IOException {

        int num = 1989;
        String str = String.valueOf(num);

        int le = str.length();
        int[] result = new int[le];
        for (int i = 0; i < le; i++) {
            result[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        /*
        转换int数组
         */


        int lee = le - 1;//尾部

        if (result[lee] >= 5) {  //尾部如果大于5

            for (int i = lee; i > 0; i--) {

                result[i] = 0;  //尾部为0
                int re = result[i - 1] = result[i - 1] + 1; //尾部前面一个加1

                if (re == 10) {  //尾部前面一个判断
                    for (int j = re; j < i - 1; j++) {
                        result[j] = 0;
                        result[j - 1] = result[j - 1] + 1;
                    }
                }

                else {  //否则就是尾部为0，前面加1
                    break;
                }

            }

        } else {
            result[lee] = 0;
        }


        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }

    }
}
