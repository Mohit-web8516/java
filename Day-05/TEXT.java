//REVISION OF object oriented programming concepts
//1. class and object   
//2. constructor
//3. method overloading
//4. inheritance
//5. method overriding
//6. super keyword
//7. this keyword
//8. abstraction
//9. encapsulation  
//10. polymorphism
//11. interface
//12. package
//13. exception handling
//14. file handling
//15. multithreading
//16. collection framework
//17. JDBC
//18. Java 8 features (lambda expressions, streams, etc.)
//19.Wrapper classes
//20. Generics

//explain each concept with examples and code snippets.

//class and object
// class Car {
//     String brand;
//     String model;
//     int year;

//     void displayInfo() {
//         System.out.println("Brand: " + brand);
//         System.out.println("Model: " + model);
//         System.out.println("Year: " + year);
//     }
// }

// public class Main {
//     public static void main(String[] args) {  
//         Car car1 = new Car();
//         car1.brand = "Toyota";
//         car1.model = "Camry";
//         car1.year = 2020;
//         car1.displayInfo();
//     }
// }

////////////////////////////////////////////////////
//constructor WITH THEORY AND CODE EXAMPLE
//A constructor is a special method that is called when an object is instantiated. It is used
//to initialize the object's state. A constructor has the same name as the class and does not have a return type.
//Example:

// class Car {
//     String brand;
//     String model;



//     // Constructor
//     Car(String brand, String model) {
//         this.brand = brand;
//         this.model = model;
//     }
/////////////////////////////////////////////////
//Method overloading
//Method overloading is a feature in Java that allows a class to have more than one method  
//with the same name, but different parameters. The compiler determines which method to call based on the number and type of arguments passed.
//Example:
// class Calculator {
//     int add(int a, int b) {
//         return a + b;
//     }

//     double add(double a, double b) {
//         return a + b;
//     }
// }
// public class Main {
//     public static void main(String[] args) {

//         Calculator calc = new Calculator();  
//         System.out.println(calc.add(5, 10)); // Calls the int version
//         System.out.println(calc.add(5.5, 10.5)); // Calls the double version
//     }
// }
//Inheritance
//Inheritance is a fundamental object-oriented programming concept that allows a new class (called a subclass or
//child class) to inherit properties and behaviors (fields and methods) from an existing class (called a superclass or parent class). This promotes code reusability and establishes a natural hierarchical relationship between classes.
//Example:
// class Animal {
//     void eat() {
//         System.out.println("This animal eats food.");
//     }
// }

// class Dog extends Animal {
//     void bark() {
//         System.out.println("This dog barks.");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Dog dog = new Dog();
//         dog.eat(); // Inherited method from Animal
//         dog.bark(); // Dog's own method
//     }
// }
//Method overriding
//Method overriding occurs when a subclass provides a specific implementation of a method that is already defined in
//its superclass. The method in the subclass must have the same name, return type, and parameters as the method in the superclass. This allows the subclass to provide a specific behavior for that method.
//Example:
// class Animal {
//     void sound() {
//         System.out.println("This animal makes a sound.");
//     }
// }

// class Dog extends Animal {
//     @Override
//     void sound() {
//         System.out.println("This dog barks.");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Dog dog = new Dog();
//         dog.sound(); // Calls the overridden method in Dog
//     }
// }
//super keyword
//The super keyword in Java is used to refer to the immediate parent class of the current class. It can be used to access superclass methods, constructors, and fields. This is particularly useful when you want to call a method or constructor from the superclass that has been overridden in the subclass.
//Example:
// class Animal {
//     void eat() {
//         System.out.println("This animal eats food.");
//     }
// }
// class Dog extends Animal {
//     void eat() {
//         super.eat(); // Calls the eat method from Animal
//         System.out.println("This dog also eats bones.");
//     }
// }

// public class Main {
//     public static void main(String[] args) {

//         Dog dog = new Dog();
//         dog.eat(); // Calls the eat method in Dog, which also calls the eat method in Animal
//     }    
// }
//this keyword
//The this keyword in Java is a reference variable that refers to the current object. It is used to differentiate between instance variables and parameters when they have the same name, and it can also be used to call other constructors in the same class.
//Example:
