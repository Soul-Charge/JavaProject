/* Example6_5.java -- �鱾�����°�������5�������� */
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
        System.out.println("��Բ���");
    }
}
class Dog extends Animal {
    Dog(String str) {
        super(str);
    }
    void eat() {
        System.out.println("���Թ�ͷ");
    }
}

public class Example6_5 {

    public static void main(String[] args) {

        Horse h = new Horse("��");
        Dog d = new Dog("��");
        h.eat();
        d.eat();
        // �����������str��ʲô�ã�
    }
}