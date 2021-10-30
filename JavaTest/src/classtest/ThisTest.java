/* ThisTest.java -- 测试this关键字 */
package classtest;

class Vehicle {
    private String color = "red";    // 载具默认颜色red
    private String type  = "ground"; // 行驶类型

    Vehicle() {
    }
    Vehicle(String color, String type) {
        /* 使用this引用成员变量而不是形参 */
        this.color = color;
        this.type = type;
    }
    
    void showType() {
        int type = 1;
        /* 使用this引用类成员变量type而不是局部变量type */
        System.out.println("载具行驶类型为" + this.type + " 数字代号为" + type);
    }
    void showColor() {
        System.out.println("载具颜色为" + color);
    }
    void showAll() {
        /* 使用this引用当前对象的成员方法 */
        this.showType();
        this.showColor();
    }
}

public class ThisTest {

    public static void main(String[] args) {

    }

}
