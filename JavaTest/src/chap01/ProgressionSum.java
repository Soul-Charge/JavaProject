/* ProgressionSum.java -- �����1�ӵ�����ֵn�ĺ� */
package chap01;
import java.util.Scanner;

public class ProgressionSum {

    public static void main(String[] args) {
        int i = 0, sum = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a num: ");
        int n = sc.nextInt();
        /* ����1��while���
        while(i <= n){
            sum += i;
            i++;
        }
        */
        /* ����2��do...while���
        do{
            sum += i;
            i++;
        }while(i <= n);
        */
        /* ����2.1��for��䣨���ʽ1����������
        for(int I = 0; I <= n ; I++)
            sum += I;
        */
        /* ����2.2��for��䣨���ʽ1��ʼ��������
        int I;
        for(I = 0; I <= n; I++)
            sum += I;
        */
        System.out.println("The sum is: " + sum);
        sc.close();
    }

}
