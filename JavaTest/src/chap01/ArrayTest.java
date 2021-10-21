/* ArrayTest.java -- ��������ʼ����ʹ������ */
package chap01;

public class ArrayTest {

    public static void main(String[] args) {
        
        /* ��ʹ��new�������� */
        double[] dArrayNotNew = {1.1, 2.2, 3.3, 4.4, 5.5};
        /* ʹ��new�������� */
        double[] dArrayUseNew = new double[5];
        
        /* �г�����dArrayNotNew������Ԫ�� */
        System.out.print("Elements in dArrayNotNew: ");
        for(int i = 0; i < dArrayNotNew.length; i++)
            System.out.print(dArrayNotNew[i] + " ");
        
        /* ����������dArrayNotNew�ĺ� */
        double sum = 0;
        for(int i = 0; i < dArrayNotNew.length; i++)
            sum += dArrayNotNew[i];
        System.out.print("\nSum of elements in dArrayNotNew: " + sum);
        
        /* �ҳ�����dArrayNotNew�����ֵ */
        double max = dArrayNotNew[0];
        for(int i = 1; i < dArrayNotNew.length; i++)
            if(dArrayNotNew[i] > max)
                max = dArrayNotNew[i];
        System.out.println("\nThe max num in dArrayNotNew is " + max);
        
        System.out.println("\n---------------------------------\n");
        
        /* �г�����dArrayUseNew������Ԫ�� */
        System.out.print("Elements in dArrayUseNew: ");
        for(int i = 0; i < dArrayUseNew.length; i++)
            System.out.print(dArrayUseNew[i] + " ");
        
        /* ����������dArrayUseNew�ĺ� */
        sum = 0;
        for(int i = 0; i < dArrayUseNew.length; i++)
            sum += dArrayUseNew[i];
        System.out.print("\nSum of elements in dArrayUseNew: " + sum);
        
        /* �ҳ�����dArrayUseNew�����ֵ */
        max = dArrayUseNew[0];
        for(int i = 1; i < dArrayUseNew.length; i++)
            if(dArrayUseNew[i] > max)
                max = dArrayUseNew[i];
        System.out.println("\nThe max num in dArrayUseNew is " + max);
    }

}
