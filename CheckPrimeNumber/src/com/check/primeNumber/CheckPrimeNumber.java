/* CheckPrimeNumner.java -- ���һ������������Ƿ������� */
package com.check.primeNumber;
import java.util.Scanner;

public class CheckPrimeNumber {

    public static void main(String[] args) {
        /* �Ƚ�flag��ʼ��Ϊtrue��������ʱ��false���� */
        boolean isPrime = true;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a num: ");
        int n = sc.nextInt();
        
        /* ����Ƿ�Ϊ������ֻ�ܱ�1���䱾������(�㷨Ϊ����ܷ�1�ͱ���֮����������������������Ϊ���� */
        for(int i = 2; i < n; i++) { // ʹ��i < n ���2��n֮�����
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
