/* arrayArgsTransferTest.java -- �������鴫�� */
package chap01;


public class arrayArgsTransferTest {

    public static void main(String[] args) {

        int [] arrayA = {1, 2, 3, 4, 5};
        Test.arrayAddInt(arrayA, 3);

         //�������ĳ�Ա����length���ᶯ̬���£�����arrayA.length����5 
        System.out.println(arrayA.length);
    }

}
