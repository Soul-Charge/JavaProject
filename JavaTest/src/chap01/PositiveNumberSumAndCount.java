/* PositiveNumberSumAndCount.java -- ͳ�������ʮ���������ó������ĺͼ����� */
package chap01;
import java.util.Scanner;

public class PositiveNumberSumAndCount {

    public static void main(String[] args) {
        int n;
        int positiveCount = 0, positiveSum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 10 integer(use space to divide: ");
        for(int i = 0; i < 10; i++) {
            n = sc.nextInt();
            if (n <= 0)
                continue;
            positiveCount++;
            positiveSum += n;
        }
        System.out.println("You enter " + positiveCount + " and sum is " + positiveSum);
        sc.close();
    }
}
