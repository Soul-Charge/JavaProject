/* Example6_8.java -- 接口继承接口
 * 2021年11月2日
*/
package book.example.chapter06;

interface Shape3D extends Shape2D {
    double volume(); // 因为接口中的方法会隐式指定为public abstract，所以可以省略
}

class Circle2 implements Shape3D {
    double radius;
    Circle2(double radius) {
        this.radius = radius;
    }
    public double area() { // 因为该类继承接口Shape3D，且该接口继承Shape2D，故要实现父接口抽象方法
        return PI * radius * radius;
    }
    public double volume() { // 因为该类继承接口Shape3D，故要实现其方法，接口内方法皆为抽象方法
        return ((double)4 / 3) * PI * radius * radius * radius;
    }
}

public class Example6_8 {

    public static void main(String[] args) {

        Circle2 c = new Circle2(10D);
        System.out.println("The area of circle is: " + c.area());
        System.out.println("The volume of ball is: " + c.volume());
    }
}
