/* OverrideTest.java -- ������д */
package classtest;

class Animal {
    void breathe() {
        System.out.println("������Ժ���");
    }
    void move() {
        System.out.println("->����<-�����ƶ�");
    }
}
class Dog extends Animal {
    @Override
    void move() {
        System.out.println("->��<-�����ƶ�");
    }
}
public class OverrideTest {

    public static void main(String[] args) {

        Dog d = new Dog();
        d.breathe();
        d.move();
    }
}
