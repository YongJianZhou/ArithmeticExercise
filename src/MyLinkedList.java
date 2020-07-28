/**
 * @author ：ZYJ
 * @version :1.0.0
 * @since : 2020/7/27 2:01 PM
 * Design your implementation of the linked list.
 * You can choose to use the singly linked list or the doubly linked list.
 * A node in a singly linked list should have two attributes: val and next.
 * val is the value of the current node, and next is a pointer/reference to the next node.
 * If you want to use the doubly linked list,
 *  you will need one more attribute prev to indicate the previous node in the linked list.
 * Assume all nodes in the linked list are 0-indexed.
 * <p>
 * Implement these functions in your linked list class:
 * <p>
 * get(index) : Get the value of the index-th node in the linked list.
 * If the index is invalid, return -1.
 * addAtHead(val) : Add a node of value val before the first element of the linked list.
 * After the insertion, the new node will be the first node of the linked list.
 * addAtTail(val) : Append a node of value val to the last element of the linked list.
 * addAtIndex(index, val) : Add a node of value val before the index-th node in the linked list.
 *  If index equals to the length of linked list, the node will be appended to the end of linked list.
 * If index is greater than the length, the node will not be inserted.
 * deleteAtIndex(index) : Delete the index-th node in the linked list, if the index is valid.
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/design-linked-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * <p>
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
class MyLinkedList {
    private final MyNode guardNode;
    private MyNode tailNode;
    private int size;

    /**
     * Initialize your data structure here.
     */
    public MyLinkedList() {
        size = 0;
        guardNode = new MyNode(0, null);
        tailNode = guardNode;
    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {
        MyNode node = getNode(index);
        return node == null ? -1 : node.value;
    }

    private MyNode getNode(int index) {
        if (index >= 0 && index <= size - 1) {
            MyNode node = guardNode;
            int i = 0;
            while (i <= index) {
                node = node.next;
                if (i == index) {
                    return node;
                }
                i++;
            }
        }
        return null;
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        MyNode headerNode = guardNode.next;
        guardNode.next = new MyNode(val, headerNode);
        size++;
        if (size == 1) {
            tailNode = guardNode.next;
        }
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
        MyNode node = new MyNode(val, null);
        tailNode.next = node;
        tailNode = node;
        size++;
    }

    /**
     * Add a node of value val before the index-th node in the linked list.
     * If index equals to the length of linked list,
     * the node will be appended to the end of linked list.
     * If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        }
        if (index <= 0) {
            addAtHead(val);
        } else {
            MyNode indexNode = getNode(index);
            MyNode preNode = getNode(index - 1);
            if (index == size) {
                MyNode newNode = new MyNode(val, null);
                if (preNode != null) {
                    preNode.next = newNode;
                    tailNode = newNode;
                }
            } else {
                if (preNode != null) {
                    preNode.next = new MyNode(val, indexNode);
                }
            }
            size++;
        }
    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
        MyNode needDeleteNode = getNode(index);
        MyNode preNode;
        if (index == 0) {
            preNode = guardNode;
        } else {
            preNode = getNode(index - 1);
        }
        if (needDeleteNode != null && preNode != null) {
            preNode.next = needDeleteNode.next;
            if (needDeleteNode == tailNode) {
                tailNode = preNode;
            }
            size--;
        }
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            MyNode node = getNode(i);
            if (node != null) {
                System.out.print(node.value + " ");
            }
        }
        System.out.println();
    }

    static class MyNode {
        public MyNode(int value, MyNode next) {
            this.value = value;
            this.next = next;
        }

        int value;
        MyNode next;
    }
}
