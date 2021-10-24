/* Example5_4Beta.java -- 书本第五章案例代码4Beta版：测试成员变量访问控制修饰符（不同包） */
package book.example.chapter05;
import book.example.chapter05Beta.A;

public class Example5_4Beta {

    public static void main(String[] args) {
        
        A test = new A();

        /* public修饰符：在所有类中可见 */
        System.out.println(test.b);

        /* default修饰符：在同一包中可见 */
        //System.out.println(test.a); // 不可见

        /* protected修饰符：在不同包的子类可见 */
        //System.out.println(test.d); // 不可见

        /* private修饰符：在同一类中可见 */
        //System.out.println(test.c); // 不可见
    }

}
