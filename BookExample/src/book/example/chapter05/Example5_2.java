/* Example5_2.java -- 书本第五章案例代码2：使用键盘输入测试Circle类 */
package book.example.chapter05;
import java.util.Scanner;

public class Example5_2 {

    public static void main(String[] args) {
        
        System.out.println("调用有参的构造方法，为成员变量赋初值10");
        Circle c = new Circle(10);
        c.disp();
        
        System.out.println("通过键盘接收值，为成员变量赋值");
        Scanner sc = new Scanner(System.in);
        Circle c2 = new Circle();
        System.out.println("输入圆的半径：");
        c2.setRadius(sc.nextDouble());
        c2.disp();
        sc.close();
    }
}
