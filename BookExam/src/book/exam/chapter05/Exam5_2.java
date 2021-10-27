/* Exam5_2.java -- �鱾��������ϰ2��������ʹ��Book��*/
package book.exam.chapter05;
import java.util.Scanner;

class Book {
    private String author;
    private String title;
    private double price;
    private String publisher;
    private int    publishedYear;
    
    /* getters() & setters() */
    String getAuthor() {
        return author;
    }
    String getTitle() {
        return title;
    }
    double getPrice() {
        return price;
    }
    String getPublisher() {
        return publisher;
    }
    int getPublishedYear() {
        return publishedYear;
    }
    void setAuthor(String author) {
        this.author = author;
    }
    void setTitle(String title) {
        this.title = title;
    }
    void setPrice(double price) {
        this.price = price;
    }
    void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    /* ������ */
    Book() {
    }
    Book(String title, String author, String publisher,
            int publishedYear, double price) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publishedYear = publishedYear;
        this.price = price;
    }
    
    /* �������� */
    void showBookInfo() {
        System.out.println("\t" + title);
        System.out.println("---------------------------------");
        System.out.println("�� ��\t" + author);
        System.out.println("��" + publisher + "���淢��");
        System.out.println("��" + publishedYear + "����");
        System.out.println("---------------------------------");
        System.out.println("\t���ۣ�" + price);
    }
}

public class Exam5_2 {

    public static void main(String[] args) {

        Book jsGuide = new Book("JavaScriptѧϰָ��", "Shelley Powers", "�����ʵ������",
                2009, 45.00);
        jsGuide.showBookInfo();
        
        Scanner sc = new Scanner(System.in);
        Book book = new Book();
        System.out.println("��������");
        book.setTitle(sc.next());
        System.out.println("����������");
        book.setAuthor(sc.next());
        System.out.println("�����������");
        book.setPublisher(sc.next());
        System.out.println("����������");
        book.setPublishedYear(sc.nextInt());
        System.out.println("����۸�");
        book.setPrice(sc.nextInt());

        book.showBookInfo();
        sc.close();
    }
}
