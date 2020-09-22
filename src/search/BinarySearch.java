package search;

/**
 * @author ：ZYJ
 * @version :1.0.0
 * 给定一个n个元素有序的（升序）整型数组nums 和一个目标值target，
 * 写一个函数搜索nums中的 target，如果目标值存在返回下标，否则返回 -1。
 * Given a sorted (in ascending order) integer array nums of n elements and a target value,
 * write a function to search target in nums. If target exists, then return its index, otherwise return -1.
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binary-search
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @since :2020/9/10 09:52
 */
public class BinarySearch {
    public static int search(int[] nums, int target) {
        return searchWithoutRepeatElementByRecursion(nums, 0, nums.length - 1, target);
    }

    public static int searchWithoutRepeatElementByRecursion(int[] nums, int start, int end, int target) {
        if (start > end) return -1;
        int middle = start + ((end - start) >> 1);
        if (target == nums[middle]) {
            return middle;
        } else if (target > nums[middle]) {
            return searchWithoutRepeatElementByRecursion(nums, middle + 1, end, target);
        } else {
            return searchWithoutRepeatElementByRecursion(nums, start, middle - 1, target);
        }
    }

    public static int searchFirstWithRepeatElement(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int middle = low + ((high - low) >> 1);
            if (nums[middle] > target) {
                high = middle - 1;
            } else if (nums[middle] < target) {
                low = middle + 1;
            } else {
                if (middle == 0 || nums[middle - 1] != nums[middle]) {
                    return middle;
                } else {
                    high = middle - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{-1, 0, 3, 5, 6, 9, 12}, 3));
        System.out.println(searchFirstWithRepeatElement(new int[]{-1, 0, 3, 3, 3, 3, 5, 6, 9, 12}, 3));
    }
}
