/* ThreeNight.java -- 第三章练习9：计算出斐波那契数列前40个数(纯循环) */
package book.exam.chapter03;

public class Exam3_9 {

    public static void main(String[] args) {

        final int N = 40; // 根据题意设置的常量
        int n1 = 1, n2 = 1;
        int sum = 0;
        System.out.print(n1 + " ");
        System.out.print(n2 + " ");
        
        /* 每次计算出后一项，然后用置换的方法将n1,n2往后累加一项 */
        for(int i = 3; i <= N; i++) {
            sum = n1 + n2;
            n1 = n2;
            n2 = sum;
            System.out.print(sum + " ");
        }
    }

}
