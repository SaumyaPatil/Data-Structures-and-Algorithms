package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class deletion_beginning {
    public static void main(String[] args){

        //Built-in methods
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
        System.out.println("Array before deletion.");
        for(int i=0; i<arr.size(); i++){
            System.out.print(arr.get(i)+" ");
        }

        arr.remove(0);
        System.out.println("Array after deletion");
        for(int i=0; i<arr.size(); i++){
            System.out.print(arr.get(i)+" ");
        }


        //Custom methods
        int[] arr1 = {10, 20, 30, 40, 50};
        int n = arr1.length;
        System.out.println("Array before deletion");
        for(int i=0; i<n; i++){
            System.out.print(arr1[i]+" ");
        }

        for(int i=1; i<n; i++){
            arr1[i-1] = arr1[i];
        }

        n--;
        System.out.println("Array after deletion");
        for(int i=0; i<n; i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
    }
}
