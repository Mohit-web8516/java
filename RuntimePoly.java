class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
public class RuntimePoly {
    public static void main(String[] args) {
        Animal a = new Dog(); // reference of parent, object of child
        a.sound(); // calls Dog’s overridden method
    }
}
