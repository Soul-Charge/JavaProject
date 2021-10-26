/* Example5_8.java -- 书本第五章案例代码8：测试实例化代码在外部类的静态成员类 */
package book.example.chapter05;

public class Example5_8 {
    String outS = "OUT";

    public static void main(String[] args) {
        
        InnerClass ic = new InnerClass();
        System.out.println(ic.inS); // IN
    }
    static class InnerClass {
        String inS = "IN";
        void showOut() {
            //System.out.println(outS); // 静态成员类不能访问外部非静态成员
        }
    }
}
