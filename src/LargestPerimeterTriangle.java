import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;
import sun.jvm.hotspot.utilities.IntArray;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author ：ZYJ
 * @version :1.0.0
 * <p>
 * Given an array A of positive lengths,
 * return the largest perimeter of a triangle with non-zero area,
 * formed from 3 of these lengths.
 * <p>
 * If it is impossible to form any triangle of non-zero area, return 0.
 * 给定由一些正数（代表长度）组成的数组 A，返回由其中三个长度组成的、面积不为零的三角形的最大周长。
 * <p>
 * 如果不能形成任何面积不为零的三角形，返回 0。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/largest-perimeter-triangle
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @since :2020/11/29 14:43
 */
public class LargestPerimeterTriangle {

    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for (int i = A.length - 1; i >= 2; i--) {
            if (isValidTriangle(A[i], A[i - 1], A[i - 2])) {
                return A[i] + A[i - 1] + A[i - 2];
            }
        }
        return 0;
    }

    public boolean isValidTriangle(int a, int b, int c) {
        return a < b + c && b < a + c && c < a + b;
    }
}
