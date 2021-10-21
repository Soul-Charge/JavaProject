/* showDays.java -- ʹ��switch���ʵ����������������Ӧ������ */
package com.showDays.onYearsMonths;
import java.util.Scanner;

public class showDays {

    public static void main(String[] args) {
        int year, month, days;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Year: ");
        year = sc.nextInt();
        System.out.println("Enter Month: ");
        month = sc.nextInt();

        switch(month){
        case 1, 3, 5, 7, 8, 10, 12:
            days = 31;
            break;
        case 2:
            /* ��������Ƿ�Ϊ���꣨�ܱ�4���������ٵ�ֻ�ܱ�400������ */
            if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
                days = 29;
            else
                days = 28;
            break;
        default :
            days = 30;
        }
        System.out.println("The days of " + year + "/" + month + " is: " + days);
        sc.close();
    }

}
