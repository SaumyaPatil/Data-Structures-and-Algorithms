package arrays;

public class arrays {
    public static void main(String[] args){
        //Declaring array
        int[] arrayName; 
        
        //Create an array - Default value  of each element is 0
        int[] numbers = new int[5];

        //accessing an element of an array
        numbers[0] = 20;
        int firstElement = numbers[0];

        //length of array
        int length = numbers.length;

        //Static memory allocation - Before the program executes, we can allocate memory to variables.

        //Dynamic memory allocation - When input isnt known before hand. 
        //The mechanism by which storage/memory/cells can be allocated to variables during runtime is called dynamic memory allocation
        //Advantages - 
        //1. When memory space beforehand isnt known
        //2. When you wanna use memory efficiently.
        //3. Insertions and deletions can be done easily.
        
        //Static memory allocation can only be done on stack while dynamic memory allocation can be done on both.
        //Ex. of dynamic memory allocation on stack is recursion where during runtime the function calls are pushed into the stack and are popped one by one in reverse order.

        //While allocationg memory on heap, we delete the memory manually as memory is not freed by the compiler itself even if the scope of allocated memory finishes.
        
        //primitives - int, char, etc. and object references of a class

        //declaring an array - declaring the reference
        // int intArray[];

        //allocating memory to array - allocating space 
        // intArray = new int[20];

        //combining both statements in one
        // int[] intArray2 = new int[20];

        //Elements in array allocated by new will automatically be initialsed to 0

        //array literal - used when size and variables of array are already known
        int[] intArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
    }
}
