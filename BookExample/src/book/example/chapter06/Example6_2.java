/* Example6_2.java -- �鱾�����°�������2���������ز���*/
package book.example.chapter06;

class Person {
    String name = "����";
    String address = "����· 8 ��";
    void showDetail() {
        System.out.println("name: " + name + " address: " + address);
    }
}

class Student extends Person {
    String address = "������·1600";
    String school  = "����ְҵ����ѧԺ";
    
    void showInfo() {
        showDetail(); // ������ʹ�ø������
        System.out.println("new address: " + address + " old address: " + super.address + 
                " school: " + school); // �����෽��ʹ���������Ա����
    }
}

public class Example6_2 {

    public static void main(String[] args) {

        Student s = new Student();
        s.showInfo();
    }
}
