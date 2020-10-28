import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @author ：ZYJ
 * @version :1.0.0
 * Unique Number of Occurrences
 * Given an array of integers arr,
 * write a function that returns true if and only if the number of occurrences of each value in the array is unique.
 * 给你一个整数数组 arr，请你帮忙统计数组中每个数的出现次数。
 * 如果每个数的出现次数都是独一无二的，就返回 true；否则返回 false。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/unique-number-of-occurrences
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @since :2020/10/28 21:21
 */

public class UniqueNumberOfOccurrences {

    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map  = new HashMap<>();
        for (int i : arr) {
            if (map.containsKey(i)){
                int count = map.get(i);
                map.put(i,++count);
            }else {
                map.put(i,1);
            }
        }
        HashSet<Integer> countSet = new HashSet<>();
        for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
            countSet.add(integerIntegerEntry.getValue());
        }
        return  map.size() == countSet.size();
    }
}
