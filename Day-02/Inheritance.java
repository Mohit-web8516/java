
    // Parent class
class Person {
    String name ;
    int age ;

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Child class inheriting from Person
class Student extends Person {
    int rollNo;
    String course;

    void displayStudent() {
        // Reuse parent method
        displayPerson();
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Course: " + course);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        // Create child object
        Student s1 = new Student();

        // Assign values (inherited + own)
        s1.name = "Yash";
        s1.age = 20;
        s1.rollNo = 101;
        s1.course = "Computer Science";

        // Display details
        s1.displayStudent();
    }
}

