/* Example6_5.java -- 书本第六章案例代码5：抽象类 */
package book.example.chapter06;

abstract class Animal {
    String str;
    Animal (String str) {
        this.str = str;
    }
    abstract void eat();
}
class Horse extends Animal {
    Horse(String str) {
        super(str);
    }
    void eat() {
        System.out.println("马吃草料");
    }
}
class Dog extends Animal {
    Dog(String str) {
        super(str);
    }
    void eat() {
        System.out.println("狗吃骨头");
    }
}

public class Example6_5 {

    public static void main(String[] args) {

        Horse h = new Horse("马");
        Dog d = new Dog("狗");
        h.eat();
        d.eat();
        // 所以类里面的str有什么用？
    }
}