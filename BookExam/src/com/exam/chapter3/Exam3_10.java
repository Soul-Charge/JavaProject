/* ThreeTen.java --  求出1~599中至少有一位数字为5的所有整数 */
package com.exam.chapter3;

public class Exam3_10 {

    public static void main(String[] args) {
        
        /* 在每次循环中将数字分成1~3个数分别判断 */
        for(int i = 1; i <= 599; i++) {
            char a = '0', b = '0', c = '0'; // 分别存储百， 十， 个位对应的字符
            String numString;

            numString = (String.valueOf(i)); // 将整数转为对应的字符串

            /* 处理一位数 */
            if(i < 10) { 
                c = numString.charAt(0);

            /* 处理两位数 */
            } else if( i < 100) { // i >= 10 && i < 100
                b = numString.charAt(0);
                c = numString.charAt(1);

            /* 处理三位数 */
            } else { // i >= 100
                a = numString.charAt(0);
                b = numString.charAt(1);
                c = numString.charAt(2);
            }
            if (a == '5' || b == '5' || c == '5')
                System.out.print(i + " ");
        }
    }

}
