/* ThreeFour.java -- 第三章练习4：计算奖金税款和实得奖金 */
package com.exam.chapter3;
import java.util.Scanner;

public class Exam3_4 {

    public static void main(String[] args) {
        double tax, rate;
        Scanner sc = new Scanner(System.in);

        System.out.println("输入奖金:");
        int bonus = sc.nextInt();
        
        /* 根据奖金调整税率并计算税金 */
        if(bonus < 500)
            rate = 0.0;
        else if(bonus < 1000)
            rate = 0.03;
        else if(bonus < 2000)
            rate = 0.05;
        else if(bonus < 5000)
            rate = 0.08;
        else
            rate = 0.12;
        tax = bonus * rate;
        System.out.println("因为你的奖金是:" + bonus + "元，");
        System.out.println("按照对应的税率:" + rate * 100 + "%");
        System.out.println("你应该交税" + tax + "元。");
        System.out.println("所以你的奖金只剩" + (bonus - tax) + "元啦！");
        sc.close();
    }
}
