import java.util.ArrayList;
import java.util.List;

/**
 * @author ：ZYJ
 * @version :1.0.0
 *
 * 枚举出全部子序列
 * @since :2020/9/9 13:37
 */
public class EnumerateAllSubSequence {
    private List<List<Integer>> result = new ArrayList<>();
    private List<Integer> temp = new ArrayList<>();

    public List<List<Integer>> combinationSum(int n) {
        dfs(1, n);
        return result;
    }

    public void dfs(int current, int n) {
        if (current == n + 1) {
            result.add(new ArrayList<>(temp));
            return;
        }
        temp.add(current);
        dfs(current + 1, n);
        temp.remove(temp.size() - 1);
        dfs(current + 1, n);
    }

    public static void main(String[] args) {
        EnumerateAllSubSequence enumerateAllSubSequence = new EnumerateAllSubSequence();
        enumerateAllSubSequence.combinationSum(8);
        for (List<Integer> integers : enumerateAllSubSequence.result) {
            System.out.println(integers.toString());
        }
    }
}
