import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {
    public static void main(String[] args) {
        //Linkedlist is a class and a class can implement multiple interfaces so it implements both queue and list.
        Queue<Integer> q = new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);                     //Offers element from rear end to the queue

        System.out.println(q.poll());      //removes and returns the first value of the queue

        System.out.println(q.peek());      //Gives the first element to be removed

        //add() function is also as offer() function but it adds element and returns true otherwise throws exception while offer function
        //returns true or false
        
        //element() function is same as peek() but it throws exception if the queue is empty while peek() simply returns exception

        //remove() is same as poll() but throws exception while in poll it simply returns null

        

    }
}
