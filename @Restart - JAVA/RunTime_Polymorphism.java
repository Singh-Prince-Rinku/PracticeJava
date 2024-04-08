// Abstract class Animal serves as a base class for all specific animal types.
abstract class Animal {
    // Abstract method speak that must be implemented by subclasses.
    abstract void speak();
}

// Dog class extends Animal and provides its own implementation of the speak method.
class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("The dog barks");
    }
}

// Cat class extends Animal and provides its own implementation of the speak method.
class Cat extends Animal {
    @Override
    void speak() {
        System.out.println("The cat meows");
    }
}

// Main class to demonstrate runtime polymorphism in Java.
public class RunTime_Polymorphism {
    public static void main(String[] args) {
        // Declare a reference of type Animal.
        Animal myAnimal;

        // At runtime, myAnimal is referenced to a Dog object.
        // This is determined by the object type, not the reference type (Animal).
        myAnimal = new Dog();
        myAnimal.speak(); // Executes Dog's speak method: The dog barks

        // At runtime, myAnimal is now referenced to a Cat object.
        myAnimal = new Cat();
        myAnimal.speak(); // Executes Cat's speak method: The cat meows
        
        // This demonstrates runtime polymorphism where the method that gets
        // executed depends on the type of object, and not the type of reference.
    }
}
