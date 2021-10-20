/* Example4_1.java -- 书本第四章案例代码1(个人修改版)：计算平均分、最高分、最低分的程序 */
package chapter4;
import java.util.Scanner;

public class Example4_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double total = 0;
        double max, min;
        int scores; // 分数的数量
        
        System.out.println("请输入分数的数量：");
        scores = sc.nextInt();
        double[] scoreList = new double[scores]; // 分数数组
        
        /* 获取输入初始化数组并计算出总分 */
        System.out.println("请以空格为间隔依次输入" + scores + "个分数");
        for(int i = 0; i < scoreList.length; i++) {
            scoreList[i] = sc.nextDouble();
            total += scoreList[i];
        }
        
        /* 先将max和min初始化为首元素 */
        /* 遍历数组找出最大和最小值，因为首元素已赋值所以从第二个元素到尾元素相等比较 */
        max = scoreList[0];
        min = scoreList[0];
        for(int i = 1; i < scoreList.length; i++) {
            if(scoreList[i] > max)
                max = scoreList[i];
            if(scoreList[i] < min)
                min = scoreList[i];
        }
        System.out.println("平均分为：" + total / scores);
        System.out.println("最高分为：" + max);
        System.out.println("最低分为：" + min);
        sc.close();
    }

}
