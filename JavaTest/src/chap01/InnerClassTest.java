/* InnerClassTest.java -- 测试内部类-成员类 */
package chap01;

class OuterClass {
    String outS = "OuterClass ";
    //String a = inS; // 外部类不能访问内部类的成员变量

     class InnerClass {
        String inS = " InnerClass";
        String mergeS = outS + inS; // 内部类可以访问外部类的成员变量
    }
}

public class InnerClassTest {

    public static void main(String[] args) {
        
        OuterClass oc = new OuterClass();
        OuterClass.InnerClass ic = oc.new InnerClass();
        System.out.println(oc.outS);  //OuterClass 
        System.out.println(ic.inS);   // InnerClass
        System.out.println(ic.mergeS);//OuterClass  InnerClass
    }
}