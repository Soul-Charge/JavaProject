/* ThreeOne.java -- ��ϰ3.1���ж�������������������ż�� */
package book.exam.chapter03;
import java.util.Scanner;

public class Exam3_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("����һ������");
        int n = sc.nextInt();

        if(n > 0)
            System.out.println(n + "������");
        else
            System.out.println(n + "�Ǹ���");

        if(n % 2 == 0)
            System.out.println(n + "��ż��");
        else
            System.out.println(n + "������");
        sc.close();
    }

}
