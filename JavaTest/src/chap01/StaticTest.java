/* StaticTest.java -- ����static���η� */
package chap01;

class test {
    int testVar; // ����testVar
    static int testVarS; // ��̬����testVarS
    static void testMethod() {
        System.out.println("test");
    }
}
public class StaticTest {

    public static void main(String[] args) {

        test t = new test(); // ʵ����test���Ͷ���t
        t.testMethod();      // ʹ��test���Ͷ���t��testMethod()����
        test.testMethod();   // ֱ��ʹ��test���testMethod()����
        
        System.out.println("t.testVar="+t.testVar);   // ����ʵ������t��testVar����, ���0
      //System.out.println(test.testVar);             // ���󣬷Ǿ�̬��������ͨ����ֱ�ӷ���

        /* ����test���Ͷ���t��testVar���� */
        System.out.println("t.testVarS="+t.testVarS++);   // ���0����ΪtestVarSû�и�ֵ������ʼ��Ϊ0����ʹ��++
        /* ֱ�ӵ���test��ľ�̬����testVar */
        System.out.println("test.testVarS="+test.testVarS);// ���1����Ϊ��һ���++ʹ��ʹ����testVarS������

        test t2 = new test();// ʵ����test���Ͷ���t2
        t2.testVar = 2;
        t2.testVarS = 2;
        System.out.println("t.testVar="+ t.testVar);  // ���0����Ϊ����û���޸�t.testVar��ֵ
        System.out.println("t.testVarS="+ t.testVarS);// ���2����Ϊ����ͨ��t2�����޸��˾�̬������ֵ
    }
}