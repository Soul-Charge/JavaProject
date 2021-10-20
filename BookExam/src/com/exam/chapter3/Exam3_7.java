/*ThreeSeven.java -- 第三章练习7：计算调和级数的和 */
package com.exam.chapter3;

public class Exam3_7 {

    public static void main(String[] args) {
        double y = 1;
        int index = 1;    // 分母指数
        final int X = 10; // 手动修改的常量(x > 1)
        int denominator = X; // 分母

        while(true) { // 第一层循环用于迭代分母的指数

            /* 第二次循环用于迭代计算分母的值(x的index次方) */
            for(int i = 1; i < index; i++) 
                denominator *= X;
            
            if((double) 1 / denominator < 1 / 10000)
                break;
            
            y += (double)1 / denominator;
            denominator = X; // 使分母回到初始值
            index++;
        }
        System.out.println("y = " + y);
    }

}
