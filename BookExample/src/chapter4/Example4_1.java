/* Example4_1.java -- �鱾�����°�������1(�����޸İ�)������ƽ���֡���߷֡���ͷֵĳ��� */
package chapter4;
import java.util.Scanner;

public class Example4_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double total = 0;
        double max, min;
        int scores; // ����������
        
        System.out.println("�����������������");
        scores = sc.nextInt();
        double[] scoreList = new double[scores]; // ��������
        
        /* ��ȡ�����ʼ�����鲢������ܷ� */
        System.out.println("���Կո�Ϊ�����������" + scores + "������");
        for(int i = 0; i < scoreList.length; i++) {
            scoreList[i] = sc.nextDouble();
            total += scoreList[i];
        }
        
        /* �Ƚ�max��min��ʼ��Ϊ��Ԫ�� */
        /* ���������ҳ�������Сֵ����Ϊ��Ԫ���Ѹ�ֵ���Դӵڶ���Ԫ�ص�βԪ����ȱȽ� */
        max = scoreList[0];
        min = scoreList[0];
        for(int i = 1; i < scoreList.length; i++) {
            if(scoreList[i] > max)
                max = scoreList[i];
            if(scoreList[i] < min)
                min = scoreList[i];
        }
        System.out.println("ƽ����Ϊ��" + total / scores);
        System.out.println("��߷�Ϊ��" + max);
        System.out.println("��ͷ�Ϊ��" + min);
        sc.close();
    }

}
