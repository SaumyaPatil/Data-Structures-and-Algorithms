package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class insertion_beginning {

    public static void main(String[] args){
        //Using built-in methods
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
        int element1 = 50;
        System.out.println("Array before insertion.");
        for(int i=0; i<arr1.size(); i++){
            System.out.print(arr1.get(i)+" ");
        }

        arr1.add(0, element1);
        System.out.println("Array after insertion.");
        for(int i=0; i<arr1.size(); i++){
            System.out.print(arr1.get(i)+" ");
        }

        //Using custom method
        int[] arr2 = {10, 20, 30, 40, 0};
        int n = 4;
        int element2 = 50;
        System.out.println("Array before insertion.");
        for(int i=0; i<n; i++){
            System.out.print(arr2[i]+" ");
        }
        
        //Shift all elements to right
        for(int i=n-1; i>=0; i--){
            arr2[i+1] = arr2[i];
        }

        //Insert new element at the beginning
        arr2[0] = element2;

        System.out.println("Array after insertion.");
        for(int i=0; i<arr2.length; i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
