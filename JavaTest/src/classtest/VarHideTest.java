/* VarHideTest.java -- ���Ա������� */
package classtest;

class Person {
    int age = 18;
    void show() {
        System.out.println("My age is " + age);
    }
}
class Student extends Person {
    int age = 20;
    void showInfo() {
        System.out.println("My age is " + age); // �̳����ı��������أ��˴���ageʹ�õ����������
        System.out.println("But my origin age is " + super.age); // ʹ��super�ؼ���ѡ��̳����ı���
    }
}
public class VarHideTest {

    public static void main(String[] args) {

        Student s = new Student();
        s.show();     // ʹ�ü̳еķ���������̳����ı���
        s.showInfo(); // ʹ�������������ķ��������������ඨ��ı���
    }
}