/*ThreeSeven.java -- ��������ϰ7��������ͼ����ĺ� */
package com.exam.chapter3;

public class Exam3_7 {

    public static void main(String[] args) {
        double y = 1;
        int index = 1;    // ��ĸָ��
        final int X = 10; // �ֶ��޸ĵĳ���(x > 1)
        int denominator = X; // ��ĸ

        while(true) { // ��һ��ѭ�����ڵ�����ĸ��ָ��

            /* �ڶ���ѭ�����ڵ��������ĸ��ֵ(x��index�η�) */
            for(int i = 1; i < index; i++) 
                denominator *= X;
            
            if((double) 1 / denominator < 1 / 10000)
                break;
            
            y += (double)1 / denominator;
            denominator = X; // ʹ��ĸ�ص���ʼֵ
            index++;
        }
        System.out.println("y = " + y);
    }

}
