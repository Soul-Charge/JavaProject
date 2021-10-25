/* Example5_5.java -- 书本第五章案例代码5：测试类变量与实例变量的区别 */
package book.example.chapter05;

class StaticDemo {
    int i;
    static int j;
    void print() {
        System.out.println("i = " + i + "\tj = " + j);
    }
}

public class Example5_5 {

    public static void main(String[] args) {

        StaticDemo sd1 = new StaticDemo();
        StaticDemo sd2 = new StaticDemo();
        
        sd1.i++;
        StaticDemo.j++;
        sd1.print();
        sd2.print();
        
        System.out.println("---------------------------");
        
        sd2.i++;
        sd2.j++;
        sd1.print();
        sd2.print();
    }
}
