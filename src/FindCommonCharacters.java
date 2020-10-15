import java.util.*;

/**
 * @author ：ZYJ
 * @version :1.0.0
 * Given an array A of strings made only from lowercase letters,
 * return a list of all characters that show up in all strings within the list (including duplicates).
 * For example, if a character occurs 3 times in all strings but not 4 times,
 * you need to include that character three times in the final answer.
 * <p>
 * You may return the answer in any order.
 * <p>
 * 给定仅有小写字母组成的字符串数组 A，返回列表中的每个字符串中都显示的全部字符（包括重复字符）组成的列表。
 * 例如，如果一个字符在每个字符串中出现 3 次，但不是 4 次，则需要在最终答案中包含该字符 3 次。
 * <p>
 * 你可以按任意顺序返回答案。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-common-characters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @since :2020/10/14 16:37
 */
public class FindCommonCharacters {
    /**
     * 官方答案
     */
    public List<String> commonChars(String[] A) {
        int[] minFreq = new int[26];
        Arrays.fill(minFreq, Integer.MAX_VALUE);
        for (String word: A) {
            int[] freq = new int[26];
            int length = word.length();
            for (int i = 0; i < length; ++i) {
                char ch = word.charAt(i);
                ++freq[ch - 'a'];
            }
            for (int i = 0; i < 26; ++i) {
                minFreq[i] = Math.min(minFreq[i], freq[i]);
            }
        }

        List<String> ans = new ArrayList<String>();
        for (int i = 0; i < 26; ++i) {
            for (int j = 0; j < minFreq[i]; ++j) {
                ans.add(String.valueOf((char) (i + 'a')));
            }
        }
        return ans;
    }
}
