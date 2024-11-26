import java.util.ArrayList;
import java.util.List;

public class Lec_7 {

    public static void printSubsequencesWithGivenSum(int s, int sum, List<Integer> ds, int[] arr, int ind) {
        if (ind == arr.length) {
            if (s == sum) {
                for (Integer it : ds) {
                    System.out.print(it + " ");
                }
                System.out.println();
                // return;
            }
            return;
        }

        ds.add(arr[ind]);
        s = s + arr[ind];
        printSubsequencesWithGivenSum(s, sum, ds, arr, ind + 1);
        ds.remove(ds.size() - 1);
        s = s - arr[ind];
        printSubsequencesWithGivenSum(s, sum, ds, arr, ind + 1);

    }

    public static boolean printOneSubsequence(int ind, int[] arr, int sum, int s, List<Integer> ds) {
        if (ind == arr.length) {
            if (s == sum) {
                for (Integer it : ds) {
                    System.out.print(it + " ");
                }
                System.out.println();
                return true;
            }
            return false;
        }

        ds.add(arr[ind]);
        s = s + arr[ind];
        if (printOneSubsequence(ind + 1, arr, sum, s, ds) == true) {
            return true;
        }
        ds.remove(ds.size() - 1);
        s = s - arr[ind];
        if (printOneSubsequence(ind + 1, arr, sum, s, ds) == true) {
            return true;
        }
        return false;
    }

    public static int printCount(int ind, int[] arr, int sum, int s, List<Integer> ds) {
        if (ind == arr.length) {
            if (s == sum) {
                return 1;
            }
            else  return 0;
        }

        ds.add(arr[ind]);
        s = s + arr[ind];
        int l = printCount(ind + 1, arr, sum, s, ds);
        ds.remove(ds.size() - 1);
        s = s - arr[ind];
        int r = printCount(ind + 1, arr, sum, s, ds);
        return l+r;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 1 };
        int sum = 2;
        List<Integer> ds = new ArrayList<>();
        // printSubsequencesWithGivenSum(0, sum, ds, arr, 0);
        // printOneSubsequence(0, arr, sum, 0, ds);
        System.out.println(printCount(0, arr, sum, 0, ds));
    }
}
