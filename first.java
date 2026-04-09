// public class first {
//     public static void main(String[] args) {
//         System.out.println("hello! world");
//     }
// }


//Simple Calculator
import java.util.Scanner;

 public class first {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Sum : " + (a + b));
        System.out.println("Multiply :  "  + (a * b ));

        sc.close();
    }

}


