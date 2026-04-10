class Employee {
    // Instance variables
    String name;
    int id;
    double salary;

    // Static variable shared by all employees
    static String companyName = "Tech Solutions ";

    // Constructor
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Company: " + companyName);
        System.out.println("==============================");
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        // Create employee objects
        Employee e1 = new Employee("Raunak", 101, 50000);
        Employee e2 = new Employee("Riya", 102, 60000);
        Employee e3 = new Employee("Aman", 103, 55000);

        // Display details
        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();

        // Change company name (affects all employees)
        Employee.companyName = "Global Tech Company";

        System.out.println("After changing company name:");
        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
    }
}
