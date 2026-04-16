//break and continue statements

// import java.util.Scanner;
// public class cond {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int number = scanner.nextInt();

//         // Using break statement
//         System.out.println("Using break statement:");
//         for (int i = 1; i <= 10; i++) {
//             if (i == number) {
//                 System.out.println("Number found! Breaking the loop.");
//                 break; // Exit the loop when the number is found
//             }
//             System.out.println(i);
//         }

//         // Using continue statement
//         System.out.println("\nUsing continue statement:");
//         for (int i = 1; i <= 10; i++) {
//             if (i == number) {
//                 System.out.println("Skipping the number: " + number);
//                 continue; // Skip the current iteration when the number is found
//             }
//             System.out.println(i);
//         }

//         scanner.close();
//     }
// }

/////////////////////////////////////////////////////////
/// if-else statement in java
// import java.util.Scanner;
// public class cond {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int number = scanner.nextInt();

//         if (number > 0) {
//             System.out.println("The number is positive.");
//         } else if (number < 0) {
//             System.out.println("The number is negative.");
//         } else {
//             System.out.println("The number is zero.");
//         }

//         scanner.close();
//     }
// }