/* AbstractClassTest2.java -- 测试抽象类的构造器
 * 2021年11月2日
*/
package classtest2;

abstract class AbstractClass {
    AbstractClass(String spaceHolder) {
        System.out.println("这条语句在抽象类的构造器内");
    }
    abstract void method();
}
class SubClass extends AbstractClass {
    SubClass(String spaceHolder) {
        super(spaceHolder);
    }
    void method() {
        System.out.println("这条语句是抽象方法的实现");
    }
}

public class AbstractClassTest2 {

    public static void main(String[] args) {

    }
}
