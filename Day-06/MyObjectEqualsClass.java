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
// //         System.out.print("Enter a number: ");
// //         int number = scanner.nextInt();

// //         if (number > 0) {
// //             System.out.println("The number is positive.");
// //         } else if (number < 0) {
// //             System.out.println("The number is negative.");
// //         } else {
// //             System.out.println("The number is zero.");
// //         }

// //         scanner.close();
// //     }
// // }

// /////////////////////////////////////////////////
// /// if-else statement, for loop, while loop, do-while loop in java
// import java.util.Scanner;
// public class cond {     
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int number = scanner.nextInt();

//         // If-Else Statement
//          if (number > 0) {
//              System.out.println("The number is positive.");
//          } else if (number < 0) {
//              System.out.println("The number is negative.");
//          } else {
//              System.out.println("The number is zero.");
//          }

//         // For Loop
//         System.out.println("For Loop:");
//         for (int i = 0; i < 5; i++) {
//             System.out.println("Iteration: " + i);
//         }

//         // While Loop
//         System.out.println("While Loop:");
//         int count = 0;
//         while (count < 5) {
//             System.out.println("Count: " + count);
//             count++;
//         }

//         // Do-While Loop
//         System.out.println("Do-While Loop:");
//         int doCount = 0;
//         do {
//             System.out.println("Do Count: " + doCount);
//             doCount++;
//         } while (doCount < 5);

//         scanner.close();
//     }
// }
///////////////////////////////////////////////
//COSMIC CLASS
// COSMIC CLASS
public class MyObjectEqualsClass {
    public static void main (String[] args) {
        String name = "Joe";   // local variable 'name' initialized with "Joe"

        // Using equals() method to compare string content
        if ("Joe".equals(name)) {
            name += "Smith";   // if true, append "Smith" → now name = "JoeSmith"
        }

        System.out.println(name); // prints "JoeSmith"

        name = "JOHN";            // reassigns name to "JOHN"
        System.out.println(name); // prints "JOHN"
    }
}
