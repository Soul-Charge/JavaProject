/* Example5_10.java -- 匿名类Demo
 * 2021年11月9日
*/
package book.example.chapter05;

class MyObj {
    void doSomething() {
        System.out.println("Do nothing!");
    }
}

public class Example5_10 {

    void doThings(MyObj obj) {
        obj.doSomething();
    }
    public static void main(String[] args) {
        Example5_10 demo = new Example5_10();
        MyObj obj = new MyObj();

        demo.doThings(obj); // 将MyObj类的实例obj传入方法
        
        demo.doThings(new MyObj()); // 将直接生成没有引用的实例传入方法
        
        demo.doThings(new MyObj() { // 将使用匿名类作为模板生成的实例传入方法
            void doSomething() {
                System.out.println("Hello world");
            }
        });
    }
}