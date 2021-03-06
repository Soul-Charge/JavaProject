/* Example6_1.java -- Shape Circle Rectangle 类（使用继承）*/
package book.example.chapter06;

class Shape {
    String color;

    Shape() {
    }
    Shape(String color) {
        this.color = color;
    }

    void printColor() {
        System.out.println("Color is\t\t\t" + color);
    }
}
class Circle extends Shape {
    private double radius;

    Circle() {
    }
    Circle(double radius, String color) {
        this.color = color;
        this.radius = radius;
    }

    double getRadius() {
        return radius;
    }
    void setRadius(double radius) {
        this.radius = radius;
    }
    
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    double getArea() {
        return Math.PI * radius * radius;
    }
    void disp() {
        System.out.println("The perimeter of circle is\t" + getPerimeter());
        System.out.println("The Area of circle is\t\t" + getArea());
        printColor(); // 继承自Shape的方法
    }
}
class Rectangle extends Shape {
    private double length;
    private double width;
    
    Rectangle() {
    }
    Rectangle(String color, double length, double width) {
        /* 可以用两种不同的方法来初始化继承自Shape的成员变量color */
        //super.color = color; // 通过super获取继承自基类的color变量
        //this.color = color;  // 通过this指向自身继承来的color变量
        super(color);          // 通过调用基类的构造器
        this.length = length;
        this.width = width;
    }

    double getHeight() {
        return length;
    }
    double getWidth() {
        return width;
    }
    void setHeight(double length) {
        this.length = length;
    }
    void setWidth(double width) {
        this.width = width;
    }
    
    double getPerimeter() {
        return (length + width) * 2;
    }
    double getArea() {
        return length * width;
    }
    void disp() {
        System.out.println("The perimeter of rectangle is\t" + getPerimeter());
        System.out.println("The Area of rectangle is\t" + getArea());
        printColor(); // 继承自Shape的方法
    }
}

public class Example6_1 {

    public static void main(String[] args) {
        
        Circle c = new Circle();
        c.setRadius(10);
        c.color = "red";
        c.disp();
        
        System.out.println("------------------------------------");
        
        Rectangle r = new Rectangle("blue", 20, 10);
        r.disp();
    }
}
