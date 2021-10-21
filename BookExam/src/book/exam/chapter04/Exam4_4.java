package book.exam.chapter04;
import java.util.Scanner;

class Tool {
        
    /* ���������ظ���Int����ļӳ��汾�� src:ԭ������ addLen:Ҫ�ӳ���Ԫ����*/
    public static int[] arrayLenAddInt(int[] src, int addLen) {
        
        /* ����һ���ӳ������鲢��ֵ���ƹ�ȥ */
        int [] dest = new int [src.length + addLen];
        System.arraycopy(src, 0, dest, 0, src.length);
        return dest;
    }
}

public class Exam4_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /* ��ֻ�������ڴ��ѧ�źͳɼ��Ķ�ά���� */
        int [][] sheet = new int [5][4];
        
/*  ����������
1001 90 80 85
1002 70 75 80
1003 65 70 75
1004 85 60 70
1005 80 90 70
*/
        
        /* ¼��ɼ� */
        System.out.println("�밴 ѧ�� ��ѧ�ɼ� ���ĳɼ� Ӣ��ɼ� ��˳���������ݣ�");
        for(int row = 0; row < sheet.length; row++)
            for(int col = 0; col < sheet[row].length; col++)
                sheet[row][col] = sc.nextInt();

        /* ��������һ�У�����������ܳɼ� */
        for(int row = 0; row < sheet.length; row++) {
            int total = 0;

            for(int col = 0; col <= sheet[row].length; col++) { // ʹ��<=ʹ������+1�������һ�α�������

                if(col > 0 && col < sheet[row].length) // �����ܷ�
                    total += sheet[row][col];
                else if(col == sheet[row].length) { // ��col�������ֵ�����һ�α���������
                    sheet[row] = Tool.arrayLenAddInt(sheet[row], 1); // ����1Ԫ��
                    sheet[row][col] = total; // ����ܳɼ�
                    break; // �����һ�α����ֶ���������Ȼ����Ϊ�����������γ���ѭ��
                }
            }
        }
        
        /* ��������һ�У�������߷� */
    }
}