package linkedlists;

public class Insertion {
    //TC: O(1) && SC: O(1)
    //1. At the beginning of linked list
    public static void InsertAtBeginning(Node head){
        if (head == null) {
            return;
        }

        Node newNode = new Node(7);
        newNode.nextNode = head;
        head = newNode;
    }

    //TC: O(N) && SC: O(1)
    //2 After a given node in linked list
    public static void InsertAfterANode(Node head, int key){
        if (head == null) {
            return;
        }

        Node temp = head;
        while(temp != null && temp.data != key){
            temp = temp.nextNode;
        }

        if (temp == null) {
            System.out.println("Key not found!");
        }

        Node newNode = new Node(1);
        newNode.nextNode = temp.nextNode;
        temp.nextNode = newNode;
    }

    //TC: O(N) && SC: O(1)
    //3. Inserting node before given node in the linked list - iteratively
    public static void InsertBeforeANode(Node head, int key){
        if(head == null)return;
        Node prev = null, curr = head;
        while (curr != null && curr.data != key) {
            prev = curr;
            curr = curr.nextNode;
        }
        Node newNode = new Node(2);
        prev.nextNode = newNode;
        newNode.nextNode = curr;
    }

    //Recursive approach
    public static void InsertBeforeANodeRecursively(Node head, int key){
        
    }

    public static void main(String[] args){
        Node head = new Node(1);
        head.nextNode = new Node(2);
        head.nextNode.nextNode = new Node(3);
        head.nextNode.nextNode.nextNode = new Node(4);
        head.nextNode.nextNode.nextNode.nextNode = new Node(5);
        head.nextNode.nextNode.nextNode.nextNode.nextNode = new Node(6);
        InsertAtBeginning(head);

        InsertAfterANode(head, 4);
    }
}
