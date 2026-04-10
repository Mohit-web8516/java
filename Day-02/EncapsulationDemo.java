class Student {
    // Private variable
    private String name;

    // Getter method
    public String getName() {
        return name;
    }

    // Setter method
    public void setName(String name) {
        this.name = name;
    }
}

public class EncapsulationDemo{
    public static void main(String[] args) {
        // Create object
        Student s1 = new Student();

        // Set value using setter
        s1.setName("Viraj");

        // Get value using getter
        System.out.println("Student Name: " + s1.getName());
    }
}
