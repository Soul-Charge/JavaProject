/* Exam4_4.java -- �鱾��������ϰ4������������ܳɼ�����߷ֲ���� */
/* TODO: ��ʱ��������������ȸ�·�� */
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