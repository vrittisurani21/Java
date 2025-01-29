class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        super.makeSound(); 
        System.out.println("Dog barks");
    }
}

public class Lab6_6 {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound();
    }
}