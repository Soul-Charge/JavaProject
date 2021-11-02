/* Example6_6.java -- �鱾�����°�������6���ģ��������֮������ת�� 
 * ���������޸ģ�Ϊ���ֳ�����ת����Ӱ��
 * 2021��10��31��
*/
package book.example.chapter06;

class Person1 {
    String name;
    void talk() {
        System.out.println("A person is talking...");
    }
    void listen() {
        System.out.println("A person is listening...");
    }
}
class Student1 extends Person1 {
    String no;
    @Override
    void talk() {
        System.out.println("Students is talking...");
    }
    void learn() {
        System.out.println("Students is learning...");
    }
}
class Teacher1 extends Person1 {
    String workNo;
    @Override
    void talk() {
        System.out.println("Teacher is talking...");
    }
    void teach() {
        System.out.println("Teacher is teaching...");
    }
}
public class Example6_6 {

    public static void main(String[] args) {

        /* 1.�������תΪ�������͵Ķ��� */
        /* ���� �������ñ���=������� ʱ������ֻ�ܵ��ôӸ���̳л���д�ķ��� */
        Person1 p1 = new Student1();

        /* 1.1 ת��Ϊ�������͵���������ܲ�������������Ա�����ͷ���������*/
        //p1.no = "Can't"; // �����ı���
        //p1.learn();      // �����ķ���

        /* 1.2 ת��Ϊ�������͵����������Բ�������̳еĳ�Ա����/����������д�ĳ�Ա���� */
        p1.name = "Can"; // �̳еı���
        p1.listen();     // �̳еķ���
        p1.talk();       // ��д�ķ��������õ�����д��
        
        System.out.println("-----------------------");
        
        /* 2.��תΪ�������͵��������ת���������Ͷ��� */
        Person1 p2 = new Person1();
        //Student1 s1 = (Student1)p2; // ֻ�ܽ���תΪ������������ת������
        Student1 s1 = (Student1)p1;   // ����תΪ������������ת������
        /* ת���������͵Ķ�����Է������ࡢ�����Ա�����ͳ�Ա���� */
        /* ������д����ʱ���õ�����д��ķ��� */
        s1.name = "FatherClass"; // �������
        s1.no   = "SubClass";    // �������
        s1.talk();  // ��д�ķ���
        s1.listen();// �̳еķ���
        s1.learn(); // ����ķ���
        
        /* 3.���ܽ��������͵Ķ���ֵ���������͵����ñ��� */
        Person1 p3 = new Person1();
        //Student1 s2 = (Student1)p3; // ��Ȼ�༭����û��ʾ���󵫱�����׳����Ͳ�ƥ���쳣
        /* 4.ͬ���β���ת�������� */
        //Student1 s3 = new Teacher1();
        
        System.out.println("-----------------------");
        
        /* 5.ʹ��instanceof������ж����ñ������õĶ����Ƿ��Ǹ�����������Ķ��� */
        /* p1���õĶ���ΪStudent1�࣬��Ϊ�� */
        if(p1 instanceof Teacher1)
            System.out.println("p1 is not the object of Teacher1 class");

        /* p1���õĶ���ΪStudent1�࣬��Ϊ�� */
        if(p1 instanceof Student1)
            System.out.println("p1 is the object of Student1");
        
        /* p1���õĶ���ΪStudent1�࣬ΪPerson1���࣬��Ϊ�� */
        if(p1 instanceof Person1)
            System.out.println("p1 is a child-class object of Person1 class");
    }
}