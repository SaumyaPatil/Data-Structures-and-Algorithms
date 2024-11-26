public class Lec_2 {

    //Q. Print name 'n' times.
    public static void printNTimes(int i, int n){
        if (i>n) return;
        System.out.println("Saumya");
        i++;
        printNTimes(i, n);
    }

    //Q. Print linearly from 1 to N.
    public static void printLinear(int i, int n){
        if (i>n) return;
        System.out.println(i);
        i++;
        printLinear(i, n);
    }

    //Q. Print from N to 1.
    public static void printOppositeSequence(int i){
        if (i<1) {
            return;
        }
        System.out.println(i);
        printOppositeSequence(i-1);
    }

    public static void printLinearlyByBacktrack(int i){
        if (i==0) {
            return;
        }
        // i--;           //Ye likhke alag output kyu aa raha means ki 0 1 2 which is not expected.
        printLinearlyByBacktrack(i-1);
        System.out.println(i);
    }

    public static void printOppositeByBacktrack(int i, int n){
        if (i>n) {
            return;
        }

        printOppositeByBacktrack(i+1, n);
        System.out.println(i);
    }

    public static void main(String[] args) {
        int n=3;
        // printNTimes(1, n);

        // printLinear(1, n);

        // printOppositeSequence(n);

        // printLinearlyByBacktrack(n);

        printOppositeByBacktrack(1, n);
    }
}
