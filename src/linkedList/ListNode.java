package linkedList;

/**
 * @author ：ZYJ
 * @version :1.0.0
 * @since :2020/10/10 13:34
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }

    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
