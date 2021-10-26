/* StaticInnerClassTest.java -- ��̬�ڲ������ */
package classtest;

class OuterClass{
    String outS = "OuterClass";
    void showAddString() {
        //System.out.println(outS + inS); // �ⲿ�಻�ܷ��ʾ�̬��Ա��
    }
    static class InnerClass {
        String inS = "InnerClass";
        static String inSS = "StaticInnerClass";

        void showAddString() {
            //System.out.println(outS + inS); // ��̬��Ա�಻�ܷ����ⲿ�Ǿ�̬��Ա
        }
    }
}
public class StaticInnerClassTest {

    public static void main(String[] args) {

        /* ��̬��Ա�����ֱ�ӵ��ý���ʵ����������Ҫʵ�����ⲿ����󣬵���Ҫ����Ƕ�׸�ʽ���� */
        OuterClass.InnerClass ic = new OuterClass.InnerClass();
        System.out.println(ic.inS); // InnerClass

        //System.out.println(OuterClass.InnerClass.inS); // ��̬��Ա���ʵ����������ֱ�ӷ���
        System.out.println(OuterClass.InnerClass.inSS);//   ��̬��Ա��ľ�̬��������ֱ�ӷ���

    }
}
