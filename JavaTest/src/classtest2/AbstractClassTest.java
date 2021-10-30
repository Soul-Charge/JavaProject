/* AbstractClassTest.java -- ���Գ����� */
package classtest2;

abstract class Shape {
    abstract double getArea(double length, double width);
    abstract double getPerimeter();
}
class Rectangle extends Shape {

    double getArea(double length, double width) {
        return length * width;
    }
    double getPerimeter(double length, double width) {//��Ϊ�����б�͸����г��󷽷�������һ�£�����
        return (length + width) * 2;
    }
}
class Circle extends Shape {
    private double radius;

    double getArea(double radius) { // ��Ϊ�����б�͸����г��󷽷�������һ�£�����
        return Math.PI * radius * radius;
    }
    double getPerimeter() { // ����
        return Math.PI * radius * radius;
    }
}
public class AbstractClassTest {

    public static void main(String[] args) {

    }

}
