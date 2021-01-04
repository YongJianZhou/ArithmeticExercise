package linkedList;

/**
 * @author ：ZYJ
 * @version :1.0.0
 * @since :2021/01/04 22:19
 * <p>
 * Given the head of a linked list, remove the nth node from the end of the list and return its head.
 * <p>
 * Follow up:Could you do this in one pass?
 * <p>
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class RemoveNthNodeFromEndOfList {
    //todo use stack
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;
        int length = 0;
        ListNode preHead = new ListNode(-1,head);
        ListNode current = preHead;
        while (head != null) {
            length++;
            head = head.next;
        }
        int index = length - n;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.next =  current.next.next;
        return preHead.next;
    }
}
