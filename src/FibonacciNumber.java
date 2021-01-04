/**
 * @author ：ZYJ
 * @version :1.0.0
 * @since :2021/01/04 22:19
 * The Fibonacci numbers, commonly denoted F(n) form a sequence,
 * called the Fibonacci sequence, such that each number is the sum of the two preceding ones,
 * starting from 0 and 1. That is,
 * <p>
 * F(0) = 0, F(1) = 1
 * F(n) = F(n - 1) + F(n - 2), for n > 1.
 * Given n, calculate F(n).
 * <p>
 *
 * 斐波那契数，通常用 F(n) 表示，形成的序列称为 斐波那契数列 。该数列由 0 和 1 开始，后面的每一项数字都是前面两项数字的和
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/fibonacci-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class FibonacciNumber {
    public int fib(int n) {
        if (n == 0){
            return 0;
        }else  if (n == 1){
            return 1;
        }else {
            return fib(n-1) + fib(n - 2);
        }
    }
}
