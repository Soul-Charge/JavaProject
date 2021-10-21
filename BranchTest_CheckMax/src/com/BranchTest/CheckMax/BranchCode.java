package com.BranchTest.CheckMax;
import java.util.Scanner;

public class BranchCode {

    public static void main(String[] args) {
        int a, b, c, max;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        a = sc.nextInt();
        System.out.println("Enter the second number: ");
        b = sc.nextInt();
        System.out.println("Enter the third number : ");
        c = sc.nextInt();
        
        if(a > b){
            if(a > c)
                max = a;
            else
                max = c;
        }else{
            if(b > c)
                max = b;
            else
                max = c;
        }
        System.out.println("The max is " + max);
        sc.close();
    }

}
