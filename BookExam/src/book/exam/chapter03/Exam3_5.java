/* ThreeFive.java -- 将百分制转换为等级制 */
package book.exam.chapter03;
import java.util.Scanner;

public class Exam3_5 {

    public static void main(String[] args) {
        int score;
        String level = "ERROR:变量未正确初始化，请检查输入数据";
        Scanner sc = new Scanner(System.in);
        
        System.out.println("输入分数:");
        score = sc.nextInt();
        if(score > 100 || score < 0) {
            System.err.println("分数范围为0~100!");
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
        System.out.println("等级为" + level);
        sc.close();
    }

}
