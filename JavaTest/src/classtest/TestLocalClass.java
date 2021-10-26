/* TestLocalClass.java -- ���Ծֲ��� */
package classtest;

class OutClass {
    String outS = "OUT"; // �ⲿ���Ա����

    void method() {
        String metS = "METHOD"; // �ⲿ���Ա����

        class LocalClass {
            String locS = "LOCAL"; // �ֲ����Ա
            String addS = outS + " " + metS; // �ֲ�����Է����ⲿ���Ա
        }
        //System.out.println(addS); // �ⲿ�಻�ܷ��ʾֲ����Ա
        LocalClass lc = new LocalClass();
        System.out.println(lc.locS); // LOCAL
        System.out.println(lc.addS); // OUT METHOD
    }
}

public class TestLocalClass {

    public static void main(String[] args) {

        OutClass oc = new OutClass();
        oc.method();
    }
}
