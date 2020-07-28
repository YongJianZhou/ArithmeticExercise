/**
 * ["MyLinkedList","addAtHead","addAtHead","addAtHead","addAtIndex","deleteAtIndex","addAtHead","addAtTail","get",
 * "addAtHead","addAtIndex","addAtHead"]
 * [[],[7],[2],[1],[3,0],[2],[6],[4],[4],[4],[5,0],[6]]
 */
public class Main {

    public static void main(String[] args) {
        MyDoubleLinkedList linkedList = new MyDoubleLinkedList();
        linkedList.addAtHead(7);
        linkedList.addAtHead(2);
        linkedList.addAtHead(1);
        linkedList.addAtIndex(3, 0);
        linkedList.deleteAtIndex(2);
        linkedList.addAtHead(6);
        linkedList.addAtTail(4);
        linkedList.get(4);
        linkedList.addAtHead(4);
        linkedList.addAtIndex(5, 0);
        linkedList.addAtHead(6);
    }
}
