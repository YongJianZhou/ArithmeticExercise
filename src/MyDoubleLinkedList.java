/**
 * @author ：ZYJ
 * @version :1.0.0
 * @since :2020/7/27 4:27 PM
 * implementation of the double linked list.
 */
class MyDoubleLinkedList {
    private final MyDoubleNode guideNode;
    private MyDoubleNode tailNode;
    private int size;

    /**
     * Initialize your data structure here.
     */
    public MyDoubleLinkedList() {
        size = 0;
        guideNode = new MyDoubleNode(0, null, null);
        tailNode = guideNode;
    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {
        MyDoubleNode node = getNode(index);
        return node == null ? -1 : node.value;
    }

    private MyDoubleNode getNode(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        MyDoubleNode node = guideNode;
        int i = 0;
        while (i <= index) {
            node = node.nextNode;
            if (i == index) {
                return node;
            }
            i++;
        }
        return null;
    }

    /**
     * Add a node of value val before the first element of the linked list.
     * After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        MyDoubleNode headerNode = guideNode.nextNode;
        MyDoubleNode addNode = new MyDoubleNode(val, guideNode, headerNode);
        guideNode.nextNode = addNode;
        if (headerNode != null) {
            headerNode.preNode = addNode;
        }
        size++;
        if (size == 1) {
            tailNode = guideNode.nextNode;
        }
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
        tailNode.nextNode = new MyDoubleNode(val, tailNode, null);
        tailNode = tailNode.nextNode;
        size++;
    }

    /**
     * Add a node of value val before the index-th node in the linked list.
     * If index equals to the length of linked list,
     * the node will be appended to the end of linked list.
     * If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        if (index <= 0) {
            addAtHead(val);
        } else if (index == size) {
            addAtTail(val);
        } else {
            MyDoubleNode indexNode = getNode(index);
            if (indexNode != null) {
                MyDoubleNode preNode = indexNode.preNode;
                MyDoubleNode addNode = new MyDoubleNode(val, preNode, indexNode);
                preNode.nextNode = addNode;
                indexNode.preNode = addNode;
                size++;
            }
        }
    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
        if (index >= 0 && index < size) {
            MyDoubleNode indexNode = getNode(index);
            if (indexNode != null && indexNode.preNode != null) {
                indexNode.preNode.nextNode = indexNode.nextNode;
                if (tailNode == indexNode) {
                    tailNode = indexNode.preNode;
                }
                if (indexNode.nextNode != null) {
                    indexNode.nextNode.preNode = indexNode.preNode;
                }
                size--;
            }
        }
    }

    static class MyDoubleNode {
        int value;
        MyDoubleNode preNode;
        MyDoubleNode nextNode;

        public MyDoubleNode(int value, MyDoubleNode preNode, MyDoubleNode nextNode) {
            this.value = value;
            this.preNode = preNode;
            this.nextNode = nextNode;
        }
    }
}
