/* ThreeTen.java --  ���1~599��������һλ����Ϊ5���������� */
package com.exam.chapter3;

public class Exam3_10 {

    public static void main(String[] args) {
        
        /* ��ÿ��ѭ���н����ֳַ�1~3�����ֱ��ж� */
        for(int i = 1; i <= 599; i++) {
            char a = '0', b = '0', c = '0'; // �ֱ�洢�٣� ʮ�� ��λ��Ӧ���ַ�
            String numString;

            numString = (String.valueOf(i)); // ������תΪ��Ӧ���ַ���

            /* ����һλ�� */
            if(i < 10) { 
                c = numString.charAt(0);

            /* ������λ�� */
            } else if( i < 100) { // i >= 10 && i < 100
                b = numString.charAt(0);
                c = numString.charAt(1);

            /* ������λ�� */
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
