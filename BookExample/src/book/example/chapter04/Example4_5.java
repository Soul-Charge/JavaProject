/* Example4_5.java -- �鱾�����°�������5��ʹ������ʵ������������99�˷��� */
/*TODO: �鱾61ҳ��*/
/*TODO: QTMD��������˷����㷨�ȼ�ס����*/
package book.example.chapter04;

public class Example4_5 {

    public static void main(String[] args) {

        int row, col;
        /* ���������鲻�����ȴ���һά */
        int [][] sheet = new int [9][];

        /* ���������һά������9��1�ĳ��ȴ����ڶ�ά */
        for(row = 0, col = 9; row < sheet.length; row++, col--)
            sheet[row] = new int [col]; // ע�������col�Ǵ���ά�ȵĳ��ȶ������±�,���Դ�9��ʼ
        
        /* �������1��9(�����±��0��8) */
        for(row = 0; row < sheet.length; row++)
            /* �ҳ�����1��9(�����±��0��8) */
            for(col = 0; col < sheet[row].length; col++)
                /* ��������ҳ����õ���ǰ�� */
                sheet[row][col] = (row+1) * (col+1);
        
        /* ��ӡ˳��Ϊ�������¡������� */
        for(row = 0; row < sheet.length; row++) {
            
            for(col = 0; col < row; col++) {
                
                System.out.print((row+1) + " * " + (col+1) + " = ");
                System.out.print(sheet[row][col] + "\t");
            }
            System.out.println("");
        }
    }

}
