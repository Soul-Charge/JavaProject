/* Exam6_4.java -- 书本第六章练习4：DogStat接口
 * 2021年11月10日
 * 看不懂(3)的意思，只能认为是要使用运行时多态
*/
package book.exam.chapter06;

interface DogStat {
    public abstract void showStat();
}

class DogMeetEnemyStat implements DogStat {
    public void showStat() {
        System.out.println("小狗狂叫");
    }
}
class DogMeetFriendStat implements DogStat {
    public void showStat() {
        System.out.println("小狗晃尾");
    }
}
class DogMeetAnotherDog implements DogStat {
    public void showStat() {
        System.out.println("小狗嘻戏");
    }
}
class DogSoftlyStat implements DogStat {
    public void showStat() {
        System.out.println("小狗听令");
    }
}

class Dog2 { // 防止和第二题的Dog类重复
    void show(DogStat ds) { // 算是回调showStat()？
        ds.showStat();
    }
}


public class Exam6_4 {

    public static void main(String[] args) {

        DogMeetEnemyStat  dmes = new DogMeetEnemyStat();
        DogMeetFriendStat dmfs = new DogMeetFriendStat();
        DogMeetAnotherDog dmad = new DogMeetAnotherDog();
        DogSoftlyStat     dss  = new DogSoftlyStat();

        Dog2 dog = new Dog2();
        dog.show(dmes);
        dog.show(dmfs);
        dog.show(dmad);
        dog.show(dss);
    }
}