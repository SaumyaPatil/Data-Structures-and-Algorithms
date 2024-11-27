import java.util.ArrayList;
import java.util.List;

public class Lec_8 {

    public static void mergeSort(int arr[], int low, int high){
        if(low==high)return;
        int mid = (high-low)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low, mid, high);
    }

    public static void merge(int arr[], int low, int mid, int high){
        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while (left <= low && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }
        while (left<=mid) {
            temp.add(arr[left]);
            left++;
        }

        while (right<=high) {
            temp.add(arr[right]);
            right++;
        }

        // for(int i=low; i<=high; i++){
        //     arr[i] = temp[i-low];
        // }
    }

    public static void main(String args[]){
        int arr[] = {2, 3, 1, 6, 3, 5, 7, 7};
        int n = arr.length;
        mergeSort(arr, 0, n-1);
    }
}
  
//When array gets divided by 2 everytime, the time complexity is log base 2 n, and merge function takes more n time complexity therefore total time complexity is n log base 2 n.
//Space complexity is O(N)
  