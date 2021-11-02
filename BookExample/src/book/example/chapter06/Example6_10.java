/* Example6_10.java -- 书本第六章案例代码10：编译时多态：重载求和例
 * 2021年11月2日
*/
package book.example.chapter06;

class OverloadingDemo {
    int add(int x, int y) {
        return x + y;
    }
    float add(float x, float y) {
        return x + y;
    }
    double add(double x, double y) {
        return x + y;
    }
}

public class Example6_10 {

    public static void main(String[] args) {

        OverloadingDemo ol = new OverloadingDemo();
        System.out.println("add(5, 5)=" + ol.add(5, 5));
        System.out.println("add(7.5F, 8.6F)=" + ol.add(7.5F, 8.6F));
        System.out.println("add(3.5D, 9.3D)=" + ol.add(3.5D, 9.3D));
    }
}