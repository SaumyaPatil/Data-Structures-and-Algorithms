package linkedlists;

public class PrintLinkedList {
    //TC: O(N) & SC: O(1)
    public static void PrintList(Node head){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.nextNode;
        }
    }

    public static void main(String[] args){
        Node head = new Node(1);
        head.nextNode = new Node(2);
        head.nextNode.nextNode = new Node(3);
        head.nextNode.nextNode.nextNode = new Node(4);
        head.nextNode.nextNode.nextNode.nextNode = new Node(5);

        PrintList(head);
    }
}
