/* Example4_3.java -- �鱾�����°�������3���������ʽ������� */
package book.example.chapter04;
import java.util.Scanner;

public class Example4_3 {

    public static void main(String[] args) {
        
        int[][] a = new int[3][4]; // ����һ���������3��4������
        Scanner sc = new Scanner(System.in);

        System.out.println("������12������");
        for(int row = 0; row < a.length; row++) // ������
            for(int col = 0; col < a[row].length; col++)
                a[row][col] = sc.nextInt();

        System.out.println("�����ʽ�������");
        for(int row = 0; row < a.length; row++) { // ������

            for(int col = 0; col < a[row].length; col++) { // ������

                System.out.print(a[row][col] + "\t");
                if((col+1) % 4 == 0) // �ĸ�����һ��
                    System.out.println("");
            }
        }
    }

}
