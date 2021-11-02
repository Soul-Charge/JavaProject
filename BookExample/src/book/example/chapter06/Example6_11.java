/* Example6_11.java -- 书本第六章案例代码十一：运行时多态
 * 2021年11月2日
*/
package book.example.chapter06;

interface Animal1 {
    public abstract void shout();
}
class Cat implements Animal1 {
    public void shout() {
        System.out.println("喵~");
    }
}
class Bird implements Animal1 {
    public void shout() {
        System.out.println("喳喳");
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