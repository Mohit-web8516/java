// Step 1: Define the Student class
class Student {
    // attributes
    int rollNo;
    String name;
    int marks;

    //  display the student details
    void displayDetails() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}
public class StudentDetails {
    public static void main(String[] args) {
        // Create Student object
        Student s1 = new Student();

        // Assign values 
        s1.rollNo = 101;
        s1.name = "Parth";
        s1.marks = 99;

        // Call method to display details
        s1.displayDetails();
    }
}
