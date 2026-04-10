import java.util.Scanner;

public class StudentStringDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept student name
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
         
        //METHOD 1

        // System.out.println("Original Name : " + name  +  " , length of name : "  + name.length() + " ,uppercase : " + name.toUpperCase()+ " ,lowercase : " + name.toLowerCase());



       // METHOD :2
        System.out.println("Original Name : " + name + ", length of name : " + name.length() + ", uppercase : " + name.toUpperCase() + ", lowercase : " + name.toLowerCase());



        
        
        // METHOD : 3
        
        // System.out.println("Original Name: " + name);

        // System.out.println("Length of Name: " + name.length());

        // System.out.println("Uppercase: " + name.toUpperCase());

        // System.out.println("Lowercase: " + name.toLowerCase());
    }
}
