/* VarHideTest.java -- 测试变量隐藏 */
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
        System.out.println("My age is " + age); // 继承来的变量被隐藏，此处的age使用的是派生类的
        System.out.println("But my origin age is " + super.age); // 使用super关键字选择继承来的变量
    }
}
public class VarHideTest {

    public static void main(String[] args) {

        Student s = new Student();
        s.show();     // 使用继承的方法，处理继承来的变量
        s.showInfo(); // 使用派生类声明的方法，处理派生类定义的变量
    }
}