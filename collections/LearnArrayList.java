import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


// Reference video - https://youtu.be/rzA7UJ-hQn4?si=Kdnn-Trzr2KuoneW

public class LearnArrayList{
    public static void main(String[] args) {

        //We can implement list using linkedlist as well so just change name to Linkedlist thats it. it wont throw error cause interface is providing methods that we studied below.
        ArrayList<String> studentsName = new ArrayList<>();
        studentsName.add("Saumya");
        studentsName.add("Siddhi");
        studentsName.add("Surbhi");
        studentsName.add("Shyam");

        // size = n
        // n + n/2 + 1 - When array is filled and still theres another element gonna be added then the array size is increased by this much
        //Elements of previous array are copied into the new array 

        //Functionalities in arraylist
        //Adding elements in an arraylist
        List<Integer> ls = new ArrayList<>();
        ls.add(1);
        ls.add(2);
        ls.add(3);
        System.out.println(ls);

        ls.add(4);            //This will add 4 at the end of the list
        System.out.println(ls);

        //Adding elements at a particular position in arraylist - TC : O(n)
        ls.add(1, 50);     //This will add 50 at index 1
        System.out.println(ls);

        //Adding a newlist to the given list
        List<Integer> newList = new ArrayList<>();
        newList.add(150);
        newList.add(160);

        ls.addAll(newList);
        System.out.println(ls);

        //Accessing an element at a position
        System.out.println(ls.get(1));
        
        //removing element   - TC : O(n)
        ls.remove(0);       //Removes element at index 0
        System.out.println(ls);        

        ls.remove(Integer.valueOf(30));  //Removes value from the arraylist, pass datatype of which the arraylist is
        System.out.println(ls);

        ls.clear();          //This clears all the elements of the list
        System.out.println(ls);

        ls.set(0, 20);    //TC : O(1)
        System.out.println(ls);

        System.out.println(ls.contains(20));     //TC : O(n) - It checks if 20 is present in the list or not. Returns true/false

        //We can print the list by writing ls name inside the sout method. When we do so the toString method gets invoked which is inside each class.
        //Iterating elements - 
        for (int i = 0; i < ls.size(); i++) {    //elements present inside
            System.out.print("The element is " + ls.get(i));
        }
        System.out.println();

        //foreach loop
        for(Integer ele: ls){
            System.out.print(ele + " ");
        }
        System.out.println();

        //Iterator interface 
        Iterator<Integer> iterator = ls.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}
