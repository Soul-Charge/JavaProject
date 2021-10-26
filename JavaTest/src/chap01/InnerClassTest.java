/* InnerClassTest.java -- �����ڲ���-��Ա�� */
package chap01;

class OuterClass {
    String outS = "OuterClass ";
    //String a = inS; // �ⲿ�಻�ܷ����ڲ���ĳ�Ա����

     class InnerClass {
        String inS = " InnerClass";
        String mergeS = outS + inS; // �ڲ�����Է����ⲿ��ĳ�Ա����
    }
}

public class InnerClassTest {

    public static void main(String[] args) {
        
        OuterClass oc = new OuterClass();
        OuterClass.InnerClass ic = oc.new InnerClass();
        System.out.println(oc.outS);  //OuterClass 
        System.out.println(ic.inS);   // InnerClass
        System.out.println(ic.mergeS);//OuterClass  InnerClass
    }
}