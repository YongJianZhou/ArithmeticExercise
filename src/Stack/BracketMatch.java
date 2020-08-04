package Stack;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * @author ：ZYJ
 * @version :1.0.0
 * @since :2020/7/13 5:51 PM
 * <p>
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Note that an empty string is also considered valid.
 * <p>
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']'的字符串，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class BracketMatch {
    public static boolean isValid(String s) {
        if (s.isEmpty()) {
            return false;
        }
        if (s.length() % 2 != 0) {
            return false;
        }
        List<String> left = Arrays.asList("(", "{", "[");
        List<String> right = Arrays.asList(")", "}", "]");
        if (right.contains(s.substring(0, 1))) {
            return false;
        }
        Stack<String> stringStack = new Stack<>();
        String[] array = s.split("");
        for (String string : array) {
            if (left.contains(string)) {
                stringStack.push(string);
            }
            if (right.contains(string)) {
                if (!stringStack.peek().equals(left.get(right.indexOf(string)))) {
                    return false;
                } else {
                    stringStack.pop();
                }
            }
        }
        return stringStack.size() == 0;
    }
}