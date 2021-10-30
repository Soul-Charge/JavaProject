/* InheritanceTest.java -- 测试继承*/
package classtest;

class Shape {
    String color;

    Shape() {
    }
    Shape(String color) {
        this.color = color;
    }
}
class Circle extends Shape {
    private double radius;

    Circle() {
    }
    Circle(String color, double radius) {
        /* 可用三种方法给继承来的变量赋值 */
        //super(color);        // 调用基类的构造器
        //this.color = color;  // 使用this指向继承来的变量
        super.color = color;   // 使用super指向从基类继承来的变量
        this.radius = radius;
    }
    void disp() {
        System.out.println("color:" + color);
        System.out.println("radius:" + radius);
    }
}
public class InheritanceTest {

    public static void main(String[] args) {
        
        Shape s = new Shape("blue");
        Circle c = new Circle("red", 10);
        c.disp();
        System.out.println(s.color); // blue
    }
}
