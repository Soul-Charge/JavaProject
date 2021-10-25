/* Example5_6.java -- �鱾�����°�������6�������෽����ʵ������������ */
package book.example.chapter05;

class Student {
    private String name;
    private int age;
    private static String schoolName;
    
    /* ������ */
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /* getters��setters */
    String getName() {
        return name;
    }
    int getAge() {
        return age;
    }
    void setAge(int age) {
        this.age = age;
    }
    void setName(String name) {
        this.name = name;
    }
    
    /* �෽�� */
    static String getSchoolName() {
        return schoolName;
    }
    static void setSchoolName(String schoolName) {
        Student.schoolName = schoolName;
    }
}

public class Example5_6 {

    public static void main(String[] args) {

        Student jojo = new Student("����", 18);
        Student dio = new Student("�ϰ�", 100);
        
        System.out.println("ͨ����̬��������ѧУ��");
        Student.setSchoolName("����ʦ���ɴ�ѧ");

        System.out.println(jojo.getName() + "��" + Student.getSchoolName() + "��ѧ��");
        System.out.println(dio.getName() + "��" + Student.getSchoolName() + "��ѧ��");
        
        System.out.println("dio��ѧУ������...");
        dio.setSchoolName("ɥʧ���Է��ɴ�ѧ");
        System.out.println("dio��ѧУ���ĳ���" + Student.getSchoolName());

        System.out.println(jojo.getName() + "��" + Student.getSchoolName() + "��ѧ��");
        System.out.println(dio.getName() + "��" + Student.getSchoolName() + "��ѧ��");
    }

}
