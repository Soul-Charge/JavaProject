/* Example5_4.java -- �鱾�����°�������4�����Գ�Ա�������ʿ������η���ͬһ���� */
package book.example.chapter05;

class A {
    char a = 'a';
    public char b = 'b';
    private char c = 'c';
    protected char d = 'd';
}

public class Example5_4 {

    public static void main(String[] args) {

        A test = new A();

        /* public���η������������пɼ� */
        System.out.println(test.b);

        /* default���η�����ͬһ���пɼ� */
        System.out.println(test.a);

        /* protected���η����ڲ�ͬ��������ɼ� */
        System.out.println(test.d);

        /* private���η�����ͬһ���пɼ� */
        // System.out.println(test.c); // ����test.c���ɼ�
    }

}
