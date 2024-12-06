import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        s.push("Lion");
        System.out.println(s.peek());        //Top most element
        System.out.println(s);

        s.pop();                            //Pops topmost element
        System.out.println(s);
    }
}
