/* Exam2_2.java -- 获取一个三位数后将其每一位取出重组成另一个三位数 */
package book.exam.chapter02;

import java.util.Scanner;

public class Exam2_2 {

    public static void main(String[] args) {

        /* n从键盘获取输入，应为一个三位数，将其拆分，百 十 个位分别由a b c表示， */
        /* 由cba表示的三位数m */
        int a, b, c, n, m;
        Scanner sc = new Scanner(System.in);

        System.out.println("输入一个三位整数：");
        n = sc.nextInt();
        a = n / 100;
        b = n / 10 % 10;
        c = n % 10;
        m = c * 100 + b * 10 + a;
        System.out.println("重组后的数为：" + m);
        sc.close();
    }

}
