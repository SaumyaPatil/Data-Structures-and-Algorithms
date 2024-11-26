public class Lec_5 {

    public static int printNthFibonacci(int n){
        if (n==0 || n==1) {
            return 1;
        }

        return printNthFibonacci(n-1) + printNthFibonacci(n-2);
    }

    public static void main(String[] args) {
        int n=5;
        System.out.println(printNthFibonacci(n));
    }    
}
