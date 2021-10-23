/* arrayArgsTransferTest.java -- 测试数组传参 */
package chap01;


public class arrayArgsTransferTest {

    public static void main(String[] args) {

        int [] arrayA = {1, 2, 3, 4, 5};
        Test.arrayAddInt(arrayA, 3);

         //数组对象的成员变量length不会动态更新，所以arrayA.length还是5 
        System.out.println(arrayA.length);
    }

}
