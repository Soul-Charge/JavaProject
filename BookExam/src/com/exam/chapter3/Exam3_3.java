/* ThreeThree.java -- 第三章练习3：一个简易计算程序 */
package com.exam.chapter3;
import java.util.Scanner;

public class Exam3_3 {

    public static void main(String[] args) {
        int data1 = 0, data2 = 0, result = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter data and operator like this:");
        System.out.println("data op data");
        System.out.println("op list: + - * /");
        data1 = sc.nextInt();
        String operator = sc.next();
        data2 = sc.nextInt();
        
        switch(operator) {
        case "+":
            result = data1 + data2;
            break;
        case "-":
            result = data1 - data2;
            break;
        case "*":
            result = data1 * data2;
            break;
        case "/":
            result = data1 / data2;
            break;
        default:
            System.out.println("Enter data and operator like this:");
            System.out.println("data op data");
            System.out.println("op list: + - * /");
            break;
        }
        System.out.println(data1 + " " + operator + " " + data2 + " = " + result);
        sc.close();
    }

}
