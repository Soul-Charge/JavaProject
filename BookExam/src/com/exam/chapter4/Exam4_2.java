/* Exam4_2.java -- �鱾�����±����ϰ2������ǰ����Ϊ0 0 2 5����ÿ��Ϊǰ����ĺ͵�����ǰ20�� */
package com.exam.chapter4;

public class Exam4_2 {

    public static void main(String[] args) {

        int [] a = new int [20];
        a[0] = 0;
        a[1] = 0;
        a[2] = 2;
        a[3] = 5;
        for(int i = 4; i < a.length; i++)
            a[i] = a[i-1] + a[i-2] + a[i-3] + a[i-4];

        for(int i: a)
            System.out.print(i + " ");
    }

}
