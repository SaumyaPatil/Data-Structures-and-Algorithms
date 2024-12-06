import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {
        //Doubly ended queue - you can add or remove elements from both ends
        //You can even peek elements from both ends
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        //It implements queue and those methods can be used here.
        adq.offer(20);

        adq.offerFirst(10);
        adq.offerLast(87);
        adq.offer(97);
        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println(adq.poll());

        System.out.println(adq.pollFirst());
        System.out.println(adq.pollLast());

        
    }
}
