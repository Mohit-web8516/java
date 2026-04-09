
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
 import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many terms: ");
        int n = sc.nextInt();

        int a = 0, b = 1;
        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }

        sc.close();
    }
}
