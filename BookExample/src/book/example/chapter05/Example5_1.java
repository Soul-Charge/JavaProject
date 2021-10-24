/* Example5_1.java -- 书本第五章案例代码：定义一个Circle类 */
package book.example.chapter05;

class Circle {
    private double radius;

    /* 构造器 */
    Circle() {
        radius = 0;
    }
    Circle(double radius) {
        this.radius = radius;
    }
    /* getters和setters */
    double getRadius() {
        return radius;
    }
    void setRadius(double radius) {
        this.radius = radius;
    }
    /* 其他成员方法 */
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    double getArea() {
        return Math.PI * radius * radius;
    }
    void disp() {
        System.out.println("圆的周长为：" + getPerimeter());
        System.out.println("圆的面积为：" + getArea());
    }

}

public class Example5_1 {

    public static void main(String[] args) {
        
        Circle c = new Circle(10);
        c.disp();
    }

}
