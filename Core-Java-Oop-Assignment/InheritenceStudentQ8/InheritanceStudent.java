/*As an admin, I want to distinguish between general students and college students so that I can reuse common student details. */


   // Parent class
class Student {
    int rollNo;
    String name;

    Student(int r, String n) {
        rollNo = r;
        name = n;
    }
    //Display Method
    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
}

// Child class
class CollegeStudent extends Student {
    String collegeName;

    CollegeStudent(int r, String n, String cName) {
        super(r, n); // call parent constructor
        collegeName = cName;
    }

    void displayCollegeStudent() {
        display(); // reuse parent method
        System.out.println("College: " + collegeName);
    }
}

// Main class
public class InheritanceStudent {
    public static void main(String[] args) {
        CollegeStudent cs = new CollegeStudent(101, "Mohit", "GN College");
        cs.displayCollegeStudent();
    }
}
 
