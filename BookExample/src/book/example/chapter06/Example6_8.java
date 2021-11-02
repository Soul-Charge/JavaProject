/* Example6_8.java -- �ӿڼ̳нӿ�
 * 2021��11��2��
*/
package book.example.chapter06;

interface Shape3D extends Shape2D {
    double volume(); // ��Ϊ�ӿ��еķ�������ʽָ��Ϊpublic abstract�����Կ���ʡ��
}

class Circle2 implements Shape3D {
    double radius;
    Circle2(double radius) {
        this.radius = radius;
    }
    public double area() { // ��Ϊ����̳нӿ�Shape3D���Ҹýӿڼ̳�Shape2D����Ҫʵ�ָ��ӿڳ��󷽷�
        return PI * radius * radius;
    }
    public double volume() { // ��Ϊ����̳нӿ�Shape3D����Ҫʵ���䷽�����ӿ��ڷ�����Ϊ���󷽷�
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
