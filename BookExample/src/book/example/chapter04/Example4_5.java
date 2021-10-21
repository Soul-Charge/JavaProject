/* Example4_5.java -- 书本第四章案例代码5：使用数组实现左下三角形99乘法表 */
/*TODO: 书本61页：*/
/*TODO: QTMD三角数组乘法表，算法先记住算了*/
package book.example.chapter04;

public class Example4_5 {

    public static void main(String[] args) {

        int row, col;
        /* 三角形数组不规则，先创建一维 */
        int [][] sheet = new int [9][];

        /* 遍历数组第一维，并以9到1的长度创建第二维 */
        for(row = 0, col = 9; row < sheet.length; row++, col--)
            sheet[row] = new int [col]; // 注意这里的col是创建维度的长度而不是下标,所以从9开始
        
        /* 左乘数从1到9(数组下标从0到8) */
        for(row = 0; row < sheet.length; row++)
            /* 右乘数从1到9(数组下标从0到8) */
            for(col = 0; col < sheet[row].length; col++)
                /* 左乘数乘右乘数得到当前项 */
                sheet[row][col] = (row+1) * (col+1);
        
        /* 打印顺序为从上至下、从左到右 */
        for(row = 0; row < sheet.length; row++) {
            
            for(col = 0; col < row; col++) {
                
                System.out.print((row+1) + " * " + (col+1) + " = ");
                System.out.print(sheet[row][col] + "\t");
            }
            System.out.println("");
        }
    }

}
