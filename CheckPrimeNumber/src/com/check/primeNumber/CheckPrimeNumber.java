/* CheckPrimeNumner.java -- 检查一个输入的整数是否是素数 */
package com.check.primeNumber;
import java.util.Scanner;

public class CheckPrimeNumber {

    public static void main(String[] args) {
        /* 先将flag初始化为true，后面检测时用false覆盖 */
        boolean isPrime = true;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a num: ");
        int n = sc.nextInt();
        
        /* 检查是否为素数：只能被1和其本身整除(算法为检查能否被1和本身之间所有数整除，都不能则为素数 */
        for(int i = 2; i < n; i++) { // 使用i < n 检查2到n之间的数
            if(n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if(isPrime)
            System.out.println("The number " + n + " is a prime number.");
        else
            System.out.println("The number " + n + " is not a prime number.");
        sc.close();
    }

}
