/* ThreeFive.java -- ���ٷ���ת��Ϊ�ȼ��� */
package book.exam.chapter03;
import java.util.Scanner;

public class Exam3_5 {

    public static void main(String[] args) {
        int score;
        String level = "ERROR:����δ��ȷ��ʼ����������������";
        Scanner sc = new Scanner(System.in);
        
        System.out.println("�������:");
        score = sc.nextInt();
        if(score > 100 || score < 0) {
            System.err.println("������ΧΪ0~100!");
            java.lang.System.exit(1);
        }
        else if(score >= 90)
            level = "A";
        else if(score >= 80)
            level = "B";
        else if(score >= 70)
            level = "C";
        else if(score >= 60)
            level = "D";
        else
            level = "E";
        System.out.println("�ȼ�Ϊ" + level);
        sc.close();
    }

}
