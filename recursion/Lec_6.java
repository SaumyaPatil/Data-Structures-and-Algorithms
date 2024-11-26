import java.util.ArrayList;
import java.util.List;

public class Lec_6 {

    public static void printSubsequences(int[] arr, List<Integer> ds, int ind){
        if(ind == arr.length){
            for(Integer it: ds){
                System.out.print(it + " ");
            }
            System.out.println();
            return;
        }

        ds.add(arr[ind]);
        printSubsequences(arr, ds, ind+1);
        ds.remove(ds.size()-1);
        printSubsequences(arr, ds, ind+1);
    }

    public static void main(String[] args){
        int arr[] = {3, 1, 2};
        List<Integer> ds = new ArrayList<>();
        printSubsequences(arr, ds, 0);
    }
}
