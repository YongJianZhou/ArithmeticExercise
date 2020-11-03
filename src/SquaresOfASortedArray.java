import sun.security.util.ArrayUtil;

import java.sql.Array;
import java.util.Arrays;

/**
 * @author ：ZYJ
 * @version :1.0.0
 * Given an array of integers A sorted in non-decreasing order,
 * return an array of the squares of each number,
 * also in sorted non-decreasing order.
 * 给定一个按非递减顺序排序的整数数组 A，返回每个数字的平方组成的新数组，要求也按非递减顺序排序。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/squares-of-a-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @since :2020/10/16 15:43
 */
public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] A) {
        if (A == null) {
            return null;
        }
        int[] result = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            result[i] = A[i] * A[i];
        }
        Arrays.sort(result);
        return result;
    }
}
