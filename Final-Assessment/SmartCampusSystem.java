import java.util.*;

// Custom Exception
class InvalidInputException extends Exception {
    public InvalidInputException(String msg) {
        super(msg);
    }
}

// Student Class
class Student {
    int id;
    String fullName;
    String email;

    Student(int id, String fullName, String email) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + fullName + ", Email: " + email;
    }
}

// Course Class
class Course {
    int id;
    String title;
    double fee;

    Course(int id, String title, double fee) {
        this.id = id;
        this.title = title;
        this.fee = fee;
    }

    public String toString() {
        return "ID: " + id + ", Course: " + title + ", Fee: " + fee;
    }
}

// Enrollment Class
class Enrollment {
    Student student;
    Course course;

    Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    public String toString() {
        return student.fullName + " enrolled in " + course.title;
    }
}

// Thread for processing enrollment
class EnrollmentProcessor extends Thread {
    Enrollment enrollment;

    EnrollmentProcessor(Enrollment enrollment) {
        this.enrollment = enrollment;
    }

    public void run() {
        try {
            Thread.sleep(1500); // shorter delay
            System.out.println("✔ Enrollment processed: " + enrollment);
        } catch (InterruptedException e) {
            System.out.println("Error in processing enrollment.");
        }
    }
}

// Main Class
public class SmartCampusSystem {
    static HashMap<Integer, Student> studentMap = new HashMap<>();
    static HashMap<Integer, Course> courseMap = new HashMap<>();
    static ArrayList<Enrollment> enrollmentList = new ArrayList<>();

    // Add Student
    public static void addStudent(int id, String name, String email) throws InvalidInputException {
        if (studentMap.containsKey(id)) {
            throw new InvalidInputException("Student ID already exists!");
        }
        studentMap.put(id, new Student(id, name, email));
        System.out.println("✔ Student added.");
    }

    // Add Course
    public static void addCourse(int id, String title, double fee) throws InvalidInputException {
        if (courseMap.containsKey(id)) {
            throw new InvalidInputException("Course ID already exists!");
        }
        courseMap.put(id, new Course(id, title, fee));
        System.out.println("✔ Course added.");
    }

    // Enroll Student
    public static void enrollStudent(int sid, int cid) throws InvalidInputException {
        Student s = studentMap.get(sid);
        Course c = courseMap.get(cid);

        if (s == null)
            throw new InvalidInputException("Student not found!");
        if (c == null)
            throw new InvalidInputException("Course not found!");

        Enrollment e = new Enrollment(s, c);
        enrollmentList.add(e);
        System.out.println("Enrollment submitted...");

        EnrollmentProcessor processor = new EnrollmentProcessor(e);
        processor.start();
    }

    // View Students
    public static void viewStudents() {
        if (studentMap.isEmpty()) {
            System.out.println("No students available.");
        } else {
            for (Student s : studentMap.values()) {
                System.out.println(s);
            }
        }
    }

    // View Enrollments
    public static void viewEnrollments() {
        if (enrollmentList.isEmpty()) {
            System.out.println("No enrollments yet.");
        } else {
            for (Enrollment e : enrollmentList) {
                System.out.println(e);
            }
        }
    }

    // Unique Feature: Search Student by Name
    public static void searchStudentByName(String name) {
        boolean found = false;
        for (Student s : studentMap.values()) {
            if (s.fullName.equalsIgnoreCase(name)) {
                System.out.println("Found: " + s);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No student found with name: " + name);
        }
    }

    // Main Menu
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("\n--- SmartCampus Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. Add Course");
            System.out.println("3. Enroll Student");
            System.out.println("4. View Students");
            System.out.println("5. View Enrollments");
            System.out.println("6. Search Student by Name");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");

            try {
                choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter Student ID: ");
                        int sid = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Name: ");
                        String sname = sc.nextLine();
                        System.out.print("Enter Email: ");
                        String semail = sc.nextLine();
                        addStudent(sid, sname, semail);
                        break;

                    case 2:
                        System.out.print("Enter Course ID: ");
                        int cid = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Course Title: ");
                        String cname = sc.nextLine();
                        System.out.print("Enter Fee: ");
                        double fee = sc.nextDouble();
                        addCourse(cid, cname, fee);
                        break;

                    case 3:
                        System.out.print("Enter Student ID: ");
                        int esid = sc.nextInt();
                        System.out.print("Enter Course ID: ");
                        int ecid = sc.nextInt();
                        enrollStudent(esid, ecid);
                        break;

                    case 4:
                        viewStudents();
                        break;

                    case 5:
                        viewEnrollments();
                        break;

                    case 6:
                        System.out.print("Enter Student Name: ");
                        String searchName = sc.nextLine();
                        searchStudentByName(searchName);
                        break;

                    case 7:
                        System.out.println("Exiting...");
                        break;

                    default:
                        throw new InvalidInputException("Invalid choice!");
                }
            } catch (InvalidInputException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Error: Wrong input type.");
                sc.nextLine(); // clear buffer
            }
        } while (choice != 7);

        sc.close();
    }
}
