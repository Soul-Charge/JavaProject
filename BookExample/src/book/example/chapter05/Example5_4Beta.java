/* Example5_4Beta.java -- �鱾�����°�������4Beta�棺���Գ�Ա�������ʿ������η�����ͬ���� */
package book.example.chapter05;
import book.example.chapter05Beta.A;

public class Example5_4Beta {

    public static void main(String[] args) {
        
        A test = new A();

        /* public���η������������пɼ� */
        System.out.println(test.b);

        /* default���η�����ͬһ���пɼ� */
        //System.out.println(test.a); // ���ɼ�

        /* protected���η����ڲ�ͬ��������ɼ� */
        //System.out.println(test.d); // ���ɼ�

        /* private���η�����ͬһ���пɼ� */
        //System.out.println(test.c); // ���ɼ�
    }

}
