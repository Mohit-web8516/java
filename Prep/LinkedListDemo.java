// public class prep{
//     public static void main(String[] args) {
//         int a = 20;
//         System.out.println(a);
//     }
// }

/*cd JAVA,cd Prep,javac prep.java,java prep */

import java.util.LinkedList;
public class LinkedListDemo {
public static void main(String[] args) {
LinkedList<String> strings = new LinkedList<>();
System.out.println("");
System.out.println(strings);
System.out.println("Element Added: Second");
strings.add("Second");
System.out.println("Linked List: " + strings);
System.out.println("First Element Added: First");
strings.addFirst("First");
System.out.println("Linked List: " + strings);
System.out.println("Last Element Added: Third");
strings.addLast("Third");
System.out.println("Linked List: " + strings);
System.out.println("Element Offered: Fourth");
strings.offer("Fourth");
System.out.println("Linked List: " + strings);
ample:
System.out.println("");
System.out.println("First Element: " + strings.getFirst());
System.out.println("Last Element: " + strings.getLast());
System.out.println("Element at the front (element()): " +strings.element());
System.out.println("Element at the front: (peek()): " + strings.peek());
System.out.println("");
System.out.println("Linked List: " + strings);
System.out.println("Element removed (remove()): " + strings.remove());
System.out.println("Linked List: " + strings);
System.out.println("First Element removed: " + strings.removeFirst());
System.out.println("Linked List: " + strings);
System.out.println("Last Element removed: " + strings.removeLast());
System.out.println("Linked List: " + strings);
System.out.println("Element removed (poll()): " + strings.remove());
System.out.println("Linked List: " + strings);
}
}