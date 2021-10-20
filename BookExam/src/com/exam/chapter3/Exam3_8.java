/* ThreeEight.java -- 第三章练习8：求π的近似值 */
package com.exam.chapter3;

public class Exam3_8 {

    public static void main(String[] args) {
        final int N = 1000;
        double halfPi = (2D / 1) * (2D / 3);

        for(double i = 2; i <= N; i++) {
            halfPi *= (2*i / (2*i-1)) * (2*i / (2*i+1));
        }
        System.out.println("When n = " + N + ", PI = " + halfPi * 2);
    }

}
