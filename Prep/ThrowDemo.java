// public class prep{
//     public static void main(String[] args) {
//         int a = 20;
//         System.out.println(a);
//     }
// }

/*cd JAVA,cd Prep,javac prep.java,java prep */

// import java.util.LinkedList;
// public class LinkedListDemo {
// public static void main(String[] args) {
// LinkedList<String> strings = new LinkedList<>();
// System.out.println("");
// System.out.println(strings);
// System.out.println("Element Added: Second");
// strings.add("Second");
// System.out.println("Linked List: " + strings);
// System.out.println("First Element Added: First");
// strings.addFirst("First");
// System.out.println("Linked List: " + strings);
// System.out.println("Last Element Added: Third");
// strings.addLast("Third");
// System.out.println("Linked List: " + strings);
// System.out.println("Element Offered: Fourth");
// strings.offer("Fourth");
// System.out.println("Linked List: " + strings);
// ample:
// System.out.println("");
// System.out.println("First Element: " + strings.getFirst());
// System.out.println("Last Element: " + strings.getLast());
// System.out.println("Element at the front (element()): " +strings.element());
// System.out.println("Element at the front: (peek()): " + strings.peek());
// System.out.println("");
// System.out.println("Linked List: " + strings);
// System.out.println("Element removed (remove()): " + strings.remove());
// System.out.println("Linked List: " + strings);
// System.out.println("First Element removed: " + strings.removeFirst());
// System.out.println("Linked List: " + strings);
// System.out.println("Last Element removed: " + strings.removeLast());
// System.out.println("Linked List: " + strings);
// System.out.println("Element removed (poll()): " + strings.remove());
// System.out.println("Linked List: " + strings);
// }
// }

///////////////////////////////
// public class LinkedLISTDEOMO{
//     public static void main(String[] args) {
//       int a = 10;
//       int b = 0;
//       int result = 0;
//       try {
//           result = a / b;
//           System.out.println("Step 1");
//           System.out.println("Step 2");
//       } catch (Exception e) {
//           System.out.println("Error handled");
//       } finally {
//           System.out.println("Finally block");
//       }
//       System.out.println("End");

//     }
// }

////////////////////////////
// public class TryCatchFinallyDemo {
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 0;

//         try {
//             System.out.println("Inside try block");
//             int result = a / b; // exception occurs
//             System.out.println("This line will not execute");
//         } 
//         catch (ArithmeticException e) {
//             System.out.println("Exception handled: Division by zero");
//         } 
//         finally{
//             System.out.println("wahoooooo");
//         }
//     }}
/*---------------------------------------------- */
// public class ThrowDemo {
//     public static void main(String[] args) {
//         int age = 15;

//         if (age < 18) {
//             throw new ArithmeticException("Not eligible to vote");
//         }

//         // System.out.println("Eligible");
//     }
// }

class ThrowDemo {
    void method1() {
        method2();
        System.out.println("Method 1 ends");
    }

    void method2() {
        method3();
        System.out.println("Method 2 ends");
    }

    void method3() {
        System.out.println("Method 3 executing");
    }

    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.method1();
    }
}