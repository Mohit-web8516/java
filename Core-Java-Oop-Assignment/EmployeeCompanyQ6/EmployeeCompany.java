/*As an admin, I want to use the same institute/company name for all employees so that it is shared across all objects. */

  
//creating class 
class Employee {
    int empId;
    String empName;
    double salary;

    // Static variable shared by all objects
    static String companyName = "ABC Institute";

    Employee(int id, String name, double sal) {
        empId = id;
        empName = name;
        salary = sal;
    }
    //creating Method to display values 
    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Salary: " + salary);
        System.out.println("Company: " + companyName);
        System.out.println("===========");
    }
}

public class EmployeeCompany {
    public static void main(String[] args) {
        //creating object
        Employee e1 = new Employee(101, "Mohit", 50000);
        Employee e2 = new Employee(102, "Rahul", 45000);


        //Display
        e1.display();
        e2.display();
    }
}

