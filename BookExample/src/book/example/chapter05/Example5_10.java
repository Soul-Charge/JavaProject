/* Example5_10.java -- ������Demo
 * 2021��11��9��
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

        demo.doThings(obj); // ��MyObj���ʵ��obj���뷽��
        
        demo.doThings(new MyObj()); // ��ֱ������û�����õ�ʵ�����뷽��
        
        demo.doThings(new MyObj() { // ��ʹ����������Ϊģ�����ɵ�ʵ�����뷽��
            void doSomething() {
                System.out.println("Hello world");
            }
        });
    }
}