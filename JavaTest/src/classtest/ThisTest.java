/* ThisTest.java -- ����this�ؼ��� */
package classtest;

class Vehicle {
    private String color = "red";    // �ؾ�Ĭ����ɫred
    private String type  = "ground"; // ��ʻ����

    Vehicle() {
    }
    Vehicle(String color, String type) {
        /* ʹ��this���ó�Ա�����������β� */
        this.color = color;
        this.type = type;
    }
    
    void showType() {
        int type = 1;
        /* ʹ��this�������Ա����type�����Ǿֲ�����type */
        System.out.println("�ؾ���ʻ����Ϊ" + this.type + " ���ִ���Ϊ" + type);
    }
    void showColor() {
        System.out.println("�ؾ���ɫΪ" + color);
    }
    void showAll() {
        /* ʹ��this���õ�ǰ����ĳ�Ա���� */
        this.showType();
        this.showColor();
    }
}

public class ThisTest {

    public static void main(String[] args) {

    }

}
