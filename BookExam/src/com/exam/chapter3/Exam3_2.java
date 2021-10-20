/* ThreeTwo.java -- Á·Ï°3.2£¬¼ÆËã·Ö¶Îº¯Êý */
package com.exam.chapter3;
import java.util.Scanner;

public class Exam3_2 {

    public static void main(String[] args) {
        int y;
        System.out.println("Enter a number for x:");
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        if(x < 1)
            y = x;
        else if(x < 10)
            y = 3 * x - 2;
        else
            y = 4 * x;
        System.out.println("y = " + y);
        sc.close();
    }

}
