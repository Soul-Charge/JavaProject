/* UnitConversionTest.java -- 书本第五章练习3：编写UnitConversion类封装方法并测试*/
package book.exam.chapter05;
import java.util.Scanner;

final class UnitConversion {
    /* 提供私有构造器以防止类被实例化 */
    private UnitConversion() {
    }
    static double in2cm(double in) {
        return in * 2.54;
    }
    static double cm2in(double cm) {
        return (1 / 2.54) * cm;
    }
    static double cel2fah(double cel) {
        return 32 + cel * 1.8;
    }
    static double fah2cel(double fah) {
        return (fah - 32) / 1.8;
    }
}

public class UnitConversionTest {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double in, cm; // 英寸和厘米
        System.out.print("输入英寸值：");
        in = sc.nextDouble();
        cm = UnitConversion.in2cm(in);
        System.out.println(in + "英寸=" + cm + "厘米");
        
        System.out.print("输入厘米值：");
        cm = sc.nextDouble();
        in = UnitConversion.cm2in(cm);
        System.out.println(cm + "厘米=" + in + "英寸");
        
        System.out.println("------------------------------");
        
        double cel, fah; // 摄氏度和华氏度
        System.out.print("输入摄氏度：");
        cel = sc.nextDouble();
        fah = UnitConversion.cel2fah(cel);
        System.out.println(cel + "摄氏度=" + fah + "华氏度");

        System.out.print("输入华氏度：");
        fah = sc.nextDouble();
        cel = UnitConversion.fah2cel(fah);
        System.out.println(fah + "华氏度=" + cel + "摄氏度");
        sc.close();
    }
}
