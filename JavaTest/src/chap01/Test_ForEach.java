/* Test_ForEach.java -- ����for-each�Լ�arraycopy()��Arrays.binarySearch() */
package chap01;

import java.util.Arrays;
import java.util.Scanner;

public class Test_ForEach {

    public static void main(String[] args) {

        double [] dNums = new double [10];
        double [] dNums2 = new double [10];
        String [] sArray = {"apple", "banana", "pinapple", "orange"};
        
        System.out.println("�մ���dNums��dNums2����ʱ��");
        System.out.println("Elements of dNums: ");
        for(double dNum: dNums)
            System.out.print(dNum + " ");

        System.out.println("\nElements of dNums2: ");
        for(double dNum: dNums2)
            System.out.print(dNum + " ");

        System.out.println("\n�մ���sArrayʱ��");
        System.out.println("Elements of sArray: ");
        for(String s: sArray)
            System.out.print(s + " ");

        System.out.println("\n����������dNums���飺");
        for(int i = 0; i < dNums.length; i++)
            dNums[i] = Math.random();

        System.out.println("Elements of dNums: ");
        for(double dNum: dNums)
            System.out.print(dNum + " ");
        
        System.out.println("\n��dNums�ĵ���λ������λ���Ƶ�dNums2�ĵ��嵽ʮλ");
        System.arraycopy(dNums, 2, dNums2, 4, 5); // ʹ���±����1

        System.out.println("Elements of dNums2: ");
        for(double dNum: dNums2)
            System.out.print(dNum + " ");

        /* ������sArray�в���"banana"�ַ��� */
        Arrays.sort(sArray);
        System.out.println("\n������sArrays���飺");
        System.out.println("Elements of sArray: ");
        for(String s: sArray)
            System.out.print(s + " ");
        
        System.out.println("\n����Ҫ��sArray��������ҵ��ַ���");
        Scanner sc = new Scanner(System.in);
        String seekS = sc.next();

        int index = -1;
        index = Arrays.binarySearch(sArray, seekS);
        if(index > 0)
            System.out.println(seekS + "��sArrays�ĵ�" + (index+1) + "��");
        sc.close();
    }

}
