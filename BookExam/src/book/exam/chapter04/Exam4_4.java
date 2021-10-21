package book.exam.chapter04;
import java.util.Scanner;

class Tool {
        
    /* 创建并返回给定Int数组的加长版本： src:原数组名 addLen:要加长的元素数*/
    public static int[] arrayLenAddInt(int[] src, int addLen) {
        
        /* 创建一个加长的数组并把值复制过去 */
        int [] dest = new int [src.length + addLen];
        System.arraycopy(src, 0, dest, 0, src.length);
        return dest;
    }
}

public class Exam4_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /* 先只创建用于存放学号和成绩的二维数组 */
        int [][] sheet = new int [5][4];
        
/*  测试用数据
1001 90 80 85
1002 70 75 80
1003 65 70 75
1004 85 60 70
1005 80 90 70
*/
        
        /* 录入成绩 */
        System.out.println("请按 学号 数学成绩 语文成绩 英语成绩 的顺序输入数据：");
        for(int row = 0; row < sheet.length; row++)
            for(int col = 0; col < sheet[row].length; col++)
                sheet[row][col] = sc.nextInt();

        /* 数组增扩一列，并计算填充总成绩 */
        for(int row = 0; row < sheet.length; row++) {
            int total = 0;

            for(int col = 0; col <= sheet[row].length; col++) { // 使用<=使遍历数+1，在最后一次遍历扩增

                if(col > 0 && col < sheet[row].length) // 计算总分
                    total += sheet[row][col];
                else if(col == sheet[row].length) { // 当col到达最大值即最后一次遍历，扩增
                    sheet[row] = Tool.arrayLenAddInt(sheet[row], 1); // 扩增1元素
                    sheet[row][col] = total; // 填充总成绩
                    break; // 在最后一次遍历手动跳出，不然会因为数组增长而形成死循环
                }
            }
        }
        
        /* 数组扩增一行，并求最高分 */
    }
}