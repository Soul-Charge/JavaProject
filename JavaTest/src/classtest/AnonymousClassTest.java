/* AnonymousClassTest.java -- ����������ʵ�ֽӿ�
 * 2021��11��9��
*/
package classtest;

interface GeometryShape { // ������״�ӿ�
    public abstract void showShape();
}

public class AnonymousClassTest {

    static void showGeometryShape(GeometryShape gShape) {
        gShape.showShape();
    }
    void showGeometryShape2(GeometryShape gShape) {
        gShape.showShape();
    }

    public static void main(String[] args) {
        /* ʹ�ýӿ�ʵ�ּ�����״�ӿڣ����÷�ʽһ����̬���� */
        showGeometryShape(new GeometryShape() {
            public void showShape() {
                System.out.println("�ھ�̬������������������ʵ�ּ��νӿ�");
            }
        });

        /* ʹ�ýӿ�ʵ�ּ�����״�ӿڣ����÷�ʽ������̬���� */
        AnonymousClassTest anonTest = new AnonymousClassTest();
        anonTest.showGeometryShape2(new GeometryShape() {
            public void showShape() {
                System.out.println("��ʵ������������ʵ�ּ��νӿ�");
            }
        });
    }
}