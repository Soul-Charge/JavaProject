/* Example5_3.java -- �鱾�����°�������3�����������Rectangle������ */
package book.example.chapter05;

class Rectangle {
    private double width, height;
    
    /* ������ */
    Rectangle() {
        width = 0;
        height = 0;
    }
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    /* getters & setters */
    double getWidth() {
        return width;
    }
    double getHeight() {
        return height;
    }
    void setWidth(double width) {
        this.width = width;
    }
    void setHeight(double height) {
        this.height = height;
    }
    /* ������Ա���� */
    double getPerimeter() {
        return (width + height) * 2;
    }
    double getArea() {
        return width * height;
    }
    void disp() {
        System.out.println("���ε��ܳ�Ϊ��" + getPerimeter());
        System.out.println("���ε����Ϊ��" + getArea());
    }
}

public class Example5_3 {

    public static void main(String[] args) {

        Rectangle r = new Rectangle(10, 5);
        r.disp();
    }
}
