
//hello world program in java
// public class world {
//     public static void main(String[] args) {
//         System.out.println("Hello, World!");
//     }
// }

//hello world program in java with user input
// import java.util.Scanner;

// public class world {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter your name: ");
//         String name = scanner.nextLine();
//         System.out.println("Hello, " + name + "!");
//     }
// }

//Operators in java
// public class world {
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 5;

//         // Arithmetic Operators
//         System.out.println("Addition: " + (a + b)); // 15
//         System.out.println("Subtraction: " + (a - b)); // 5
//         System.out.println("Multiplication: " + (a * b)); // 50
//         System.out.println("Division: " + (a / b)); // 2
//         System.out.println("Modulus: " + (a % b)); // 0

//         // Relational Operators
//         System.out.println("Is a equal to b? " + (a == b)); // false
//         System.out.println("Is a not equal to b? " + (a != b)); // true
//         System.out.println("Is a greater than b? " + (a > b)); // true
//         System.out.println("Is a less than b? " + (a < b)); // false

//         // Logical Operators
//         boolean x = true;
//         boolean y = false;
//         System.out.println("x AND y: " + (x && y)); // false
//         System.out.println("x OR y: " + (x || y)); // true
//         System.out.println("NOT x: " + (!x)); // false
//     }
// }   

////////////////////////////////////////////
//Data types in java
// public class world {
//     public static void main(String[] args) {
//         // Primitive Data Types
//         int myInt = 10; // Integer
//         double myDouble = 3.14; // Floating-point number
//         char myChar = 'A'; // Character
//         boolean myBoolean = true; // Boolean

//         // Non-Primitive Data Types
//         String myString = "Hello, World!"; // String

//         // Output the values
//         System.out.println("Integer: " + myInt);
//         System.out.println("Double: " + myDouble);
//         System.out.println("Character: " + myChar);
//         System.out.println("Boolean: " + myBoolean);
//         System.out.println("String: " + myString);
//     }
// }
////////////////////////////////////////////////
///Control Structures in Java
// public class world {
//     public static void main(String[] args) {
//         int number = 10;

//         // If-Else Statement
//         if (number > 0) {
//             System.out.println("The number is positive.");
//         } else if (number < 0) {
//             System.out.println("The number is negative.");
//         } else {
//             System.out.println("The number is zero.");
//         }

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
//     }
// }

///////////////////////////////////////////////
//For loop in java
// public class world {
//     public static void main(String[] args) {
//         // For Loop
//         System.out.println("For Loop:");
//         for (int i = 0; i < 5; i++) {
//             System.out.println("Iteration: " + i);
//         }
//     }
// }

///////////////////////////////////////////////
///While loop in java
// public class world {
//     public static void main(String[] args) {
//         // While Loop
//         System.out.println("While Loop:");
//         int count = 0;
//         while (count < 5) {
//             System.out.println("Count: " + count);
//             count++;
//         }
//     }
// }
/////////////////////////////////////////////////
//Do-While loop in java
// public class world {
//     public static void main(String[] args) {
//         // Do-While Loop
//         System.out.println("Do-While Loop:");
//         int doCount = 0;
//         do {
//             System.out.println("Do Count: " + doCount);
//             doCount++;
//         } while (doCount < 5);
//     }
// }   
/////////////////////////////////////////////////////////
/// Switch case in java
// public class world {
//     public static void main(String[] args) {
//         int day = 3;
//         String dayName;

//         switch (day) {
//             case 1:
//                 dayName = "Monday";
//                 break;
//             case 2:
//                 dayName = "Tuesday";
//                 break;
//             case 3:
//                 dayName = "Wednesday";
//                 break;
//             case 4:
//                 dayName = "Thursday";
//                 break;
//             case 5:
//                 dayName = "Friday";
//                 break;
//             case 6:
//                 dayName = "Saturday";
//                 break;
//             case 7:
//                 dayName = "Sunday";
//                 break;
//             default:
//                 dayName = "Invalid day";
//         }

//         System.out.println("The day is: " + dayName);
//     }
// }
////////////////////////////////////////////////////
///Nested loops in java
// public class world {
//     public static void main(String[] args) {
//         // Nested For Loop
//         System.out.println("Nested For Loop:");
//         for (int i = 1; i <= 3; i++) {
//             for (int j = 1; j <= 3; j++) {
//                 System.out.print(i + "," + j + " ");
//             }
//             System.out.println();
//         }
//     }
// }

//////////////////////////////////////////////////////
/// Break and continue in java
public class world {
    public static void main(String[] args) {
        // Break Statement
        System.out.println("Break Statement:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break; // Exit the loop when i is 3
            }
            System.out.println("i: " + i);
        }

        // Continue Statement
        System.out.println("Continue Statement:");
        for (int j = 1; j <= 5; j++) {
            if (j == 3) {
                continue; // Skip the rest of the loop when j is 3
            }
            System.out.println("j: " + j);
        }
    }
}