
//just to show that variable cannot be passed with final and it also cannot be overriden.

class Animal {
    final void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal{
    
        void makeSound() {
        System.out.println("Dog barks.");
    }
}

public class Lab6_7 {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound();
    }
}