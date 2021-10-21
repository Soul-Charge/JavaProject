package chap01;

public class ArrayTest2 {

    public static void main(String[] args) {
        /* 创建完数组后元素会被赋予默认值 */
        int[] a = new int[5]; // 此时a[0]到a[4]的值都是0

        /* 动态初始化本身也是数组引用 */

        for(int i = 0; i < a.length; i++) // 结束循环后a[0]到a[4]的值为1~5
            a[i] = i + 1;

        String[] s = new String[2];
        System.out.println(s[0] + s[1]);
        s[0] = "Hello ";
        s[1] = "World.";
        System.out.println(s[0] + s[1]);
    }

}
