/* Work2.java -- ���ʼ������������ */
package book.workcometrue.chapter02;
import java.util.Scanner;

public class Work2 {

    public static void main(String[] args) {

        /* ��ʾ��ӭ���漰�˵��� */
        System.out.println("��ӭʹ��ְ�����ʼ���ϵͳ��");
        System.out.println("ѡ����в��������ͣ�");
        System.out.println("1.�û�����ѡ�� 2.����ְ�����ʼ��� 3.���ְ�����ʼ��� 4.�˳�");
        
        /* ��ȡ�˵����� */
        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();
        
        /* �ж��������Ƿ���1~4֮�� */
        boolean opResult = op == 1 || op == 2 || op == 3 || op == 4;
        String result = opResult ? "��ѡ�����1~4" : "����ѡ����1~4֮��";
        System.out.println(result);
        
        /* ����ְ��������Ϣ */
        System.out.println("������ְ��������");
        String empName = sc.next();
        System.out.println("ְ��������" + empName);

        System.out.println("������ְ���ձ��� true Ů false");
        Boolean sex = sc.nextBoolean();
        System.out.println("�Ա�" + (sex ? '��' : 'Ů'));
        
        /* ���빤����Ϣ����Ϊ����������ʡ����������� */
        System.out.println("���㹤��");
        System.out.println("������������ʣ�");
        double basicPay = sc.nextDouble();

        System.out.println("�����������");
        float allowance = sc.nextFloat();

        System.out.println("�����뽱��");
        int bonus = sc.nextInt();
        
        double salary = basicPay + allowance + bonus;
        System.out.println("���ʣ�" + salary);
        
        sc.close();
    }

}
