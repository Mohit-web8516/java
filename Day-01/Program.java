
// //Odd and Even
// import java.util.Scanner;

// public class Program {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();

//         if (num % 2 == 0) {
//             System.out.println(num + "  is Even Number");
//         } else {
//             System.out.println(num + " is Odd Number");
//         }

//         sc.close();
//     }
// }


////////////////////////////////////////////////////
//Factorial number

// import java.util.Scanner;

// public class Program{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();
//         long fact = 1;

//         for (int i = 1; i <= num; i++) {
//             fact *= i;   // multiply fact by i
//         }

//         System.out.println("Factorial of " + num + " is: " + fact);
//         sc.close();
//     }
// }


//////////////////////////////////////////
// / Palindrome number
// import java.util.Scanner;

// public class Program {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter your word: ");
//         String str = sc.nextLine();

//         String reversed = new StringBuilder(str).reverse().toString();

//         if (str.equalsIgnoreCase(reversed)) {
//             System.out.println(str + " is a Palindrome");
//         } else {
//             System.out.println(str + " is not a Palindrome");
//         }

//         sc.close();
//     }
// }

///////////////////////////////////////////////////////////////
/// fibonacci series
//  import java.util.Scanner;

// public class Program {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter your terms: ");
//         int n = sc.nextInt();

//         int a = 0, b = 1;
//         System.out.print("Fibonacci Series:");

//         for (int i = 1; i <= n; i++) {
//             System.out.print( a +  " "  + "\n");
//             int sumOfPrevTwo = a + b;
//             a = b;
//             b = sumOfPrevTwo;
//         }
//         sc.close();
//     }
// }
/////////////////////////////////////////////
/// PRIME NUMBER
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false; // 0 and 1 are not prime
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a Prime number");
        } else {
            System.out.println(num + " is NOT a Prime number");
        }

        sc.close();
    }
}
