// public class variable {
//     public static void main(String[] args) {
//         int a = 23;
//         int b = 45;
//         int c = 46;
//         if(a > b && a>c ){
//             System.out.println("dolllyyyyyyy");
//         }
//         else if (b > a && b > c) {
//             System.out.println("MAY BE !!!");
//         } else {

//             System.out.println(c + " hamba damba khamba!!!!!!!!");
//         }
//     }
// }

/////////////////////////////////////
// public class variable{
//     public static void main(String[] args) {

//         int n=1;
//         do
//         {
//         System.out.println(n);
//         n++;
//         } while(n<=10);
//     }
// }

//////////////////////////////////////
// class Student {
//     int id;
//     String name;
//     String clg;

//     void display() {
//         System.out.println(id);
//         System.out.println(name);
//         System.out.println(clg);
//     }
// }
// public class Main {
//     public static void main(String[] args) {

//         Student s1 = new Student();
//         Student s2 = new Student();

//         s1.id = 1;
//         s1.name = "Rahul";
//         s1.clg = "gn";

//         s2.id = 2;
//         s2.name = "Amit";
//         s2.clg = "gnc";

//         s1.display();
//         s2.display();
//     }
// }
//////////////////////////////////////////
// class Student {
//     int id;
//     String name;

//     void display() {
//         System.out.println("ID: " + id);
//         System.out.println("Name: " + name);
//     }
// }

// public class Main {
//     public static void main(String[] args) {

//         // Creating object
//         Student s1 = new Student();
//         Student s2 = new Student();

//         // Assigning values
//         s1.id = 101;
//         s1.name = "Mohit";
//         s2.id = 102;
//         s2.name = "Rohit";

//         // Calling method
//         s1.display();
//         s2.display();
//     }
// }

// class vehicle{
//     int model;
//     String name;
//     int buying_year;
//     String greet;
//     void display() {
//         System.out.println("Model: " + model);
//         System.out.println("Name: " + name);
//         System.out.println("Buying Year: " + buying_year);
//         System.out.println("Greet: " + greet);
//         System.out.println();
//     }
// }
// public class Main{
//     public static void main(String[] args) {
//         vehicle  a = new vehicle();
//         vehicle a1 = new vehicle();

//         a.model = 2023;
//         a.name = "jaguar";
//         a.buying_year = 3434;
//         a.greet = "Badhayhn";

//         a1.model = 2023;
//         a1.name = "jaguar";
//         a1.buying_year = 3434;
//         a1.greet = "Badhayhn";

//         a.display();
//         a1.display();
//     }
// }
////////////////////////////////////
class liberay {
    String name;
    String author;
    int price;

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Author : " + author);
        System.out.println("Price : " + price);
    }
}

public class book {
    public static void main(String[] args) {

        liberay s1 = new liberay();

        s1.name = "Kalidas";
        s1.author = "Ramchand";
        s1.price = 230;

        s1.display();
    }
}
        