/* StaticTest.java -- 测试static修饰符 */
package chap01;

class test {
    int testVar; // 变量testVar
    static int testVarS; // 静态变量testVarS
    static void testMethod() {
        System.out.println("test");
    }
}
public class StaticTest {

    public static void main(String[] args) {

        test t = new test(); // 实例化test类型对象t
        t.testMethod();      // 使用test类型对象t的testMethod()方法
        test.testMethod();   // 直接使用test类的testMethod()方法
        
        System.out.println("t.testVar="+t.testVar);   // 访问实例对象t的testVar变量, 输出0
      //System.out.println(test.testVar);             // 错误，非静态变量不能通过类直接访问

        /* 调用test类型对象t的testVar变量 */
        System.out.println("t.testVarS="+t.testVarS++);   // 输出0，因为testVarS没有赋值，被初始化为0，且使用++
        /* 直接调用test类的静态变量testVar */
        System.out.println("test.testVarS="+test.testVarS);// 输出1，因为上一句的++使得使用完testVarS后增量

        test t2 = new test();// 实例化test类型对象t2
        t2.testVar = 2;
        t2.testVarS = 2;
        System.out.println("t.testVar="+ t.testVar);  // 输出0，因为上面没有修改t.testVar的值
        System.out.println("t.testVarS="+ t.testVarS);// 输出2，因为上面通过t2访问修改了静态变量的值
    }
}