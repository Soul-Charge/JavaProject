/* InheritanceTest2.java -- ��������ʹ�ø����getters��setters���� */
package classtest;

class SuperClass {
    private String superS = "SuperClass";

    String getSuperS() {
        return superS;
    }
    void setSuperS(String superS) {
        this.superS = superS;
    }
    void show() {
        System.out.println(superS);
    }
}
class SubClass extends SuperClass{
        private String subS = "SubClass";

    void show() {
        System.out.println("�����з��ʸ���˽�б���superS: " + getSuperS());
        System.out.println("���������ø���˽�б���superSΪ: " + subS);
        setSuperS(subS);
        System.out.println("�����з��ʸ���˽�б���superS: " + getSuperS());
    }
}
public class InheritanceTest2 {

    public static void main(String[] args) {

        SubClass sc = new SubClass();
        sc.show();
        SuperClass superC = new SuperClass();
        superC.show();
    }
}
