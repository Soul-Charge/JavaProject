/* Exam6_3.java -- 书本第六章编程练习3：Employee抽象类
 * 2021年11月10日
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
        return year * 60000D; // 年薪六万
    }
}
class MonthWorker extends Employee {
    private int month;
    
    MonthWorker(int month) {
        super();
        this.month = month;
    }
    
    double earning() {
        return month * 3000D; // 月薪三千
    }
}
class WeekWorker extends Employee {
    private int week;
    
    WeekWorker(int week) {
        super();
        this.week = week;
    }
    
    double earning() {
        return week * 500D; // 周薪五百
    }
}
class Company {
    private double salaries = 0; // 每年支付总薪水
    Employee [] workers = new Employee[29];
    
    Company() {
        paySalaries();
    }
    
    double getSalaries() {
        return salaries;
    }
    
    /* 此处假设所有员工都干一年 */
    double paySalaries() {
        /* 用不同类型的员工对象给员工数组赋值 */
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