package Polymorphism;

/*
    `Polymorphism` means "many forms". `Inheritance` lets us inherit attributes and methods from another class.
    Polymorphism uses those methods to perform different tasks.
    This allows us to perform a single action(method) in different ways(different functionality).

    You can perform Polymorphism in Java via two different methods:

        Method Overloading

            Method overloading is the process that can create multiple methods of the same name in the same class,
            and all the methods work in different ways.
            Method overloading occurs when there is more than one method of the same name in the class.

        Method Overriding

            Method overriding is the process when the subclass or a child class has the same method as declared in the
            parent class.

    For example, think of a superclass called Animal that has a method called animalSound().
    Subclasses of Animals could be Pigs, Cats, Dogs, Birds -
    And they also have their own implementation of an animal sound (the pig oinks, and the cat meows, etc.):

    Two Types of polymorphism in Java:
        1. Compile time polymorphism
        2. Run time polymorphism


    // Refer to: https://www.mygreatlearning.com/blog/polymorphism-in-java/
*/

class Animal {
    public void animalSound(){
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: bow bow");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Create a Animal object
        Animal myPig = new Pig();  // Create a Pig object
        Animal myDog = new Dog();  // Create a Dog object
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}
