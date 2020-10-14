import java.util.ArrayList;
import java.util.List;

/**
 * @author ：ZYJ
 * @version :1.0.0
 * @since :2020/9/9 16:14
 */
public class CombinationSum {
    private List<List<Integer>> result = new ArrayList<>();
    private List<Integer> temp = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        dfs(0, candidates, target);
        return result;
    }

    public void dfs(int index, int[] candidates, int target) {

    }
}
