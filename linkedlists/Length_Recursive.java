package linkedlists;

public class Length_Recursive {
    //Count the number of nodes in the linkedlist
    public static int countNodes(Node head){
        if(head == null)return 0;
        return 1+countNodes(head.nextNode);
    }

    public static void main(String[] args){
        Node head = new Node(1);
        head.nextNode = new Node(2);
        head.nextNode.nextNode = new Node(3);
        head.nextNode.nextNode.nextNode = new Node(4);
        head.nextNode.nextNode.nextNode.nextNode = new Node(5);

        System.out.println("Count of nodes is: " + countNodes(head));
    }
}

//TC: O(N) - length of linked list
//SC: O(N) - recursion call stack
