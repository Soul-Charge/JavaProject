/* InheritanceTest.java -- ���Լ̳�*/
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
        /* �������ַ������̳����ı�����ֵ */
        //super(color);        // ���û���Ĺ�����
        //this.color = color;  // ʹ��thisָ��̳����ı���
        super.color = color;   // ʹ��superָ��ӻ���̳����ı���
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
