/**
 * @author ：ZYJ
 * @version :1.0.0
 * @since :2021/1/26 22:50
 *
 * Number of Equivalent Domino Pairs
 * Given a list of dominoes,
 * dominoes[i] = [a, b] is equivalent to dominoes[j] = [c, d]
 * if and only if either (a==c and b==d), or (a==d and b==c) - that is,
 * one domino can be rotated to be equal to another domino.
 *
 * Return the number of pairs (i, j) for which 0 <= i < j < dominoes.length,
 * and dominoes[i] is equivalent to dominoes[j].
 *
 * 给你一个由一些多米诺骨牌组成的列表 dominoes。
 *
 * 如果其中某一张多米诺骨牌可以通过旋转 0 度或 180 度得到另一张多米诺骨牌，我们就认为这两张牌是等价的。
 *
 * 形式上，dominoes[i] = [a, b] 和 dominoes[j] = [c, d] 等价的前提是 a==c 且 b==d，或是 a==d 且 b==c。
 *
 * 在 0 <= i < j < dominoes.length 的前提下，找出满足 dominoes[i] 和 dominoes[j] 等价的骨牌对 (i, j) 的数量。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/number-of-equivalent-domino-pairs
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class NumberOfEquivalentDominoPairs {
    public int numEquivDominoPairs(int[][] dominoes) {
        int[] num = new int[100];
        int ret = 0;
        for (int[] domino : dominoes) {
            int val = domino[0] < domino[1] ? domino[0] * 10 + domino[1] : domino[1] * 10 + domino[0];
            ret += num[val];
            num[val]++;
        }
        return ret;
    }
}
