import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

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

public class StudentFileHandler {
    public static void main(String[] args) {
        // CREATE A SRTUDENT OBJECT
        Student s1 = new Student(1, "Aarti");

        try {
            FileWriter fw = new FileWriter("student.txt");
            fw.write("Id: " + s1.id + "\n");
            fw.write("Name: " + s1.name);
            fw.close();

            System.out.println("Data written to file successfully.");
            BufferedReader br = new BufferedReader(new FileReader("student.txt"));
            String line;
            System.out.println("Student Details:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }


        } catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}
//write a program to create a student object and write the details of student in a file and read the details from file and display on console.


