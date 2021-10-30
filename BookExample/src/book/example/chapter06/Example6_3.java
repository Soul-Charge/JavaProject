/* Example6_3.java -- 书本第六章案例代码3：成员方法重写*/
package book.example.chapter06;

class Add {
    void compute(float x, float y) {
        System.out.println("父类：" + x + "+" + y + "=" + (x+y));
    }
    void g(int x, int y) {
        System.out.println("父类：" + x + "+" + y + "=" + (x+y));
    }
}
class Multiply extends Add {
    void compute(float x, float y) {
        super.compute(x, y);
        System.out.println("子类：" + x + "*" + y + "=" + (x*y));
    }
}

public class Example6_3 {

    public static void main(String[] args) {

        Multiply m = new Multiply();
        m.compute(8, 9);
        m.g(12, 8);
    }
}
