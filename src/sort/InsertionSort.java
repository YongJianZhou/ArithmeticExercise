package sort;

/**
 * @author ：ZYJ
 * @version :1.0.0
 * @since :2020/8/10 13:56
 * 插入排序
 * <p>
 * no grasp
 */
public class InsertionSort {

    public static int[] sort(int[] array) {
        if (array.length < 1) return array;

        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            for (; j > 0; j--) {
                if (current < array[j]) {
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }
            array[j + 1] = current;
        }
        return array;
    }

    public static void main(String[] args) {
        SortInput.inputArray(sort(new int[]{1, 2, 7, 5, 4, 6, 8}));
    }
}
