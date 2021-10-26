/* TestLocalClass.java -- 测试局部类 */
package classtest;

class OutClass {
    String outS = "OUT"; // 外部类成员变量

    void method() {
        String metS = "METHOD"; // 外部类成员方法

        class LocalClass {
            String locS = "LOCAL"; // 局部类成员
            String addS = outS + " " + metS; // 局部类可以访问外部类成员
        }
        //System.out.println(addS); // 外部类不能访问局部类成员
        LocalClass lc = new LocalClass();
        System.out.println(lc.locS); // LOCAL
        System.out.println(lc.addS); // OUT METHOD
    }
}

public class TestLocalClass {

    public static void main(String[] args) {

        OutClass oc = new OutClass();
        oc.method();
    }
}
