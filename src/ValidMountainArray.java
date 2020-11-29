
/**
 * @author ：ZYJ
 * @version :1.0.0
 * Given an array A of integers, return true if and only if it is a valid mountain array.
 * <p>
 * Recall that A is a mountain array if and only if:
 * <p>
 * 给定一个整数数组A，如果它是有效的山脉数组就返回true，否则返回 false。
 * <p>
 * 让我们回顾一下，如果 A 满足下述条件，那么它是一个山脉数组：
 * <p>
 * A.length >= 3
 * 在0 < i< A.length - 1条件下，存在i使得：
 * A[0] < A[1] < ... A[i-1] < A[i]
 * A[i] > A[i+1] > ... > A[A.length - 1]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-mountain-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @since :2020/11/3 13:56
 */
public class ValidMountainArray {
    public static boolean validMountainArray(int[] A) {
        if (A.length < 3) {
            return false;
        }
        int i = 0;
        int length = A.length;
        while (i < length - 1 && A[i + 1] > A[i]) {
            i++;
        }
        if (i == 0 || i == length - 1) {
            return false;
        }
        while (i < length - 1 && A[i] > A[i + 1]) {
            i++ ;
        }
        return  i == length -1;
    }

    public static void main(String[] args) {
        System.out.println(validMountainArray(new int[]{1, 0, 3, 2, 1}));
    }
}
