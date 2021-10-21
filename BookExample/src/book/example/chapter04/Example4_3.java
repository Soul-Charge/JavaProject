/* Example4_3.java -- 书本第四章案例代码3：按表格形式输出数据 */
package book.example.chapter04;
import java.util.Scanner;

public class Example4_3 {

    public static void main(String[] args) {
        
        int[][] a = new int[3][4]; // 创建一个按题意的3行4列数组
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入12个整数");
        for(int row = 0; row < a.length; row++) // 遍历行
            for(int col = 0; col < a[row].length; col++)
                a[row][col] = sc.nextInt();

        System.out.println("表格形式输出数组");
        for(int row = 0; row < a.length; row++) { // 遍历行

            for(int col = 0; col < a[row].length; col++) { // 遍历列

                System.out.print(a[row][col] + "\t");
                if((col+1) % 4 == 0) // 四个数换一行
                    System.out.println("");
            }
        }
    }

}
