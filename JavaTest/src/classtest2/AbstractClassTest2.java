/* AbstractClassTest2.java -- ���Գ�����Ĺ�����
 * 2021��11��2��
*/
package classtest2;

abstract class AbstractClass {
    AbstractClass(String spaceHolder) {
        System.out.println("��������ڳ�����Ĺ�������");
    }
    abstract void method();
}
class SubClass extends AbstractClass {
    SubClass(String spaceHolder) {
        super(spaceHolder);
    }
    void method() {
        System.out.println("��������ǳ��󷽷���ʵ��");
    }
}

public class AbstractClassTest2 {

    public static void main(String[] args) {

    }
}
