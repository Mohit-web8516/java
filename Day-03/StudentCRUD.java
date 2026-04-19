import java.util.*;

class Student {
    private int id;
    private String name;
    private int marks;

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getMarks() { return marks; }

    @Override
    public String toString() {
        return "ID: " + id + " | Name: " + name + " | Marks: " + marks;
    }
}

public class StudentCRUD {
    private Map<Integer, Student> studentMap = new HashMap<>();

    public void addStudent(int id, String name, int marks) {
        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException("Marks must be between 0 and 100!");
        }
        studentMap.put(id, new Student(id, name, marks));
        System.out.println("Student added successfully!");
    }

    public void viewStudents() {
        if (studentMap.isEmpty()) {
            System.out.println("No records found!");
            return;
        }
        for (Student s : studentMap.values()) {
            System.out.println(s);
        }
    }

    public void deleteStudent(int id) {
        if (studentMap.remove(id) != null) {
            System.out.println("Student deleted successfully!");
        } else {
            System.out.println("Student not found!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentCRUD crud = new StudentCRUD();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Delete Student");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            try {
                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Marks: ");
                        int marks = sc.nextInt();
                        crud.addStudent(id, name, marks);
                        break;
                    case 2:
                        crud.viewStudents();
                        break;
                    case 3:
                        System.out.print("Enter ID to delete: ");
                        int delId = sc.nextInt();
                        crud.deleteStudent(delId);
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        sc.close();
                        return;
                    default:
                        System.out.println("Invalid choice!");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                sc.nextLine(); // clear buffer
            }
        }
    }
}
