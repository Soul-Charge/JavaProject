/* ThreeSevenBeta.java -- ��������ϰ7��������ͼ���beta�棺ʹ��Math�� */
package com.exam.chapter3;

public class Exam3_7Beta {

    public static void main(String[] args) {
        final int X = 10; // ����x (x > 1)
        double y = 1;

        for(int i = 1; true; i++) {
            y += 1 / Math.pow(X, i);

            if(1 / Math.pow(X, i) < (double)1 / 10000)
                break;
        }
        System.out.println("y = " + y);
    }

}
