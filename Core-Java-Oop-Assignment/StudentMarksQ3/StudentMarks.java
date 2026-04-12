

public class StudentMarks {

    public static void main(String[] args) {
        // Step 1: Create an array of 5 marks
        int[] marks = {34,56,78,99,78};

        
       
        // Step 3: Print marks one by one using for loop
        System.out.println("Marks of 5 students:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Marks of Student  " + (i+1) + " is : " + marks[i]);
        }
    }
}


