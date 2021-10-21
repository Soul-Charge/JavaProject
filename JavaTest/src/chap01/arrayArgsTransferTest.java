/* arrayArgsTransferTest.java -- �������鴫�� */
package chap01;

class Test {

    public static void arrayAddInt(int[] src, int addLen) {

        int [] tmp = new int [src.length + addLen];
        System.arraycopy(src, 0, tmp, 0, src.length);
        src = tmp;
        src.length = tmp.length;  // ����src.length�ǳ���
        System.out.println(tmp.length); // tmp.lengthΪ8
    }
}

public class arrayArgsTransferTest {

    public static void main(String[] args) {

        int [] arrayA = {1, 2, 3, 4, 5};
        Test.arrayAddInt(arrayA, 3);

        /* �������ĳ�Ա����length���ᶯ̬���£�����arrayA.length����5 */
        System.out.println(arrayA.length);
    }

}
