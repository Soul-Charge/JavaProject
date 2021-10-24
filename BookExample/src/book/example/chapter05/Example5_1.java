/* Example5_1.java -- �鱾�����°������룺����һ��Circle�� */
package book.example.chapter05;

class Circle {
    private double radius;

    /* ������ */
    Circle() {
        radius = 0;
    }
    Circle(double radius) {
        this.radius = radius;
    }
    /* getters��setters */
    double getRadius() {
        return radius;
    }
    void setRadius(double radius) {
        this.radius = radius;
    }
    /* ������Ա���� */
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    double getArea() {
        return Math.PI * radius * radius;
    }
    void disp() {
        System.out.println("Բ���ܳ�Ϊ��" + getPerimeter());
        System.out.println("Բ�����Ϊ��" + getArea());
    }

}

public class Example5_1 {

    public static void main(String[] args) {
        
        Circle c = new Circle(10);
        c.disp();
    }

}
