/**
 * @author ：ZYJ
 * @version :1.0.0
 * @since :2020/7/27 10:20 AM
 * Given a string s and a string t, check if s is subsequence of t.
 * <p>
 * A subsequence of a string is a new string which is formed from
 * the original string by deleting some (can be none) of the characters without
 * disturbing the relative positions of the remaining characters.
 * (ie, "ace" is a subsequence of "abcde" while "aec" is not).
 * <p>
 * Follow up:
 * If there are lots of incoming S, say S1, S2, ... , Sk where k >= 1B,
 * and you want to check one by one to see if T has its subsequence.
 * In this scenario, how would you change your code?
 * <p>
 * Credits:
 * Special thanks to @pbrother for adding this problem and creating all test cases.
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/is-subsequence
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class IsSubString {
    public static boolean isSubsequence(String s, String t) {
        int sPointer = 0;
        int tPointer = 0;
        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();
        for (char c : tCharArray) {
            if (sPointer > sCharArray.length - 1) {
                return tPointer == s.length();
            }
            char sChar = sCharArray[sPointer];
            if (c == sChar) {
                sPointer++;
                tPointer++;
            }
            if (tPointer == s.length()) return true;
        }
        return tPointer == s.length();
    }
}

