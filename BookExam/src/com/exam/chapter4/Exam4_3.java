/* Exam4_3.java -- �鱾��������ϰ3����ӡ������� */
/* TODO: ����û�õ����飬Ҫ��Ҫ������дһ���汾 */
/* ��Ҫʹ�ô����ʣ���n�е�m�����ɱ�ʾΪ C(n-1��m-1) */
package com.exam.chapter4;

/* �ڴ˳�����ʹ�õ��������ߵ���(����׳˺ͼ��������) */
class Tools {

    public static int facInt(int n) { // ���㲢����int���׳�
        int result = 1;
        for(int i = 1; i <= n; i++)
            result *= i;
        return result;
    }

    public static int arrNumInt(int n, int m) { //���㲢����������
        return Tools.facInt(n) / Tools.facInt((n - m));
    }

    public static int combNumInt(int n, int m) { // ���������
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
