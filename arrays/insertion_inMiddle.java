package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class insertion_inMiddle {
    public static void main(String[] args){
        //Using built-in methods
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
        int ele = 50;
        int pos = 2;
        System.out.println("Array before insertion");
        for(int i=0; i<arr.size(); i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();

        //Insert element at the given position
        arr.add(pos-1, ele);

        System.out.println("Array after insertion");
        for(int i=0; i<arr.size(); i++){
            System.out.print(arr.get(i)+" ");
        }

        System.out.println();


        //Using custom method
        int n = 4;
        int[] arr1 = {10, 20, 30, 40, 0};
        int ele1 = 50;
        int pos1 = 2;
        System.out.println("Array before insertion");
        for(int i=0; i<n; i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();

        //Shifting elements to right
        for(int i=n; i>=pos1; i--){
            arr1[i] = arr1[i-1];
        }

        //insert new element at index pos1-1
        arr1[pos1-1] = ele1;

        System.out.println("Array after insertion");
        for(int i=0; i<=n; i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
    }
}
