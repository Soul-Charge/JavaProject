/* Example4_4.java -- �鱾�����°�������4������ɼ��� */
/* TODO: ����Beta�棺ʹ��һ��������ѭ�����ƽ���� */
package book.example.chapter04;
import java.util.Scanner;

public class Example4_4 {

    public static void main(String[] args) {

        int total = 0; // ��ʱ�ۼ����Ƴɼ��ĺ�
        int [][] scoreSheet = new int[5][5];
        Scanner sc = new Scanner(System.in);

        System.out.println("����������ѧ�š���ѧ�����ġ�Ӣ��ɼ�:");
        for(int row = 0; row < scoreSheet.length; row++) {

            for(int col = 0; col < scoreSheet[row].length; col++) {

                int inputNum = -1;
                if(col < 4) // ���һ��(col == 4)��������Ҫ��ȡֵ
                    inputNum = sc.nextInt();

                if(col > 0 && col < scoreSheet[row].length-1) // �ۼӳɼ����ܿ���λѧ�ź�ĩβƽ���ֿ�λ
                    total += inputNum;

                if(col == scoreSheet[row].length - 1) // �����һ�м��㸳��ƽ����
                    scoreSheet[row][col] = total / 3;
                else
                    scoreSheet[row][col] = inputNum; // ��ͨ�Ļ�ȡѧ�źͳɼ�����Ӧλ��

            }
                total = 0; // ����ÿ�к����
        }

        System.out.println("ѧ��\t��ѧ\t����\tӢ��\tƽ����");
        for(int row = 0; row < scoreSheet.length; row++) {
            for(int col = 0; col < scoreSheet[row].length; col++) {
                
                System.out.print(scoreSheet[row][col] + "\t");
                if((col+1) % 5 == 0)
                    System.out.println("");
            }
        }
        sc.close();
    }

}
