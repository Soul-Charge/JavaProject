/* AbstractClassTest.java -- 测试抽象类 */
package classtest2;

abstract class Shape {
    abstract double getArea(double length, double width);
    abstract double getPerimeter();
}
class Rectangle extends Shape {

    double getArea(double length, double width) {
        return length * width;
    }
    double getPerimeter(double length, double width) {//因为参数列表和父类中抽象方法声明不一致，错误
        return (length + width) * 2;
    }
}
class Circle extends Shape {
    private double radius;

    double getArea(double radius) { // 因为参数列表和父类中抽象方法声明不一致，错误
        return Math.PI * radius * radius;
    }
    double getPerimeter() { // 正常
        return Math.PI * radius * radius;
    }
}
public class AbstractClassTest {

    public static void main(String[] args) {

    }

}
