/* Example5_2.java -- �鱾�����°�������2��ʹ�ü����������Circle�� */
package book.example.chapter05;
import java.util.Scanner;

public class Example5_2 {

    public static void main(String[] args) {
        
        System.out.println("�����вεĹ��췽����Ϊ��Ա��������ֵ10");
        Circle c = new Circle(10);
        c.disp();
        
        System.out.println("ͨ�����̽���ֵ��Ϊ��Ա������ֵ");
        Scanner sc = new Scanner(System.in);
        Circle c2 = new Circle();
        System.out.println("����Բ�İ뾶��");
        c2.setRadius(sc.nextDouble());
        c2.disp();
        sc.close();
    }
}
