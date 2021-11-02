/* Example6_11.java -- �鱾�����°�������ʮһ������ʱ��̬
 * 2021��11��2��
*/
package book.example.chapter06;

interface Animal1 {
    public abstract void shout();
}
class Cat implements Animal1 {
    public void shout() {
        System.out.println("��~");
    }
}
class Bird implements Animal1 {
    public void shout() {
        System.out.println("����");
    }
}
public class Example6_11 {

    public static void main(String[] args) {
        Animal1 cat  = new Cat();
        Animal1 bird = new Bird();
        animalShout(cat);
        animalShout(bird);
    }
    static void animalShout(Animal1 an) {
        an.shout();
    }
}