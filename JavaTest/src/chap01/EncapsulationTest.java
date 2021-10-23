/* EncapsulationTest.java -- ²âÊÔ·â×° */
package chap01;

class EncapsulationTestClass {
    private int age;
    private String name;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}

public class EncapsulationTest {

    public static void main(String[] args) {
        
        EncapsulationTestClass test = new EncapsulationTestClass();
        test.setAge(10);
        test.setName("happy");
        System.out.println(test.getAge()); // 10
        System.out.println(test.getName());// happy
    }
}
