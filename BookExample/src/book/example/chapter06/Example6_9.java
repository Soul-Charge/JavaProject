/* Example6_9.java -- 实现多个接口
 * 2021年11月2日
*/
package book.example.chapter06;

interface Color {
    public abstract void setColor(String color); // 虽然可以省略前面的修饰但是建议保留，防止遗忘
    static void showMsg() { // 接口可以有静态方法
        System.out.println("Msg");
    }
}
class Circle3 implements Shape2D, Color {
    private String color;
    private double radius;

    Circle3(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public double area() {
        return ((double)4 / 3) * PI * radius * radius * radius;
    }
}

public class Example6_9 {

    public static void main(String[] args) {
        
        Circle3 c = new Circle3(10);
        c.setColor("red");
        System.out.println("circle area: " + c.area());
        System.out.println("circle color: " + c.getColor());
        Color.showMsg();
    }
}