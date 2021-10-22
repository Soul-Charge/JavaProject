/* Work2.java -- 工资计算器界面设计 */
package book.workcometrue.chapter02;
import java.util.Scanner;

public class Work2 {

    public static void main(String[] args) {

        /* 显示欢迎界面及菜单项 */
        System.out.println("欢迎使用职工工资计算系统！");
        System.out.println("选择进行操作的类型：");
        System.out.println("1.用户类型选择 2.单个职工工资计算 3.多个职工工资计算 4.退出");
        
        /* 获取菜单项编号 */
        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();
        
        /* 判断输入编号是否在1~4之间 */
        boolean opResult = op == 1 || op == 2 || op == 3 || op == 4;
        String result = opResult ? "您选择的是1~4" : "您的选择不在1~4之间";
        System.out.println(result);
        
        /* 输入职工基本信息 */
        System.out.println("请输入职工姓名：");
        String empName = sc.next();
        System.out.println("职工姓名：" + empName);

        System.out.println("请输入职工姓别：男 true 女 false");
        Boolean sex = sc.nextBoolean();
        System.out.println("性别：" + (sex ? '男' : '女'));
        
        /* 输入工资信息，分为三项：基本工资、津贴、奖金 */
        System.out.println("计算工资");
        System.out.println("请输入基本工资：");
        double basicPay = sc.nextDouble();

        System.out.println("请输入津贴：");
        float allowance = sc.nextFloat();

        System.out.println("请输入奖金：");
        int bonus = sc.nextInt();
        
        double salary = basicPay + allowance + bonus;
        System.out.println("工资：" + salary);
        
        sc.close();
    }

}
