/* Example6_7.java -- 书本第六章案例代码7：使用接口
 * 2021年11月2日
*/
package book.example.chapter06;

interface Shape2D {
    double PI = 3.1415926;
    public abstract double area();
}
class Circle1 implements Shape2D {
    double radius;
    void setRadius(double radius) {
        this.radius = radius;
    }
    public double area() {
        return PI * radius * radius;
    }
}

public class Example6_7 {

    public static void main(String[] args) {

        Circle1 c = new Circle1();
        c.setRadius(10);
        System.out.println("Area of circle: " + c.area());
    }
}
