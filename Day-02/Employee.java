public class Employee {

    int empId ;
    String empName;
    double salary ;

    Employee (int id, String name,double sal){
        empId = id;
        empName = name;
        salary = sal;

    }
    void displayEmployee(){
        
        System.out.println("Employee Details are : ");
        System.out.println("empId is : " + empId);
        System.out.println("empName : " + empName);
        System.out.println("salary  is : " +salary );
    }
    public static void  main (String[] args){
        Employee e1 = new Employee(201, "ROHIT", 45000);

        e1.displayEmployee();
    }
   
}
