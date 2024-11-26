public class Lec_4 {

    // public static void recursionUsingTwoPointers(int n, int[] arr, int l, int r){
    //     if (l>=n/2) {
    //         return;
    //     }

    //     int temp = arr[l];
    //     arr[l] = arr[r];
    //     arr[r] = temp;

    //     recursionUsingTwoPointers(n, arr, l+1, r-1);
    // }

    public static void recursionUsingTwoPointers(int[] arr, int i, int n){
        if (i>=n/2) {
            return;
        }

        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;

        recursionUsingTwoPointers(arr, i+1, n);
    }

    public static boolean checkPalindrome(String str, int i){
        if (i>=str.length()/2) {
            return true;
        }

        //It does an ASCII check
        if (str.charAt(i) != str.charAt(str.length()-i-1)) {
            return false;
        }
        return checkPalindrome(str, i+1);
    }

    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // int arr[] = {2, 4, 3, 2, 1};
        // int n = arr.length;

        //Recursion using two pointers
        // recursionUsingTwoPointers(5, arr, 0, n-1);

        //Recursion using single pointer
        // recursionUsingTwoPointers(arr, 0, n);

        //Check if the given string is palindrome or not.

        String str = "madam";
        System.out.println(checkPalindrome(str, 0));

        // printArray(arr);
    }
}
