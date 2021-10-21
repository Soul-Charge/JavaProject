/* ArrayTest.java -- 创建、初始化和使用数组 */
package chap01;

public class ArrayTest {

    public static void main(String[] args) {
        
        /* 不使用new创建数组 */
        double[] dArrayNotNew = {1.1, 2.2, 3.3, 4.4, 5.5};
        /* 使用new创建数组 */
        double[] dArrayUseNew = new double[5];
        
        /* 列出数组dArrayNotNew的所有元素 */
        System.out.print("Elements in dArrayNotNew: ");
        for(int i = 0; i < dArrayNotNew.length; i++)
            System.out.print(dArrayNotNew[i] + " ");
        
        /* 计算数数组dArrayNotNew的和 */
        double sum = 0;
        for(int i = 0; i < dArrayNotNew.length; i++)
            sum += dArrayNotNew[i];
        System.out.print("\nSum of elements in dArrayNotNew: " + sum);
        
        /* 找出数组dArrayNotNew的最大值 */
        double max = dArrayNotNew[0];
        for(int i = 1; i < dArrayNotNew.length; i++)
            if(dArrayNotNew[i] > max)
                max = dArrayNotNew[i];
        System.out.println("\nThe max num in dArrayNotNew is " + max);
        
        System.out.println("\n---------------------------------\n");
        
        /* 列出数组dArrayUseNew的所有元素 */
        System.out.print("Elements in dArrayUseNew: ");
        for(int i = 0; i < dArrayUseNew.length; i++)
            System.out.print(dArrayUseNew[i] + " ");
        
        /* 计算数数组dArrayUseNew的和 */
        sum = 0;
        for(int i = 0; i < dArrayUseNew.length; i++)
            sum += dArrayUseNew[i];
        System.out.print("\nSum of elements in dArrayUseNew: " + sum);
        
        /* 找出数组dArrayUseNew的最大值 */
        max = dArrayUseNew[0];
        for(int i = 1; i < dArrayUseNew.length; i++)
            if(dArrayUseNew[i] > max)
                max = dArrayUseNew[i];
        System.out.println("\nThe max num in dArrayUseNew is " + max);
    }

}
