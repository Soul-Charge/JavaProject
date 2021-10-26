/* Work6.java -- 书本第五章工作任务6：职工类设计*/
package book.workcometrue.chapter05;
import java.util.Scanner;

class Employee {
    private String id;         // 职工编号
    private String name;       // 职工姓名
    private String department; // 职工所属部门
    private String cardID;     // 职工身份证号
    private String phone;      // 职工联系方式
    private String email;      // 职工email
    private char sex;          // 职工性别
    /* getters和setters */
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
    /* 构造方法 */
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
    /* 显示职工信息 */
    void showEmpInfo() {
        System.out.println("职工姓名："+ name);
        System.out.println("性别：\t" + sex);
        System.out.println("身份证：\t" + cardID);
        System.out.println("编号：\t" +  id);
        System.out.println("部门：\t" +  department);
        System.out.println("电话：\t" +  phone);
        System.out.println("邮箱：\t" +  email);
    }
}

public class Work6 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Employee e1 = new Employee("001", "刘华强", "买瓜部", "123456789009876543",
                "12345678909", "123456@qq.com", '男');
        e1.showEmpInfo();

        Employee e2 = new Employee();
        System.out.println("请输入职工编号：");
        e2.setId(sc.next());
        System.out.println("请输入职工姓名：");
        e2.setName(sc.next());
        System.out.println("请输入职工所在部门：");
        e2.setDepartment(sc.next());
        System.out.println("请输入职工性别：");
        e2.setSex(sc.next().charAt(0));
        System.out.println("请输入职工电话：");
        e2.setPhone(sc.next());
        System.out.println("请输入职工身份证号：");
        e2.setCardID(sc.next());
        System.out.println("请输入职工邮箱：");
        e2.setEmail(sc.next());
        e2.showEmpInfo();
        sc.close();
    }
}
