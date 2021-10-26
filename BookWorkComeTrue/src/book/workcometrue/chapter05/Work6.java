/* Work6.java -- �鱾�����¹�������6��ְ�������*/
package book.workcometrue.chapter05;
import java.util.Scanner;

class Employee {
    private String id;         // ְ�����
    private String name;       // ְ������
    private String department; // ְ����������
    private String cardID;     // ְ�����֤��
    private String phone;      // ְ����ϵ��ʽ
    private String email;      // ְ��email
    private char sex;          // ְ���Ա�
    /* getters��setters */
    String getId() {
        return id;
    }
    String getName() {
        return name;
    }
    String getDepartment() {
        return department;
    }
    String getCardID() {
        return cardID;
    }
    String getPhone() {
        return phone;
    }
    String getEmail() {
        return email;
    }
    char getSex() {
        return sex;
    }
    void setId(String id) {
        this.id = id;
    }
    void setName(String name) {
        this.name = name;
    }
    void setDepartment(String department) {
        this.department = department;
    }
    void setCardID(String cardID) {
        this.cardID = cardID;
    }
    void setPhone(String phone) {
        this.phone = phone;
    }
    void setEmail(String email) {
        this.email = email;
    }
    void setSex(char sex) {
        this.sex = sex;
    }
    /* ���췽�� */
    Employee() {
    }
    Employee(String id, String name, String department, 
            String cardID, String phone, String email, char sex) {
        
        this.id = id;
        this.name = name;
        this.department = department;
        this.cardID = cardID;
        this.phone = phone;
        this.email = email;
        this.sex = sex;
    }
    /* ��ʾְ����Ϣ */
    void showEmpInfo() {
        System.out.println("ְ��������"+ name);
        System.out.println("�Ա�\t" + sex);
        System.out.println("���֤��\t" + cardID);
        System.out.println("��ţ�\t" +  id);
        System.out.println("���ţ�\t" +  department);
        System.out.println("�绰��\t" +  phone);
        System.out.println("���䣺\t" +  email);
    }
}

public class Work6 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Employee e1 = new Employee("001", "����ǿ", "��ϲ�", "123456789009876543",
                "12345678909", "123456@qq.com", '��');
        e1.showEmpInfo();

        Employee e2 = new Employee();
        System.out.println("������ְ����ţ�");
        e2.setId(sc.next());
        System.out.println("������ְ��������");
        e2.setName(sc.next());
        System.out.println("������ְ�����ڲ��ţ�");
        e2.setDepartment(sc.next());
        System.out.println("������ְ���Ա�");
        e2.setSex(sc.next().charAt(0));
        System.out.println("������ְ���绰��");
        e2.setPhone(sc.next());
        System.out.println("������ְ�����֤�ţ�");
        e2.setCardID(sc.next());
        System.out.println("������ְ�����䣺");
        e2.setEmail(sc.next());
        e2.showEmpInfo();
        sc.close();
    }
}
