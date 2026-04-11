// Abstract class (blueprint)
abstract class Shape {
    // Abstract method (no body)
    abstract void draw();

    // Normal method
    void display() {
        System.out.println("This is a geometric shape.");
    }
}

// Child class 1
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a Circle...");
    }
}

// Child class 2
class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing a Rectangle...");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        // Parent reference, child object
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        s1.display();
        s1.draw();

        s2.display();
        s2.draw();
    }
}
