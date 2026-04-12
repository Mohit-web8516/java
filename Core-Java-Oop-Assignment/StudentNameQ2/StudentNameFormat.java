/* As an admin, I want to format the student name so that I can display it in different formats.*/

public class StudentNameFormat {
    public static void main(String[] args) {
        // Student Name string
        String StudentName = "Rajkumar Singhaniya";

        // Print original name
        System.out.println("Original Name : " + StudentName);
        // Print name in uppercase
        System.out.println("UpperCase Name : " + StudentName.toUpperCase());
        // Print name in lowercase
        System.out.println("lowerCase  Name : " + StudentName.toLowerCase());
        // print the length of name
        System.out.println("length of  Name : " + StudentName.length());

    }
}
