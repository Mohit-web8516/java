
/*
As an admin, I want to initialize employee/trainer details directly so that I can avoid assigning values manually.
*/

//creating class 
class Employee {
    int empId;
    String empName;
    double salary;
//passing parameters
    Employee(int id, String name, double sal) {
        empId = id;
        empName = name;
        salary = sal;
    }

    //Method TO DISPLAY DETAILS
    void display() {
        System.out.println("Employee Id : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Salary: " + salary);

    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Employee e1 = new Employee(101,"Samarth", 500000);

        //Display details 
        e1.display();
    }

}
