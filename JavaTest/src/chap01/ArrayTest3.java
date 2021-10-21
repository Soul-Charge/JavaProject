/* ArrayTest3.java -- ²âÊÔ¶şÎ¬Êı×é */
package chap01;

public class ArrayTest3 {

    public static void main(String[] args) {
        int [][] a = new int[3][];
        a[0] = new int[1];
        a[1] = new int[2];
        a[2] = new int[3];
        for(int row = 0; row < a.length; row++)
            for(int col = 0; col < a[row].length; col++)
                System.out.print(a[row][col] + " ");
    }

}
