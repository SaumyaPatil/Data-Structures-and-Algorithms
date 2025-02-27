package linkedlists;

public class DoublyLinkedNode {
    int data;
    DoublyLinkedNode prev;
    DoublyLinkedNode next;

    DoublyLinkedNode(int newData){
        data = newData;
        prev = next = null;
    }
}
