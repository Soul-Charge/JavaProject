/* Example4_2.java -- �鱾�����°�������2�����鷴�� */
package book.example.chapter04;
import java.util.Scanner;

public class Example4_2 {

    public static void main(String[] args) {

        /* ��������ʼ������ */
        int[] array = new int[7];
        Scanner sc = new Scanner(System.in);
        System.out.println("�������߸�����: ");
        for(int i = 0; i < array.length; i++)
            array[i] = sc.nextInt();
        
        /* �������� */
        int temp; // ��ʱ�洢�ı���
        for(int i = 0; i < array.length / 2; i++) {
            temp = array[i]; // ��ֵ��ʱ�洢
            array[i] = array[array.length-1-i]; // βֵ������ֵ(��-iʵ��βֵ��ǰ�ƶ�)
            array[array.length-1-i] = temp; // ȡ����ֵ����βֵ
        }
        
        for(int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        sc.close();
    }

}
