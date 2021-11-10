/* Exam6_3.java -- �鱾�����±����ϰ3��Employee������
 * 2021��11��10��
*/
package book.exam.chapter06;

abstract class Employee {
    abstract double earning();
}
class YearWorker extends Employee {
    private int year;

    YearWorker(int year) {
        super();
        this.year = year;
    }

    double earning() {
        return year * 60000D; // ��н����
    }
}
class MonthWorker extends Employee {
    private int month;
    
    MonthWorker(int month) {
        super();
        this.month = month;
    }
    
    double earning() {
        return month * 3000D; // ��н��ǧ
    }
}
class WeekWorker extends Employee {
    private int week;
    
    WeekWorker(int week) {
        super();
        this.week = week;
    }
    
    double earning() {
        return week * 500D; // ��н���
    }
}
class Company {
    private double salaries = 0; // ÿ��֧����нˮ
    Employee [] workers = new Employee[29];
    
    Company() {
        paySalaries();
    }
    
    double getSalaries() {
        return salaries;
    }
    
    /* �˴���������Ա������һ�� */
    double paySalaries() {
        /* �ò�ͬ���͵�Ա�������Ա�����鸳ֵ */
        for(int i = 0; i < workers.length; i++) {
            if(i % 3 == 0)
                workers[i] = new WeekWorker(365/7);
            else if(i % 3 == 1)
                workers[i] = new MonthWorker(12);
            else if(i % 3 == 2)
                workers[i] = new YearWorker(1);
        }
        for (Employee work : workers)
            salaries += work.earning();
        return salaries;
    }
}

public class Exam6_3 {

    public static void main(String[] args) {

        Company c = new Company();
        System.out.println(c.getSalaries());
    }
}