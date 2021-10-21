/* Example4_2.java -- 书本第四章案例代码2：数组反序 */
package book.example.chapter04;
import java.util.Scanner;

public class Example4_2 {

    public static void main(String[] args) {

        /* 创建并初始化数组 */
        int[] array = new int[7];
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入七个整数: ");
        for(int i = 0; i < array.length; i++)
            array[i] = sc.nextInt();
        
        /* 反序数组 */
        int temp; // 临时存储的变量
        for(int i = 0; i < array.length / 2; i++) {
            temp = array[i]; // 首值临时存储
            array[i] = array[array.length-1-i]; // 尾值覆盖首值(用-i实现尾值向前移动)
            array[array.length-1-i] = temp; // 取回首值覆盖尾值
        }
        
        for(int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        sc.close();
    }

}
