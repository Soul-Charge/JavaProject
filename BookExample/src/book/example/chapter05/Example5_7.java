/* Example5_7.java -- 书本第五章案例代码7：测试非静态内部类/成员类 */
/* 个人认为该例不太好理解，可见JavaTest中的InnerClassTest.java */
package book.example.chapter05;

public class Example5_7 {
    String outS = "OuterString";
    
    public static void main(String[] args) {

        Example5_7 oc = new Example5_7();
        //Example5_7.InnerClass ic = oc.new InnerClass();

        /* 内部类在实例化该内部类的外部类之外时，可直接使用内部类名做类型，而不需用如上格式 */
        InnerClass ic = oc.new InnerClass();
        System.out.println(oc.outS);// OuterString
        System.out.println(ic.inS); // InnerString
        ic.showString(); // OuterString InnerString
    }

    class InnerClass {
        String inS = "InnerString";
        void showString() {
            System.out.println(outS + " " + inS);
        }
    }
}
