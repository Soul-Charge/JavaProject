/* InheritanceTest2.java -- 测试子类使用父类的getters和setters方法 */
package classtest;

class SuperClass {
    private String superS = "SuperClass";

    String getSuperS() {
        return superS;
    }
    void setSuperS(String superS) {
        this.superS = superS;
    }
    void show() {
        System.out.println(superS);
    }
}
class SubClass extends SuperClass{
        private String subS = "SubClass";

    void show() {
        System.out.println("子类中访问父类私有变量superS: " + getSuperS());
        System.out.println("子类中设置父类私有变量superS为: " + subS);
        setSuperS(subS);
        System.out.println("子类中访问父类私有变量superS: " + getSuperS());
    }
}
public class InheritanceTest2 {

    public static void main(String[] args) {

        SubClass sc = new SubClass();
        sc.show();
        SuperClass superC = new SuperClass();
        superC.show();
    }
}
