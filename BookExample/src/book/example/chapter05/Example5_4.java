/* Example5_4.java -- 书本第五章案例代码4：测试成员变量访问控制修饰符（同一包） */
package book.example.chapter05;

class A {
    char a = 'a';
    public char b = 'b';
    private char c = 'c';
    protected char d = 'd';
}

public class Example5_4 {

    public static void main(String[] args) {

        A test = new A();

        /* public修饰符：在所有类中可见 */
        System.out.println(test.b);

        /* default修饰符：在同一包中可见 */
        System.out.println(test.a);

        /* protected修饰符：在不同包的子类可见 */
        System.out.println(test.d);

        /* private修饰符：在同一类中可见 */
        // System.out.println(test.c); // 错误，test.c不可见
    }

}
