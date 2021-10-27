/* Exam5_1.java -- �鱾��������ϰ1�����帴���� */
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
    /* ���췽�� */
    Complex() {
    }
    Complex(double real, double image) {
        this.real = real;
        this.image = image;
    }
    /* �������� */
    public void show() {
        /* �Ƚ�ʵ�����鲿תΪ�ַ��� */
        String a = String.valueOf(real);
        String b = String.valueOf(image);
        /* Ȼ��ȥ������С����������� */
        a = subZeroAndDot(a);
        b = subZeroAndDot(b);
        System.out.println(a + "+" + b + "i");
    }

     /** 
     * ʹ��java������ʽȥ�������.��0 
     * @param s 
     * @return  
     *  
     *ԭ�����ӣ�https://blog.csdn.net/msy123_ycj/article/details/47418507
     */
    static String subZeroAndDot(String s){  
        if(s.indexOf(".") > 0){  
            s = s.replaceAll("0+?$", "");//ȥ�������0  
            s = s.replaceAll("[.]$", "");//�����һλ��.��ȥ��  
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