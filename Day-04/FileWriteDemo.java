import java.io.FileWriter;
import java.io.IOException;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;

    }

    void Display() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
    }
}

public class FileWriteDemo {
    public static void main(String[] args) {
        // CREATE A SRTUDENT OBJECT
        Student s1 = new Student(1, "Aarti");

        try {
            FileWriter fw = new FileWriter("student.txt");
            fw.write("Id: " + s1.id + "\n");
            fw.write("Name: " + s1.name);
            fw.close();

            System.out.println("Data written to file successfully.");

        } catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}
