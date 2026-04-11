abstract class Animal {
    public abstract void makeSound();

    public void sleep() {
        System.out.println("Zzz...");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Bird extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Tweet!");
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();

        dog.makeSound();
        dog.sleep();

        bird.makeSound();
        bird.sleep();
    }
}
/*
Observation:-

*/