/* ThreeOne.java -- 练习3.1，判断输入整数的正负和奇偶性 */
package book.exam.chapter03;
import java.util.Scanner;

public class Exam3_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个数：");
        int n = sc.nextInt();

        if(n > 0)
            System.out.println(n + "是正数");
        else
            System.out.println(n + "是负数");

        if(n % 2 == 0)
            System.out.println(n + "是偶数");
        else
            System.out.println(n + "是奇数");
        sc.close();
    }

}
