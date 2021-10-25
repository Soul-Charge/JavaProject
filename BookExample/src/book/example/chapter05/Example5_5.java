/* Example5_5.java -- �鱾�����°�������5�������������ʵ������������ */
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
