/* Exam4_4Beta.java -- �鱾��������ϰ4�������ܳɼ�����߷ֲ���� */
package book.exam.chapter04;
import java.util.Scanner;

/* �������Ե����鹤���� */
class ArrayTools {

    /* ��ӡ�������� */
    public static void showSheet(int[][] a) {
        
        System.out.println("ѧ��\t��ѧ\t����\tӢ��\t�ܳɼ�");
        for(int row = 0; row < a.length; row++) {
            
            if(row == a.length-1) {
                System.out.print("��߷�\t");
                for(int col = 1; col < a[row].length-1; col++)
                    System.out.print(a[row][col] + "\t");
            }
            else {
                for(int col = 0; col < a[row].length; col++) {
                    System.out.print(a[row][col] + "\t");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}

/*  ����������
1001 90 80 85
1002 70 75 80
1003 65 70 75
1004 85 60 70
1005 80 90 70
*/

public class Exam4_4Beta {
    
    public static void main(String[] args) {

        final int ROW = 6;
        final int COL = 5;
        int [][] sheet = new int [ROW][COL]; // ֱ�Ӵ���6��5�е����飬��Ȼ���˷�����Ԫ�صĿռ�
        Scanner sc = new Scanner(System.in);
        
        /* ¼������ */
        System.out.println("�밴 ѧ�� ��ѧ�ɼ� ���ĳɼ� Ӣ��ɼ� ��˳���������ݣ�");
        for(int row = 0; row < ROW-1; row++) // ����1~5��
            for(int col = 0; col < COL-1; col++) // ����1~4��
                sheet[row][col] = sc.nextInt();

        //ArrayTools.show2ArrayInt(sheet);
        
        /* ���㲢¼���ܳɼ� */
        for(int row = 0; row < ROW-1; row++) { // ����1~5��

            int total = 0;
            for(int col = 1; col < COL; col++) { // ����2~5��
                
                if(col == COL-1) // ���ڵ�5�У���ֵ
                    sheet[row][col] = total;
                else                         // 2~4�У��ۼ��ܺ�
                    total += sheet[row][col];
            }
        }
        //ArrayTools.show2ArrayInt(sheet);
        
        /* Ѱ����߷ֲ�¼�� */
        for(int col = 1; col <= COL-2; col++) { // 2~4��
            
            int max = 0;
            for(int row = 0; row < ROW; row++) { // 1~6��
                
                if(row == ROW-1) // ��6�У���ֵ
                    sheet[row][col] = max;
                else if(max < sheet[row][col]) // û����6�н��бȽ�
                    max = sheet[row][col];
            }
        }

        ArrayTools.showSheet(sheet);
        sc.close();
    }

}
