/* Exam4_5.java -- 书本第四章练习5：输入一个5行5列数组并且实现： */
/* 1. 求出最大值和最小值以及它们的行列位置 */
/* 2. 求出主副对角线上个元素之和 */
package book.exam.chapter04;
import java.util.Scanner;

/* 这一题用到的数组方法 */
class ArrayTools4_5 {

    /* 尝试在给定int数组中查找给定int值，成功返回索引，失败返回-1 */
    public static int searchInt(int[] a, int key) {
        for(int i = 0; i < a.length; i++)
            if(key == a[i])
                return i;
        return -1;
    }
}

public class Exam4_5 {

    public static void main(String[] args) {
        
        final int ROW = 5;
        final int COL = 5;
        int [][] a = new int [ROW][COL];
        Scanner sc = new Scanner(System.in);
        
/* 测试用数据
1 2 3 4 5
6 7 8 9 0
2 3 4 5 6
5 1 4 9 3
1 2 3 4 0
*/ 
        
        /* 录入数据 */
        System.out.println("输入五行五列数字，用空格分开:");
        for(int row = 0; row < ROW; row++)
            for(int col = 0; col < COL; col++)
                a[row][col] = sc.nextInt();
        
        /* 输出数组 
        for(int row = 0; row < ROW; row++) {
            for(int col = 0; col < COL; col++) {
                System.out.print(a[row][col] + " ");
            }
                System.out.println();
        }
        */
        
        /* 找出最大最小值 */
        int max = a[0][0], min = a[0][0];
        for(int row = 0; row < ROW; row++)
            for(int col = 0; col < COL; col++) {
                if(max < a[row][col])
                    max = a[row][col];
                if(min > a[row][col])
                    min = a[row][col];
            }
        
        /* 寻找并输出最值的行列信息 */
        for(int row = 0; row < ROW; row++) {

            int maxCol = ArrayTools4_5.searchInt(a[row], max);
            int minCol = ArrayTools4_5.searchInt(a[row], min);
            /* 判断并输出 */
            if(maxCol != -1)
                System.out.println("最大值 "+max+" 位于第 "+(row+1) + " 行第 "+(maxCol+1)+"列");
            if(minCol != -1)
                System.out.println("最小值 "+min+" 位于第 "+(row+1) + " 行第 "+(minCol+1)+"列");
        }

        /* 计算主副对角线元素和 */
        int mainSum = 0, viceSum = 0;
        /* 循环用变量 */
        int row = 0;      // 控制行
        int mainCol = 0;  // 控制主对角线列
        int viceCol = COL-1;// 控制副对角线列
        while (row < ROW) {
            mainSum += a[row][mainCol];
            viceSum += a[row][viceCol];
            
            row++; mainCol++; viceCol--;
        }
        System.out.println("主对角线元素和为：" + mainSum);
        System.out.println("副对角线元素和为：" + viceSum);
        sc.close();
    }

}
