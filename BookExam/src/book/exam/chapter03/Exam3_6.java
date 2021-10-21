/* ThreeSix.java -- 第三章练习6：计算1 + 1/2 + 1/3 + ... 1/100的和 */
package book.exam.chapter03;

public class Exam3_6 {

    public static void main(String[] args) {
        double sum = 0;
        for(int i = 1; i <= 100; i++)
            sum += (double)1 / i;
        System.out.println("1 + 1/2 + 1/3 + ... + 1/100 = " + sum);
    }

}
