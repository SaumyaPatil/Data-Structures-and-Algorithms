import java.util.ArrayList;
import java.util.List;

public class Combination_sum_1 {

    public static void findCombinations(int ind, int[] arr, int target, List<Integer> ds, List<List<Integer>> ans){
        if (ind == arr.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        if(arr[ind]<=target){
            ds.add(arr[ind]);
            findCombinations(ind, arr, target-arr[ind], ds, ans);
            ds.remove(ds.size()-1);
        }
        findCombinations(ind+1, arr, target, ds, ans);
    }

    public static List<List<Integer>> combinationSum(int[] arr, int target){
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(0, arr, target, new ArrayList<>(), ans);
        return ans;
    }

    public static void main(String args[]){
        int arr[] = {2, 3, 6, 7};
        int target = 7;
        combinationSum(arr, target);
    }
}
