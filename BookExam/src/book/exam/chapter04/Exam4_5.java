/* Exam4_5.java -- �鱾��������ϰ5������һ��5��5�����鲢��ʵ�֣� */
/* 1. ������ֵ����Сֵ�Լ����ǵ�����λ�� */
/* 2. ��������Խ����ϸ�Ԫ��֮�� */
package book.exam.chapter04;
import java.util.Scanner;

/* ��һ���õ������鷽�� */
class ArrayTools4_5 {

    /* �����ڸ���int�����в��Ҹ���intֵ���ɹ�����������ʧ�ܷ���-1 */
    public static int searchInt(int[] a, int key) {
        for(int i = 0; i < a.length; i++)
            if(key == a[i])
                return i;
        return -1;
    }
}

public class Exam4_5 {

    public static void main(String[] args) {
        
        final int ROW = 5;
        final int COL = 5;
        int [][] a = new int [ROW][COL];
        Scanner sc = new Scanner(System.in);
        
/* ����������
1 2 3 4 5
6 7 8 9 0
2 3 4 5 6
5 1 4 9 3
1 2 3 4 0
*/ 
        
        /* ¼������ */
        System.out.println("���������������֣��ÿո�ֿ�:");
        for(int row = 0; row < ROW; row++)
            for(int col = 0; col < COL; col++)
                a[row][col] = sc.nextInt();
        
        /* ������� 
        for(int row = 0; row < ROW; row++) {
            for(int col = 0; col < COL; col++) {
                System.out.print(a[row][col] + " ");
            }
                System.out.println();
        }
        */
        
        /* �ҳ������Сֵ */
        int max = a[0][0], min = a[0][0];
        for(int row = 0; row < ROW; row++)
            for(int col = 0; col < COL; col++) {
                if(max < a[row][col])
                    max = a[row][col];
                if(min > a[row][col])
                    min = a[row][col];
            }
        
        /* Ѱ�Ҳ������ֵ��������Ϣ */
        for(int row = 0; row < ROW; row++) {

            int maxCol = ArrayTools4_5.searchInt(a[row], max);
            int minCol = ArrayTools4_5.searchInt(a[row], min);
            /* �жϲ���� */
            if(maxCol != -1)
                System.out.println("���ֵ "+max+" λ�ڵ� "+(row+1) + " �е� "+(maxCol+1)+"��");
            if(minCol != -1)
                System.out.println("��Сֵ "+min+" λ�ڵ� "+(row+1) + " �е� "+(minCol+1)+"��");
        }

        /* ���������Խ���Ԫ�غ� */
        int mainSum = 0, viceSum = 0;
        /* ѭ���ñ��� */
        int row = 0;      // ������
        int mainCol = 0;  // �������Խ�����
        int viceCol = COL-1;// ���Ƹ��Խ�����
        while (row < ROW) {
            mainSum += a[row][mainCol];
            viceSum += a[row][viceCol];
            
            row++; mainCol++; viceCol--;
        }
        System.out.println("���Խ���Ԫ�غ�Ϊ��" + mainSum);
        System.out.println("���Խ���Ԫ�غ�Ϊ��" + viceSum);
        sc.close();
    }

}
