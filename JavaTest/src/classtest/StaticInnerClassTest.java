/* StaticInnerClassTest.java -- 静态内部类测试 */
package classtest;

class OuterClass{
    String outS = "OuterClass";
    void showAddString() {
        //System.out.println(outS + inS); // 外部类不能访问静态成员类
    }
    static class InnerClass {
        String inS = "InnerClass";
        static String inSS = "StaticInnerClass";

        void showAddString() {
            //System.out.println(outS + inS); // 静态成员类不能访问外部非静态成员
        }
    }
}
public class StaticInnerClassTest {

    public static void main(String[] args) {

        /* 静态成员类可以直接调用进行实例化，不需要实例化外部类对象，但需要按照嵌套格式调用 */
        OuterClass.InnerClass ic = new OuterClass.InnerClass();
        System.out.println(ic.inS); // InnerClass

        //System.out.println(OuterClass.InnerClass.inS); // 静态成员类的实例变量不能直接访问
        System.out.println(OuterClass.InnerClass.inSS);//   静态成员类的静态变量可以直接访问

    }
}
