import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollectionsClass {
    public static void main(String[] args) {
        //It has functions that are there in collections framework but has more properties on top of it.
        List<Integer> ls = new ArrayList<>();
        ls.add(21);
        ls.add(22);
        ls.add(23);
        ls.add(24);
        ls.add(25);
        ls.add(26);
        ls.add(27);

        System.out.println(ls);
        System.out.println("The min element is " + Collections.min(ls));
        System.out.println("The max element here is " + Collections.max(ls));
        System.out.println(Collections.frequency(ls, 8));     //Return how many times 8 appears in the list

        Collections.sort(ls);     //Sort in ascending order
        System.out.println(ls);

        Collections.sort(ls, Comparator.reverseOrder());       //Sort in descending order
        System.out.println(ls);

        //How to sort custom classes
        

    }
}
