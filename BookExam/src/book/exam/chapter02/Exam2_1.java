/* Exam2_1.java -- 计算并输出一个输入长宽的矩形的周长和面积 */
package book.exam.chapter02;

import java.util.Scanner;

public class Exam2_1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double width, length, perimeter, area; // 宽 长 周长 面积

        System.out.print("输入矩形的长和宽，用空格分隔：");
        length = sc.nextDouble();
        width = sc.nextDouble();

        area = length * width;
        perimeter = (length + width) * 2;
        System.out.println("矩形的周长为：" + perimeter);
        System.out.println("矩形的面积为：" + area);
        sc.close();
    }

}
