// public class SimpleCalculator {
//     public static double add(int a, int b) {

//         return a + b;
//     }

//     public static double subtract(int a, int b) {
//         return a - b;
// }
//     public static double Multiplication(int a, int b ){
//         return a*b;
//     }

//     public static double Division(int a, int b){
//         return  a/ b;

//     }
//     public static void main (String [] args){
//        int num1 = 30 ;
//        int  num2 = 3;
//         System.out.println(" Addition : "+ add(num1,num2));
//         System.out.println(" Subtraction : " + subtract(num1,num2));
//         System.out.println("Multiplication : " + Multiplication(num1,num2));
//         System.out.println("Division : " + Division(num1,num2));
//     }

// }



import java.util.Scanner;

public class SimpleCalculator {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static double division(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return 0;
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept user input
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Perform operations
        System.out.println("Addition : " + add(num1, num2));
        System.out.println("Subtraction : " + subtract(num1, num2));
        System.out.println("Multiplication : " + multiplication(num1, num2));
        System.out.println("Division : " + division(num1, num2));

    }
}
