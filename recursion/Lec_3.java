public class Lec_3 {

    public static void sumOfFirstNNumbers(int sum, int i){
        if (i<1) {
            System.out.println(sum);
            return;
        }

        sumOfFirstNNumbers(sum+i, i-1);

    }

    public static int sumOfFirstNNumbersByFunctionalWay(int n){
        if (n==0) {
            return 0;
        }

        return n + sumOfFirstNNumbersByFunctionalWay(n-1);
    }

    public static int printFact(int n){
        if (n==1) {
            return 1;
        }

        return n*printFact(n-1);
    }

    public static void main(String[] args) {
        int n=3;

        //Parameterised way
        // sumOfFirstNNumbers(0, 3);

        //Functional way
        // System.out.println(sumOfFirstNNumbersByFunctionalWay(n));

        //Factorial of 'n'
        System.out.println(printFact(n));
    }
}

