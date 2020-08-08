package Sort;

/**
 * @author ：ZYJ
 * @version :1.0.0
 * @since :2020/8/6 14:47
 * 冒泡排序
 */
public class BubbleSort {
    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean hasExchange = false;
            for (int j = i; j < array.length - i - 1; j++) {// from 0 to i is in order
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    hasExchange = true;
                }
            }
            if (!hasExchange) break; // no exchange mean array is in order
        }
        return array;
    }

    public static void main(String[] args) {
        int a = 1;
        for (int i : sort(new int[]{9, 3, 414, 231, 1231, 213145})) {
            System.out.println(i);
        }
        System.out.println(a);
    }
}
