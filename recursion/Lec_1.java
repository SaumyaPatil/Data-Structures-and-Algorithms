public class Lec_1 {

    static int count = 0;

    public static void printSequence(int count){
        if (count == 3) return;

        System.out.println(count);
        count++;
        printSequence(count);        //Why cant we directly do count++ here itself? difference between count++ and ++count
    }

    public static void main(String[] args) {
        printSequence(count);
    }
}
