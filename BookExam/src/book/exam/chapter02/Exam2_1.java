/* Exam2_1.java -- ���㲢���һ�����볤��ľ��ε��ܳ������ */
package book.exam.chapter02;

import java.util.Scanner;

public class Exam2_1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double width, length, perimeter, area; // �� �� �ܳ� ���

        System.out.print("������εĳ��Ϳ��ÿո�ָ���");
        length = sc.nextDouble();
        width = sc.nextDouble();

        area = length * width;
        perimeter = (length + width) * 2;
        System.out.println("���ε��ܳ�Ϊ��" + perimeter);
        System.out.println("���ε����Ϊ��" + area);
        sc.close();
    }

}
