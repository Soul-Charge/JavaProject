/* Exam4_1.java -- �鱾��������ϰ1����30�����Գɼ�¼�����鲢��ƽ���ɼ��Ͳ��������� */
package book.exam.chapter04;

import java.util.Scanner;

public class Exam4_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double [] scores = new double [30];
        double total = 0, count = 0; // �ֺܷͲ���������
        
        /* ��ȡ���뽫����¼������ */
        System.out.println("�ÿո�ָ�����30������:");
        for(int i = 0; i < scores.length; i++)
            scores[i] = sc.nextDouble();
        
        /* ������������ֺܷͲ��������� */
        for(double score: scores) {
            total += score;
            if(score < 60)
                count++;
        }
        System.out.println("ƽ����Ϊ: " + (total / scores.length));
        System.out.println("����������Ϊ: " + count);
        sc.close();
    }

}
