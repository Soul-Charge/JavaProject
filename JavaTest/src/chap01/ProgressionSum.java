/* ProgressionSum.java -- 计算从1加到给定值n的和 */
package chap01;
import java.util.Scanner;

public class ProgressionSum {

    public static void main(String[] args) {
        int i = 0, sum = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a num: ");
        int n = sc.nextInt();
        /* 方法1：while语句
        while(i <= n){
            sum += i;
            i++;
        }
        */
        /* 方法2：do...while语句
        do{
            sum += i;
            i++;
        }while(i <= n);
        */
        /* 方法2.1：for语句（表达式1声明变量）
        for(int I = 0; I <= n ; I++)
            sum += I;
        */
        /* 方法2.2：for语句（表达式1初始化变量）
        int I;
        for(I = 0; I <= n; I++)
            sum += I;
        */
        System.out.println("The sum is: " + sum);
        sc.close();
    }

}
