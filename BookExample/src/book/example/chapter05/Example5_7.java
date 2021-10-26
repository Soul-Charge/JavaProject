/* Example5_7.java -- �鱾�����°�������7�����ԷǾ�̬�ڲ���/��Ա�� */
/* ������Ϊ������̫����⣬�ɼ�JavaTest�е�InnerClassTest.java */
package book.example.chapter05;

public class Example5_7 {
    String outS = "OuterString";
    
    public static void main(String[] args) {

        Example5_7 oc = new Example5_7();
        //Example5_7.InnerClass ic = oc.new InnerClass();

        /* �ڲ�����ʵ�������ڲ�����ⲿ��֮��ʱ����ֱ��ʹ���ڲ����������ͣ������������ϸ�ʽ */
        InnerClass ic = oc.new InnerClass();
        System.out.println(oc.outS);// OuterString
        System.out.println(ic.inS); // InnerString
        ic.showString(); // OuterString InnerString
    }

    class InnerClass {
        String inS = "InnerString";
        void showString() {
            System.out.println(outS + " " + inS);
        }
    }
}
