/* arrayArgsTransferTest.java -- 测试数组传参 */
package chap01;

class Test {

    public static void arrayAddInt(int[] src, int addLen) {

        int [] tmp = new int [src.length + addLen];
        System.arraycopy(src, 0, tmp, 0, src.length);
        src = tmp;
        src.length = tmp.length;  // 出错，src.length是常量
        System.out.println(tmp.length); // tmp.length为8
    }
}

public class arrayArgsTransferTest {

    public static void main(String[] args) {

        int [] arrayA = {1, 2, 3, 4, 5};
        Test.arrayAddInt(arrayA, 3);

        /* 数组对象的成员变量length不会动态更新，所以arrayA.length还是5 */
        System.out.println(arrayA.length);
    }

}
