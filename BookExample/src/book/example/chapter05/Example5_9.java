/* Example5_9.java -- �鱾�����°�������9�����Ծֲ��� */
package book.example.chapter05;

public class Example5_9 {
    static int a;
    public static void main(String[] args) {

        class InnerClass {
            int add(int b) {
                return a + b;
            }
        }
        InnerClass ic = new InnerClass();
        a = 2;
        System.out.println(ic.add(3));
    }
}
