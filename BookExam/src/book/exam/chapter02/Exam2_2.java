/* Exam2_2.java -- ��ȡһ����λ������ÿһλȡ���������һ����λ�� */
package book.exam.chapter02;

import java.util.Scanner;

public class Exam2_2 {

    public static void main(String[] args) {

        /* n�Ӽ��̻�ȡ���룬ӦΪһ����λ���������֣��� ʮ ��λ�ֱ���a b c��ʾ�� */
        /* ��cba��ʾ����λ��m */
        int a, b, c, n, m;
        Scanner sc = new Scanner(System.in);

        System.out.println("����һ����λ������");
        n = sc.nextInt();
        a = n / 100;
        b = n / 10 % 10;
        c = n % 10;
        m = c * 100 + b * 10 + a;
        System.out.println("��������Ϊ��" + m);
        sc.close();
    }

}
