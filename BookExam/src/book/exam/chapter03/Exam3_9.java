/* ThreeNight.java -- ��������ϰ9�������쳲���������ǰ40����(��ѭ��) */
package book.exam.chapter03;

public class Exam3_9 {

    public static void main(String[] args) {

        final int N = 40; // �����������õĳ���
        int n1 = 1, n2 = 1;
        int sum = 0;
        System.out.print(n1 + " ");
        System.out.print(n2 + " ");
        
        /* ÿ�μ������һ�Ȼ�����û��ķ�����n1,n2�����ۼ�һ�� */
        for(int i = 3; i <= N; i++) {
            sum = n1 + n2;
            n1 = n2;
            n2 = sum;
            System.out.print(sum + " ");
        }
    }

}
