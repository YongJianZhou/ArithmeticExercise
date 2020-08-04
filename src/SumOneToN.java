/**
 * @author ：ZYJ
 * @version :1.0.0
 * @since :2020/8/4 11:19 上午
 * 求 1+2+...+n ，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/qiu-12n-lcof/
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class SumOneToN {
    public static int sumOneToN(int n) {
        int sum = 0;
        int index = n - 1;
        if (index == -1) {
            return sum;
        } else {
            return sumOneToN(index) + n;
        }
    }
}
