/*As an admin, I want to store marks of 5 students so that I can display them one by one. */

public class StudentMarks {

    public static void main(String[] args) {
        // Create an array of 5 marks
        int[] marks = {34,56,78,99,78};
  
        System.out.println("Marks of 5 students:");
        //use loop for printing all the marks
        for (int i = 0; i < marks.length; i++) {

            //DISPLAY THE FINAL OUTPUT
            System.out.println("Marks of Student  " + (i+1) + " is : " + marks[i]);
        }
    }
}


