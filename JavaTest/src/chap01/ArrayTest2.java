package chap01;

public class ArrayTest2 {

    public static void main(String[] args) {
        /* �����������Ԫ�ػᱻ����Ĭ��ֵ */
        int[] a = new int[5]; // ��ʱa[0]��a[4]��ֵ����0

        /* ��̬��ʼ������Ҳ���������� */

        for(int i = 0; i < a.length; i++) // ����ѭ����a[0]��a[4]��ֵΪ1~5
            a[i] = i + 1;

        String[] s = new String[2];
        System.out.println(s[0] + s[1]);
        s[0] = "Hello ";
        s[1] = "World.";
        System.out.println(s[0] + s[1]);
    }

}
