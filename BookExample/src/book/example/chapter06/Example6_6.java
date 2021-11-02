/* Example6_6.java -- 书本第六章案例代码6（改）：类对象之间类型转换 
 * 经过个人修改，为体现出类型转换的影响
 * 2021年10月31日
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

        /* 1.子类对象转为父类类型的对象 */
        /* 进行 父类引用变量=子类对象 时，对象只能调用从父类继承或重写的方法 */
        Person1 p1 = new Student1();

        /* 1.1 转换为父类类型的子类对象不能操作子类新增成员变量和方法，错误*/
        //p1.no = "Can't"; // 新增的变量
        //p1.learn();      // 新增的方法

        /* 1.2 转换为父类类型的子类对象可以操作子类继承的成员变量/方法，和重写的成员方法 */
        p1.name = "Can"; // 继承的变量
        p1.listen();     // 继承的方法
        p1.talk();       // 重写的方法，调用的是重写版
        
        System.out.println("-----------------------");
        
        /* 2.被转为父类类型的子类对象转回子类类型对象 */
        Person1 p2 = new Person1();
        //Student1 s1 = (Student1)p2; // 只能将被转为父类的子类对象转回子类
        Student1 s1 = (Student1)p1;   // 将被转为父类的子类对象转回子类
        /* 转回子类类型的对象可以访问子类、父类成员变量和成员方法 */
        /* 调用重写方法时调用的是重写后的方法 */
        s1.name = "FatherClass"; // 父类变量
        s1.no   = "SubClass";    // 子类变量
        s1.talk();  // 重写的方法
        s1.listen();// 继承的方法
        s1.learn(); // 子类的方法
        
        /* 3.不能将父类类型的对象赋值给子类类型的引用变量 */
        Person1 p3 = new Person1();
        //Student1 s2 = (Student1)p3; // 虽然编辑器内没显示错误但编译会抛出类型不匹配异常
        /* 4.同类层次不能转换，错误 */
        //Student1 s3 = new Teacher1();
        
        System.out.println("-----------------------");
        
        /* 5.使用instanceof运算符判断引用变量引用的对象是否是该类或该类子类的对象 */
        /* p1引用的对象为Student1类，故为假 */
        if(p1 instanceof Teacher1)
            System.out.println("p1 is not the object of Teacher1 class");

        /* p1引用的对象为Student1类，故为真 */
        if(p1 instanceof Student1)
            System.out.println("p1 is the object of Student1");
        
        /* p1引用的对象为Student1类，为Person1子类，故为真 */
        if(p1 instanceof Person1)
            System.out.println("p1 is a child-class object of Person1 class");
    }
}