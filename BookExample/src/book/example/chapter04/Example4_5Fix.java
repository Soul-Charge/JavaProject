package book.example.chapter04;

public class Example4_5Fix {

    public static void main(String[] args) {

        /* 声明并初始化数组 */
        String [][] sheet = new String [9][];
        for(int row = 0; row < sheet.length; row++)
            sheet[row] = new String [row + 1];

        for(int row = 0; row < sheet.length; row++)
            for(int col = 0; col < sheet[row].length; col++)
                sheet[row][col] = (row+1) + " * " + (col+1) + " = " + (row+1)*(col+1);
        
        for(int row = 0; row < sheet.length; row++) {
            
            for(int col = 0; col < sheet[row].length; col++) {
                System.out.print(sheet[row][col] + "\t");
            }
            System.out.println();
        }
    }

}
