package linkedList;

import java.util.ArrayList;

/**
 * @author ：ZYJ
 * @version :1.0.0
 * @since :2020/12/24 14:10
 */
public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        ListNode temp;
        while (cur != null){
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }

    public ListNode reverseListRecursion(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = reverseListRecursion(head.next);
        head.next.next = head;
        head.next = null;
        return  pre;
    }
}
