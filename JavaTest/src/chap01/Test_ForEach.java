/* Test_ForEach.java -- 测试for-each以及arraycopy()和Arrays.binarySearch() */
package chap01;

import java.util.Arrays;
import java.util.Scanner;

public class Test_ForEach {

    public static void main(String[] args) {

        double [] dNums = new double [10];
        double [] dNums2 = new double [10];
        String [] sArray = {"apple", "banana", "pinapple", "orange"};
        
        System.out.println("刚创建dNums和dNums2数组时：");
        System.out.println("Elements of dNums: ");
        for(double dNum: dNums)
            System.out.print(dNum + " ");

        System.out.println("\nElements of dNums2: ");
        for(double dNum: dNums2)
            System.out.print(dNum + " ");

        System.out.println("\n刚创建sArray时：");
        System.out.println("Elements of sArray: ");
        for(String s: sArray)
            System.out.print(s + " ");

        System.out.println("\n用随机数填充dNums数组：");
        for(int i = 0; i < dNums.length; i++)
            dNums[i] = Math.random();

        System.out.println("Elements of dNums: ");
        for(double dNum: dNums)
            System.out.print(dNum + " ");
        
        System.out.println("\n将dNums的第三位到第七位复制到dNums2的第五到十位");
        System.arraycopy(dNums, 2, dNums2, 4, 5); // 使用下标会少1

        System.out.println("Elements of dNums2: ");
        for(double dNum: dNums2)
            System.out.print(dNum + " ");

        /* 排序并在sArray中查找"banana"字符串 */
        Arrays.sort(sArray);
        System.out.println("\n排序后的sArrays数组：");
        System.out.println("Elements of sArray: ");
        for(String s: sArray)
            System.out.print(s + " ");
        
        System.out.println("\n输入要在sArray数组里查找的字符串");
        Scanner sc = new Scanner(System.in);
        String seekS = sc.next();

        int index = -1;
        index = Arrays.binarySearch(sArray, seekS);
        if(index > 0)
            System.out.println(seekS + "在sArrays的第" + (index+1) + "项");
        sc.close();
    }

}
