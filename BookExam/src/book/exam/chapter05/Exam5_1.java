/* Exam5_1.java -- 书本第五章练习1：定义复数类 */
package book.exam.chapter05;

class Complex {
    private double real;
    private double image;
    
    double getReal() {
        return real;
    }
    double getImage() {
        return image;
    }
    void setReal(double real) {
        this.real = real;
    }
    void setImage(double image) {
        this.image = image;
    }
    /* 构造方法 */
    Complex() {
    }
    Complex(double real, double image) {
        this.real = real;
        this.image = image;
    }
    /* 其他方法 */
    public void show() {
        /* 先将实部和虚部转为字符串 */
        String a = String.valueOf(real);
        String b = String.valueOf(image);
        /* 然后去除它们小数点后多余的零 */
        a = subZeroAndDot(a);
        b = subZeroAndDot(b);
        System.out.println(a + "+" + b + "i");
    }

     /** 
     * 使用java正则表达式去掉多余的.与0 
     * @param s 
     * @return  
     *  
     *原文链接：https://blog.csdn.net/msy123_ycj/article/details/47418507
     */
    static String subZeroAndDot(String s){  
        if(s.indexOf(".") > 0){  
            s = s.replaceAll("0+?$", "");//去掉多余的0  
            s = s.replaceAll("[.]$", "");//如最后一位是.则去掉  
        }  
        return s;  
    }   
}

public class Exam5_1 {

    public static void main(String[] args) {

        Complex c1 = new Complex(2, 5);
        c1.show();

        Complex c2 = new Complex();
        c2.setReal(-9);
        c2.setImage(3);
        c2.show();
    }
}