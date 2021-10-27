/* UnitConversionTest.java -- �鱾��������ϰ3����дUnitConversion���װ����������*/
package book.exam.chapter05;
import java.util.Scanner;

final class UnitConversion {
    /* �ṩ˽�й������Է�ֹ�౻ʵ���� */
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
        double in, cm; // Ӣ�������
        System.out.print("����Ӣ��ֵ��");
        in = sc.nextDouble();
        cm = UnitConversion.in2cm(in);
        System.out.println(in + "Ӣ��=" + cm + "����");
        
        System.out.print("��������ֵ��");
        cm = sc.nextDouble();
        in = UnitConversion.cm2in(cm);
        System.out.println(cm + "����=" + in + "Ӣ��");
        
        System.out.println("------------------------------");
        
        double cel, fah; // ���϶Ⱥͻ��϶�
        System.out.print("�������϶ȣ�");
        cel = sc.nextDouble();
        fah = UnitConversion.cel2fah(cel);
        System.out.println(cel + "���϶�=" + fah + "���϶�");

        System.out.print("���뻪�϶ȣ�");
        fah = sc.nextDouble();
        cel = UnitConversion.fah2cel(fah);
        System.out.println(fah + "���϶�=" + cel + "���϶�");
        sc.close();
    }
}
