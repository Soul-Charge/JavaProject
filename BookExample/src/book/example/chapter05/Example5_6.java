/* Example5_6.java -- 书本第五章案例代码6：测试类方法和实例方法的区别 */
package book.example.chapter05;

class Student {
    private String name;
    private int age;
    private static String schoolName;
    
    /* 构造器 */
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /* getters和setters */
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
    
    /* 类方法 */
    static String getSchoolName() {
        return schoolName;
    }
    static void setSchoolName(String schoolName) {
        Student.schoolName = schoolName;
    }
}

public class Example5_6 {

    public static void main(String[] args) {

        Student jojo = new Student("乔乔", 18);
        Student dio = new Student("迪奥", 100);
        
        System.out.println("通过静态方法设置学校名");
        Student.setSchoolName("罗老师法律大学");

        System.out.println(jojo.getName() + "是" + Student.getSchoolName() + "的学生");
        System.out.println(dio.getName() + "是" + Student.getSchoolName() + "的学生");
        
        System.out.println("dio给学校改名中...");
        dio.setSchoolName("丧失人性法律大学");
        System.out.println("dio把学校名改成了" + Student.getSchoolName());

        System.out.println(jojo.getName() + "是" + Student.getSchoolName() + "的学生");
        System.out.println(dio.getName() + "是" + Student.getSchoolName() + "的学生");
    }

}
