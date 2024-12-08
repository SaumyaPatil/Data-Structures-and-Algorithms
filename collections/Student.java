import java.util.Objects;

public class Student implements Comparable<Student>{
    String name;
    int rollNo;

    public Student(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    //This method is invoked when set is passed inside the console.log statement
    @Override
    public String toString() {
        return super.toString();
    }

    //This method is used when a customised class is implementing set

    //We use equals and hashcode methods to compare on basis of roll no here.
    @Override
    public boolean equals(Object obj) {
        if (this==obj) {
            return true;
        }
        if (obj==null || getClass()!=obj.getClass()) {
            return false;
        }

        Student student = (Student) obj;
        return rollNo == student.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }

    //If current student is greater than that student then you get a positive value otherwise you get a negative value.
    // @Override
    // public int compareTo(Student that) {
    //     return this.rollNo - that.rollNo;
    // }

    //name is string type and it has already implemented compareto function
    @Override
    public int compareTo(Student that) {
        return this.name.compareTo(that.name);
    }

}
