/* ThreeSevenGamma.java -- ��������ϰ7��������ͼ����ð棺ʹ���Զ���ͷ��� */
package book.exam.chapter03;

class MathTools {
    /* ����int������ */
    public static int intPow(int base, int index) {
        int result = base;
        /* ����index-1�ε�������Ϊbase��index�η�����base���Լ�index-1�� */
        for(int i = 1; i < index; i++) { 
            result *= base;
        }
        return result;
    }
}

public class Exam3_7Gamma {

    public static void main(String[] args) {
        final int X = 5; // ������(x > 1)
        double y = 1;

        for (int i = 1; true; i++) {
            
            y += (double)1 / MathTools.intPow(X, i);

            if((double)1 / MathTools.intPow(X, i) < (double)1 / 10000)
                break;
        }
        System.out.println("y = " + y);
    }

}
