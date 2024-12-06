import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        //Since queue is implementing priority queue, the functions offered by queue are valid here.
        pq.offer(90);
        pq.offer(34);
        pq.offer(53);
        pq.offer(63);
        System.out.println(pq);

        //Under the hood min heap is implemented so the smallest element comes at the top 
        pq.poll();
        System.out.println(pq);  //It implements heapify function internally

        System.out.println(pq.peek());


        //Max heap 
        Queue<Integer> pqm = new PriorityQueue<>(Comparator.reverseOrder());
        pqm.offer(20);
        pqm.offer(30);
        pqm.offer(340);
        pqm.offer(301);
        pqm.offer(560);
        pqm.offer(32);
        System.out.println(pqm);
        
    }
}
