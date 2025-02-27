package linkedlists;

public class PrintListRecursively {
    //TC: O(N) -> number of nodes in the linked list && SC: O(N) -> Recursive stack space
    public static void PrintList(Node head){
        if(head == null)return;
        System.out.print(head.data + " ");
        PrintList(head.nextNode);
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
