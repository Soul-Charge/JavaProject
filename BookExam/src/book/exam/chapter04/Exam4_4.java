/* Exam4_4.java -- 书本第四章练习4：计算输入的总成绩和最高分并输出 */
/* TODO: 暂时放弃这个方法，先改路了 */
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