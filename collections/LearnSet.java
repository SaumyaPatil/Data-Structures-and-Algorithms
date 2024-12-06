import java.util.HashSet;
import java.util.Set;

public class LearnSet {
    public static void main(String[] args) {
        // Set<Integer> s = new HashSet<>();
        // s.add(23);
        // s.add(42);
        // s.add(98);
        // s.add(52);
        // s.add(97);
        // System.out.println(s);

        // //order inside set is not defined. No repitative elements are allowed. All operations happen in O(n) time complexity. 
        // //Thats why its most optimised.

        // //hasing is implemented internally and it checks if there is any existing value in the bag.
        // s.remove(23);
        // System.out.println(s);

        // System.out.println(s.contains(59));
        // System.out.println(s.isEmpty());     //returns a boolean value

        // System.out.println(s.size());
        // s.clear();

        Set<Student> st = new HashSet<>();
        st.add(new Student("Anuj", 20));
        st.add(new Student("Paresh", 30));
        st.add(new Student("Nakul", 40));
        st.add(new Student("Arjun", 50));
        st.add(new Student("Bheem", 60));
        //Here objects are created so the set is not able to distinguish unique and mentions all objects created in the set
        System.out.println(st);

        
    }
}
