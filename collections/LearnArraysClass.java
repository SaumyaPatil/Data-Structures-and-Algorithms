import java.util.Arrays;

public class LearnArraysClass {
    public static void main(String[] args) {
        //It is used to perform manipulations on array 
        //To perform searching, sorting, to check if the two arrays are equal or not.

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int index = Arrays.binarySearch(numbers, 2);
        System.out.println("The index of element 4 in the array is " + index);

        Integer[] numbers2 = {32, 1, 2, 34, 52, 42};
        Arrays.sort(numbers2);     //Sorts using quick sort internally
 
        for(int i: numbers2){
            System.out.println(i + " ");
        }

        //Parallel sort divides array and gives it to multiple processors to fasten the operation 
        //It works only if the count of elements is more than 8192 otherwise it works on quicksort

        //Fills 21 all over the array
        Arrays.fill(numbers, 21);

        
    }
}
