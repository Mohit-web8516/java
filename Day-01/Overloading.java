class Calculator {

    // Method 1
    int add(int a, int b) {
        return a + b;
    }

    // Method 2 (different parameters)
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3 (different type)
    double add(double a, double b) {
        return a + b;
    }
}

public class Overloading {
    public static void main(String[] args) {
        Calculator obj = new Calculator();

        System.out.println(obj.add(2, 3));        
        System.out.println(obj.add(2, 3, 4));     
        System.out.println(obj.add(2.5, 3.5));   
    }
}