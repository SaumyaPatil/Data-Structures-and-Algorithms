// import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnLinkedHashSet {
    public static void main(String[] args) {
        //It implements properties of set and linkedlist both - here the order of the elements is maintained
        // Set<Integer> s = new LinkedHashSet<>();

        //It implements properties of set and BST both - You get the elements in sorted form. Operations happen in O(log n) time.
        Set<Integer> s = new TreeSet<>(); 
        s.add(23);
        s.add(42);
        s.add(98);
        s.add(52);
        s.add(97);
        System.out.println(s);

        //No repitative elements are allowed.

        //hasing is implemented internally and it checks if there is any existing value in the bag.
        s.remove(23);
        System.out.println(s);

        System.out.println(s.contains(59));
        System.out.println(s.isEmpty());     //returns a boolean value

        System.out.println(s.size());
        s.clear();

    }
}
