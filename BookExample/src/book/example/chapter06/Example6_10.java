/* Example6_10.java -- �鱾�����°�������10������ʱ��̬�����������
 * 2021��11��2��
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