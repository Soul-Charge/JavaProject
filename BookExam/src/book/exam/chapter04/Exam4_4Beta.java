/* Exam4_4Beta.java -- 书本第四章练习4：计算总成绩和最高分并输出 */
package book.exam.chapter04;
import java.util.Scanner;

/* 用来测试的数组工具类 */
class ArrayTools {

    /* 打印数组内容 */
    public static void showSheet(int[][] a) {
        
        System.out.println("学号\t数学\t语文\t英语\t总成绩");
        for(int row = 0; row < a.length; row++) {
            
            if(row == a.length-1) {
                System.out.print("最高分\t");
                for(int col = 1; col < a[row].length-1; col++)
                    System.out.print(a[row][col] + "\t");
            }
            else {
                for(int col = 0; col < a[row].length; col++) {
                    System.out.print(a[row][col] + "\t");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}

/*  测试用数据
1001 90 80 85
1002 70 75 80
1003 65 70 75
1004 85 60 70
1005 80 90 70
*/

public class Exam4_4Beta {
    
    public static void main(String[] args) {

        final int ROW = 6;
        final int COL = 5;
        int [][] sheet = new int [ROW][COL]; // 直接创建6行5列的数组，虽然会浪费两个元素的空间
        Scanner sc = new Scanner(System.in);
        
        /* 录入数据 */
        System.out.println("请按 学号 数学成绩 语文成绩 英语成绩 的顺序输入数据：");
        for(int row = 0; row < ROW-1; row++) // 遍历1~5行
            for(int col = 0; col < COL-1; col++) // 遍历1~4列
                sheet[row][col] = sc.nextInt();

        //ArrayTools.show2ArrayInt(sheet);
        
        /* 计算并录入总成绩 */
        for(int row = 0; row < ROW-1; row++) { // 遍历1~5行

            int total = 0;
            for(int col = 1; col < COL; col++) { // 遍历2~5列
                
                if(col == COL-1) // 处于第5列，赋值
                    sheet[row][col] = total;
                else                         // 2~4列，累加总和
                    total += sheet[row][col];
            }
        }
        //ArrayTools.show2ArrayInt(sheet);
        
        /* 寻找最高分并录入 */
        for(int col = 1; col <= COL-2; col++) { // 2~4列
            
            int max = 0;
            for(int row = 0; row < ROW; row++) { // 1~6行
                
                if(row == ROW-1) // 第6行，赋值
                    sheet[row][col] = max;
                else if(max < sheet[row][col]) // 没到第6行进行比较
                    max = sheet[row][col];
            }
        }

        ArrayTools.showSheet(sheet);
        sc.close();
    }

}
