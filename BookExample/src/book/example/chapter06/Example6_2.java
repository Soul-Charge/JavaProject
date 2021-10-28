/* Example6_2.java -- 书本第六章案例代码2：变量隐藏测试*/
package book.example.chapter06;

class Person {
    String name = "程艳";
    String address = "中南路 8 号";
    void showDetail() {
        System.out.println("name: " + name + " address: " + address);
    }
}

class Student extends Person {
    String address = "高浪西路1600";
    String school  = "无锡职业技术学院";
    
    void showInfo() {
        showDetail(); // 父方法使用父类变量
        System.out.println("new address: " + address + " old address: " + super.address + 
                " school: " + school); // 派生类方法使用派生类成员变量
    }
}

public class Example6_2 {

    public static void main(String[] args) {

        Student s = new Student();
        s.showInfo();
    }
}
