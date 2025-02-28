package stacks;

import java.util.Stack;

import linkedlists.Node;

public class stacks_using_linkedlists {
    //TC: O(1) - for all push pop and peek as we are not performing any traversal over the list but we are performing operations through current pointer only!
    //SC: O(N) - auxilary space stack space
    Node head;
    stacks_using_linkedlists(){
        this.head = null;
    }

    boolean isEmpty(){
        return head==null;
    }

    void push(int new_data){
        Node newNode = new Node(new_data);
        newNode.nextNode = head;
        head = newNode;
    }

    void pull(){
        if(isEmpty()){
            System.out.println("System underflow");
            return;
        }

        Node temp = head;
        head = head.nextNode;
        temp = null;
    }

    int peek(){
        if(!isEmpty()){
            return head.data;
        }
        else{
            System.out.println("Stack is empty!");
            return Integer.MIN_VALUE;
        }
    }



    public static void main(String[] args){
        Stack st = new Stack();

        st.push(11);
        st.push(22);
        st.push(33);
        st.push(44);

        System.out.println("Top element is: " + st.peek());

        System.out.println("Removing two elements");
        st.pop();
        st.pop();

        System.out.println("Top element is " + st.peek());
    }
}
