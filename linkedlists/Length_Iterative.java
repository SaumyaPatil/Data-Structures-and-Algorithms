package linkedlists;

//TC: O(n), Where 'n' is the size of linked list.
//SC: O(1), As constant extra space is used.

public class Length_Iterative {
    //Count the number of nodes in the linkedlist
    public static int countNodes(Node head){
        int count = 0;
        Node temp = head;
        if(temp == null)return count;
        else {
            while (temp != null) {
                count++;
                temp = temp.nextNode;
            }
        }
        return count;
    }

    public static void main(){
        Node head = new Node(1);
        head.nextNode = new Node(2);
        head.nextNode.nextNode = new Node(3);
        head.nextNode.nextNode.nextNode = new Node(4);
        head.nextNode.nextNode.nextNode.nextNode = new Node(5);

        System.out.println("Count of nodes is: " + countNodes(head));
    }
}
