/* Exam6_4.java -- �鱾��������ϰ4��DogStat�ӿ�
 * 2021��11��10��
 * ������(3)����˼��ֻ����Ϊ��Ҫʹ������ʱ��̬
*/
package book.exam.chapter06;

interface DogStat {
    public abstract void showStat();
}

class DogMeetEnemyStat implements DogStat {
    public void showStat() {
        System.out.println("С�����");
    }
}
class DogMeetFriendStat implements DogStat {
    public void showStat() {
        System.out.println("С����β");
    }
}
class DogMeetAnotherDog implements DogStat {
    public void showStat() {
        System.out.println("С����Ϸ");
    }
}
class DogSoftlyStat implements DogStat {
    public void showStat() {
        System.out.println("С������");
    }
}

class Dog2 { // ��ֹ�͵ڶ����Dog���ظ�
    void show(DogStat ds) { // ���ǻص�showStat()��
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