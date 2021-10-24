/* Example5_3.java -- 书本第五章案例代码3：定义矩形类Rectangle并测试 */
package book.example.chapter05;

class Rectangle {
    private double width, height;
    
    /* 构造器 */
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
    /* 其他成员方法 */
    double getPerimeter() {
        return (width + height) * 2;
    }
    double getArea() {
        return width * height;
    }
    void disp() {
        System.out.println("矩形的周长为：" + getPerimeter());
        System.out.println("矩形的面积为：" + getArea());
    }
}

public class Example5_3 {

    public static void main(String[] args) {

        Rectangle r = new Rectangle(10, 5);
        r.disp();
    }
}
