/* AnonymousClassTest.java -- 测试匿名类实现接口
 * 2021年11月9日
*/
package classtest;

interface GeometryShape { // 几何形状接口
    public abstract void showShape();
}

public class AnonymousClassTest {

    static void showGeometryShape(GeometryShape gShape) {
        gShape.showShape();
    }
    void showGeometryShape2(GeometryShape gShape) {
        gShape.showShape();
    }

    public static void main(String[] args) {
        /* 使用接口实现几何形状接口，调用方式一，静态方法 */
        showGeometryShape(new GeometryShape() {
            public void showShape() {
                System.out.println("在静态方法调用中用匿名类实现几何接口");
            }
        });

        /* 使用接口实现几何形状接口，调用方式二，静态方法 */
        AnonymousClassTest anonTest = new AnonymousClassTest();
        anonTest.showGeometryShape2(new GeometryShape() {
            public void showShape() {
                System.out.println("在实例方法调用中实现几何接口");
            }
        });
    }
}