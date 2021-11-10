/* Exam6_2.java -- 书本第六章编程练习2：Animal类
 * 2021年11月10日
*/
package book.exam.chapter06;

class Animal {
    private boolean sex;
    private int age;

    Animal() {
        sex = false;
        age = 0;
    }

    boolean getSex() {
        return sex;
    }
    int getAge() {
        return age;
    }
    void setSex(boolean sex) {
        this.sex = sex;
    }
    void setAge(int age) {
        this.age = age;
    }
    
    public String introduce() { // 题目描述为返回字符串，方法名不按照题目描述开头大写
        if(sex)
            return "This is a male Animal!";
        else
            return "This is a female Animal";
    }
}
class Dog extends Animal {
    private boolean sex;

    Dog() {
        super();
        sex = true;
    }

    @Override
    void setSex(boolean sex) {
        this.sex = sex;
    }
    @Override
    boolean getSex() {
        return sex;
    }

    @Override
    public String introduce() {
        if(sex)
            return "This is a male Dog!";
        else
            return "This is a female Dog!";
    }
}

public class Exam6_2 {

    public static void main(String[] args) {
        Animal ani = new Animal();
        System.out.println(ani.introduce());

        Dog dog = new Dog();
        System.out.println(dog.introduce());
    }
}