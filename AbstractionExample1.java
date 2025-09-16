package tutorial7;

abstract class Animal {
    abstract void makeSound();
    abstract void eat();
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks: Woof Woof");
    }
    void eat() {
        System.out.println("Dog eats bones");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat meows: Meow Meow");
    }
    void eat() {
        System.out.println("Cat eats fish");
    }
}

class Bird extends Animal {
    void makeSound() {
        System.out.println("Bird chirps: Chirp Chirp");
    }
    void eat() {
        System.out.println("Bird eats seeds");
    }
}

public class AbstractionExample1 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal bird = new Bird();

        dog.makeSound();
        dog.eat();

        cat.makeSound();
        cat.eat();

        bird.makeSound();
        bird.eat();
    }
}