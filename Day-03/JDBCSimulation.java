import java.util.*;

class Course {
    private int id;
    private String name;

    public Course(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Course ID: " + id + " | Name: " + name;
    }
}

class CourseDB {
    private List<Course> courses = new ArrayList<>();

    public void insertCourse(int id, String name) {
        courses.add(new Course(id, name));
        System.out.println("Course inserted successfully!");
    }

    public void displayCourses() {
        if (courses.isEmpty()) {
            throw new RuntimeException("No courses available!");
        }
        for (Course c : courses) {
            System.out.println(c);
        }
    }
}

class DBThread extends Thread {
    private CourseDB db;

    public DBThread(CourseDB db) {
        this.db = db;
    }

    @Override
    public void run() {
        try {
            System.out.println("\n--- Displaying Courses in Thread ---");
            db.displayCourses();
        } catch (RuntimeException e) {
            System.out.println("Thread Error: " + e.getMessage());
        }
    }
}

public class JDBCSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CourseDB db = new CourseDB();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Insert Course");
            System.out.println("2. Display Courses");
            System.out.println("3. Display Courses (Thread)");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            try {
                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter Course ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Course Name: ");
                        String name = sc.nextLine();
                        db.insertCourse(id, name);
                        break;
                    case 2:
                        db.displayCourses();
                        break;
                    case 3:
                        DBThread t = new DBThread(db);
                        t.start();
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
                sc.nextLine();
            }
        }
    }
}

