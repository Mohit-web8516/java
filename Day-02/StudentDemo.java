class Student {
    // Attributes 
    String name;
    int rollNo;
    int age;
    String course;
//creating a method to display student details
    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
      
        Student s1 = new Student();

        s1.name = "Rahul";
        s1.rollNo = 101;
        s1.age = 20;
        s1.course = "Computer Science";

        s1.displayDetails();
    }
}
