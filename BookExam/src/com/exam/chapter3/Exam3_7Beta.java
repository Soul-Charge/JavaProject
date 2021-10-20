/* ThreeSevenBeta.java -- 第三章练习7：计算调和级数beta版：使用Math类 */
package com.exam.chapter3;

public class Exam3_7Beta {

    public static void main(String[] args) {
        final int X = 10; // 常量x (x > 1)
        double y = 1;

        for(int i = 1; true; i++) {
            y += 1 / Math.pow(X, i);

            if(1 / Math.pow(X, i) < (double)1 / 10000)
                break;
        }
        System.out.println("y = " + y);
    }

}
