import java.util.ArrayList;
import java.util.List;

public class Subset_sum_1 {

    public static void returnSumOfSubsets(int [] arr, List<Integer> ans, List<Integer> ds, int s, int i, int n){
        if (i == n) {
            ds.add(s);
            return;
        }

        returnSumOfSubsets(arr, ans, ds, s+arr[i], i+1, n);

        returnSumOfSubsets(arr, ans, ds, s, i+1, n);
    }

    public static List<Integer> functionCall(int[] arr, List<Integer> ds){
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        returnSumOfSubsets(arr, ans, ds, 0, 0, n);
        return ds;
    }

    public static void main(String[] args) {
        int arr[] = {3, 1, 2};
        List<Integer> ds = new ArrayList<>();
        functionCall(arr, ds);
        for(Integer it: ds){
            System.out.print(it+" ");
        }
        System.out.println();
    }    
}
