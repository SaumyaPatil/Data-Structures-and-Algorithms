// import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnMap {
    public static void main(String[] args) {
        //All operations are in O(n)
        // Map<String, Integer> mp = new HashMap<>();

        //It puts the keys into a BST - All operations are in O(log n)
        Map<String, Integer> mp = new TreeMap<>();

        mp.put("One", 1);
        mp.put("Two", 2);
        mp.put("Three", 3);
        mp.put("Four", 4);
        mp.put("Two", 20);
        mp.remove("Two");

        //Since numbers get overwritten so this can be done
        if (!mp.containsKey("Two")) {
            mp.put("Two", 30);
        }

        System.out.println(mp);

        mp.putIfAbsent("Four", 30);

        for(Map.Entry<String, Integer> e: mp.entrySet()){
            System.out.print(e + " ");
            System.out.print(e.getKey() + " ");
            System.out.println(e.getValue());
        }

        //To just print keys
        for(String key : mp.keySet()){
            System.out.println(key);
        }

        // for(Integer value : mp.values()){
        //     System.out.println(value);
        // }

        System.out.println(mp.containsValue(3));

        //To check if map is empty or not.
        System.out.println(mp.isEmpty());
    }
}
