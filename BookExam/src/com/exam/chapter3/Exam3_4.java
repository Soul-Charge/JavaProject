/* ThreeFour.java -- ��������ϰ4�����㽱��˰���ʵ�ý��� */
package com.exam.chapter3;
import java.util.Scanner;

public class Exam3_4 {

    public static void main(String[] args) {
        double tax, rate;
        Scanner sc = new Scanner(System.in);

        System.out.println("���뽱��:");
        int bonus = sc.nextInt();
        
        /* ���ݽ������˰�ʲ�����˰�� */
        if(bonus < 500)
            rate = 0.0;
        else if(bonus < 1000)
            rate = 0.03;
        else if(bonus < 2000)
            rate = 0.05;
        else if(bonus < 5000)
            rate = 0.08;
        else
            rate = 0.12;
        tax = bonus * rate;
        System.out.println("��Ϊ��Ľ�����:" + bonus + "Ԫ��");
        System.out.println("���ն�Ӧ��˰��:" + rate * 100 + "%");
        System.out.println("��Ӧ�ý�˰" + tax + "Ԫ��");
        System.out.println("������Ľ���ֻʣ" + (bonus - tax) + "Ԫ����");
        sc.close();
    }
}
