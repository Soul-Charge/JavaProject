/* ThreeSevenGamma.java -- 第三章练习7：计算调和级数γ版：使用自定类和方法 */
package book.exam.chapter03;

class MathTools {
    /* 计算int数的幂 */
    public static int intPow(int base, int index) {
        int result = base;
        /* 进行index-1次迭代，因为base的index次方等于base乘自己index-1次 */
        for(int i = 1; i < index; i++) { 
            result *= base;
        }
        return result;
    }
}

public class Exam3_7Gamma {

    public static void main(String[] args) {
        final int X = 5; // 常量，(x > 1)
        double y = 1;

        for (int i = 1; true; i++) {
            
            y += (double)1 / MathTools.intPow(X, i);

            if((double)1 / MathTools.intPow(X, i) < (double)1 / 10000)
                break;
        }
        System.out.println("y = " + y);
    }

}
