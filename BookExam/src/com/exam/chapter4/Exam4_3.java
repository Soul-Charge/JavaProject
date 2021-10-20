/* Exam4_3.java -- 书本第四章练习3：打印杨辉三角 */
/* TODO: 根本没用到数组，要不要考虑再写一个版本 */
/* 主要使用此性质：第n行的m个数可表示为 C(n-1，m-1) */
package com.exam.chapter4;

/* 在此程序中使用的两个工具的类(计算阶乘和计算组合数) */
class Tools {

    public static int facInt(int n) { // 计算并返回int数阶乘
        int result = 1;
        for(int i = 1; i <= n; i++)
            result *= i;
        return result;
    }

    public static int arrNumInt(int n, int m) { //计算并返回排列数
        return Tools.facInt(n) / Tools.facInt((n - m));
    }

    public static int combNumInt(int n, int m) { // 返回组合数
        return Tools.arrNumInt(n, m) / Tools.facInt(m);
    }
}

public class Exam4_3 {

    public static void main(String[] args) {
        
        for(int row = 1; row <= 10; row++) {

            for(int col = 1; col <= row; col++) {

                System.out.print(Tools.combNumInt(row-1, col-1) + "\t");
            }
            System.out.println();
        }
    }
}
