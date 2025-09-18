abstract class Animal {
    abstract void makeSound();
}

class Mammal extends Animal {
    void makeSound() {
        System.out.println("Mammal sound: Growl");
    }
}

class Bird extends Animal {
    void makeSound() {
        System.out.println("Bird sound: Chirp");
    }
}

class Fish extends Animal {
    void makeSound() {
        System.out.println("Fish sound: Blub");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Mammal();
        animals[1] = new Bird();
        animals[2] = new Fish();

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}