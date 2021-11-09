/* Exam6_1.java -- 书本第六章练习1：声明Bank类并声明两个子类继承其
 * 2021年11月9日
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
        /* 继承自Bank类的成员，调用父类计算利息方法和自己的计算利息方法 */
        interest = super.computerInterest() + computerInterest();
    }

    @Override
    double computerInterest() { // 建设银行计算日利息的方法
        return day * interestRate * savedMoney;
    }

    static int getDays(double year) {
        double doubleDay = (year*1000 - (int)year*1000)/1000; // 取得小数部分
        String string0DotDay = String.valueOf(doubleDay);
        
        String stringDay;
        /* 0和1对应的是0和. 所以从2开始，以下分别对应小数后1~3位的情况 */
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
            System.err.println("小数最多为3位!");
            return -1;
        }
        else if(day > 365) {
            System.err.println("小数部分最大只能为365!");
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