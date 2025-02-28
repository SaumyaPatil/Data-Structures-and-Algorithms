package stacks;

import java.util.Stack;

public class stacks_using_array {

    //Init array and treat its end as stack's top
    
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX];

    stacks_using_array(){
        top = -1;
    }

    boolean isEmpty(){
        return (top<0);
    }
    
    boolean push(int x){
        if(top >= (MAX-1)){
            return false;
        }
        else{
            a[++top] = x;
            return true;
        }
    }

    int pop(){
        if(top<0)return 0;
        else{
            int x = a[top--];
            return x;
        }
    }
    //Just returns the top po
    int peek(){
        if(top<0)return 0;
        else{
            int x = a[top];
            return x;
        }
    }

    void print(){
        for(int i=top; i>-1; i++){
            System.out.print(" " + a[i]);
        }
    }

    public static void main(String[] args){
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        System.out.println(s.pop());
        System.out.println(s.peek());
    }
}
