/* Exam5_2.java -- 书本第五章练习2：创建并使用Book类*/
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

    /* 构造器 */
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
    
    /* 其他方法 */
    void showBookInfo() {
        System.out.println("\t" + title);
        System.out.println("---------------------------------");
        System.out.println("◆ 著\t" + author);
        System.out.println("◆" + publisher + "出版发行");
        System.out.println("◆" + publishedYear + "出版");
        System.out.println("---------------------------------");
        System.out.println("\t定价：" + price);
    }
}

public class Exam5_2 {

    public static void main(String[] args) {

        Book jsGuide = new Book("JavaScript学习指南", "Shelley Powers", "人民邮电出版社",
                2009, 45.00);
        jsGuide.showBookInfo();
        
        Scanner sc = new Scanner(System.in);
        Book book = new Book();
        System.out.println("输入书名");
        book.setTitle(sc.next());
        System.out.println("输入作者名");
        book.setAuthor(sc.next());
        System.out.println("输入出版社名");
        book.setPublisher(sc.next());
        System.out.println("输入出版年份");
        book.setPublishedYear(sc.nextInt());
        System.out.println("输入价格");
        book.setPrice(sc.nextInt());

        book.showBookInfo();
        sc.close();
    }
}
