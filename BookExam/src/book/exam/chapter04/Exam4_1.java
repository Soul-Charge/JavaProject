/* Exam4_1.java -- 书本第四章练习1：将30个考试成绩录入数组并求平均成绩和不及格人数 */
package book.exam.chapter04;

import java.util.Scanner;

public class Exam4_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double [] scores = new double [30];
        double total = 0, count = 0; // 总分和不及格人数
        
        /* 获取输入将分数录入数组 */
        System.out.println("用空格分隔输入30个分数:");
        for(int i = 0; i < scores.length; i++)
            scores[i] = sc.nextDouble();
        
        /* 遍历数组计算总分和不及格人数 */
        for(double score: scores) {
            total += score;
            if(score < 60)
                count++;
        }
        System.out.println("平均分为: " + (total / scores.length));
        System.out.println("不及格人数为: " + count);
        sc.close();
    }

}
