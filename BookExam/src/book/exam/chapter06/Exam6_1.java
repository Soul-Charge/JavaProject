/* Exam6_1.java -- �鱾��������ϰ1������Bank�ಢ������������̳���
 * 2021��11��9��
*/
package book.exam.chapter06;

class Bank {
    int year;
    double savedMoney;
    double interest;
    double interestRate = 0.35D;

    Bank(double savedMoney, int year) {
        this.savedMoney = savedMoney;
        this.year = year;
        interest = computerInterest();
    }

    double computerInterest() {
        return year * interestRate * savedMoney;
    }
}

class ConstructionBank extends Bank {
    int day;
    double year;
    double interestRate = 0.0001D;

    ConstructionBank(double savedMoney, double year) {
        super(savedMoney, (int)year);
        this.savedMoney = savedMoney;
        this.year = year;
        this.day = getDays(year);
        /* �̳���Bank��ĳ�Ա�����ø��������Ϣ�������Լ��ļ�����Ϣ���� */
        interest = super.computerInterest() + computerInterest();
    }

    @Override
    double computerInterest() { // �������м�������Ϣ�ķ���
        return day * interestRate * savedMoney;
    }

    static int getDays(double year) {
        double doubleDay = (year*1000 - (int)year*1000)/1000; // ȡ��С������
        String string0DotDay = String.valueOf(doubleDay);
        
        String stringDay;
        /* 0��1��Ӧ����0��. ���Դ�2��ʼ�����·ֱ��ӦС����1~3λ����� */
        if(string0DotDay.length() == 3)
            stringDay = "" + string0DotDay.charAt(2);
        else if(string0DotDay.length() == 4)
            stringDay = "" + string0DotDay.charAt(2) + string0DotDay.charAt(3);
        else if(string0DotDay.length() == 5)
            stringDay = "" + string0DotDay.charAt(2) + string0DotDay.charAt(3) + 
            string0DotDay.charAt(4);
        else
            stringDay = "" + -1;

        int day = Integer.valueOf(stringDay);
        if(day == -1) {
            System.err.println("С�����Ϊ3λ!");
            return -1;
        }
        else if(day > 365) {
            System.err.println("С���������ֻ��Ϊ365!");
            return -2;
        }
        return day;
    }
}

class BankOfDalian extends Bank {
    int day;
    double year;
    double interestRate = 0.00012D;
    
    BankOfDalian(double savedMoney, double year) {
        super(savedMoney, (int)year);
        this.savedMoney = savedMoney;
        this.year = year;
        this.day = ConstructionBank.getDays(year);
        this.interest = super.computerInterest() + computerInterest();
    }
    
    @Override
    double computerInterest() {
        return day * interestRate * savedMoney;
    }
}

public class Exam6_1 {

    public static void main(String[] args) {

        ConstructionBank cb = new ConstructionBank(8000, 5.216);
        System.out.println(cb.interest);
        BankOfDalian bod = new BankOfDalian(8000, 5.216);
        System.out.println(bod.interest);
    }
}