import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Combination_sum_2 {
    public static void findCombinations(int ind, int[] arr, int target, Set<List<Integer>> ans, List<Integer> ds){
        if(ind == arr.length){
            if (target == 0) {
                //push the data structure into the set
                ans.add(new ArrayList<>());
            }
            return;
        }
        if (arr[ind]<=target) {
            ds.add(arr[ind]);
            findCombinations(ind+1, arr, target-arr[ind], ans, ds);
            ds.remove(ds.size()-1);
        }
        findCombinations(ind+1, arr, target, ans, ds);
    }

    public static Set<List<Integer>> combinationSum(int[] arr, int target){
        Set<List<Integer>> ans = new HashSet<>();
        findCombinations(0, arr, target, ans, new ArrayList<>());
        return ans;
    }

    public static void main(String args[]){
        int arr[] = {10, 1, 2, 7, 6, 1, 5};
        Arrays.sort(arr);   
        int target = 8;
        combinationSum(arr, target);
    }
}
