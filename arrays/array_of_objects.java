package arrays;


public class array_of_objects {
    public static void main(String[] args){
        //Array of objects in java
        //ObjectType[] arrName;
        //ObjectType arrName[];

        Student[] arr;
        arr = new Student[5];
        arr[0] = new Student(1, "Aman");
        arr[1] = new Student(2, "Vaibhav");
        arr[2] = new Student(3, "Shikhar");
        arr[3] = new Student(4, "Dharmesh");
        arr[4] = new Student(5, "Mohit");

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i].roll_no + " " + arr[i].name);
        }

        System.out.println();
    }
}
