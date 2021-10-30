/* OverrideTest.java -- 测试重写 */
package classtest;

class Animal {
    void breathe() {
        System.out.println("动物可以呼吸");
    }
    void move() {
        System.out.println("->动物<-可以移动");
    }
}
class Dog extends Animal {
    @Override
    void move() {
        System.out.println("->狗<-可以移动");
    }
}
public class OverrideTest {

    public static void main(String[] args) {

        Dog d = new Dog();
        d.breathe();
        d.move();
    }
}
