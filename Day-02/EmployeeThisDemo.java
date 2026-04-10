public class EmployeeThisDemo {
    //Instance variables 
     int empId ;
    String empName;

//
    EmployeeThisDemo(int empId,String empName){

    //
        this.empId = empId;
        this.empName = empName;
    }
//Display Method
    void display(){
        System.out.println("Employee ID : " +empId);
        System.out.println("Employee Name  : " +empName);
        
    }
    public static void main (String[] args){
        //Create object 
        EmployeeThisDemo e1 = new EmployeeThisDemo(300, "Samarth" );

        //Display Value
        e1.display();
    }
    
}
