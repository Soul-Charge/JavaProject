/* Example4_4.java -- 书本第四章案例代码4：输出成绩表 */
/* TODO: 更新Beta版：使用一个单独的循环添加平均分 */
package book.example.chapter04;
import java.util.Scanner;

public class Example4_4 {

    public static void main(String[] args) {

        int total = 0; // 临时累计三科成绩的和
        int [][] scoreSheet = new int[5][5];
        Scanner sc = new Scanner(System.in);

        System.out.println("请依次输入学号、数学、语文、英语成绩:");
        for(int row = 0; row < scoreSheet.length; row++) {

            for(int col = 0; col < scoreSheet[row].length; col++) {

                int inputNum = -1;
                if(col < 4) // 最后一次(col == 4)遍历不需要获取值
                    inputNum = sc.nextInt();

                if(col > 0 && col < scoreSheet[row].length-1) // 累加成绩，避开首位学号和末尾平均分空位
                    total += inputNum;

                if(col == scoreSheet[row].length - 1) // 在最后一列计算赋予平均分
                    scoreSheet[row][col] = total / 3;
                else
                    scoreSheet[row][col] = inputNum; // 普通的获取学号和成绩到对应位置

            }
                total = 0; // 算完每列后归零
        }

        System.out.println("学号\t数学\t语文\t英语\t平均分");
        for(int row = 0; row < scoreSheet.length; row++) {
            for(int col = 0; col < scoreSheet[row].length; col++) {
                
                System.out.print(scoreSheet[row][col] + "\t");
                if((col+1) % 5 == 0)
                    System.out.println("");
            }
        }
        sc.close();
    }

}
