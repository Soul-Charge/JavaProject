/* Example5_8.java -- �鱾�����°�������8������ʵ�����������ⲿ��ľ�̬��Ա�� */
package book.example.chapter05;

public class Example5_8 {
    String outS = "OUT";

    public static void main(String[] args) {
        
        InnerClass ic = new InnerClass();
        System.out.println(ic.inS); // IN
    }
    static class InnerClass {
        String inS = "IN";
        void showOut() {
            //System.out.println(outS); // ��̬��Ա�಻�ܷ����ⲿ�Ǿ�̬��Ա
        }
    }
}
