package Interfaces;

/*
    Interfaces are yet another way to achieve abstraction in Java
    An interface is a completely "abstract class" that is used to group related methods with empty bodies.

    EXAMPLE:

            interface Animal {
                public void animalSound(); // interface method (does not have a body)
                public void run(); // interface method (does not have a body)
            }

            class Pig implements Animal {
                public void animalSound(){
                    System.out.println("This pig says weeeeeee");
                }
            }

    To access the interface methods, the interface must be `implemented`(like inherited) by another class, which can be
    done using the `implements` keyword(instead of extends). These classes that `implements` the interface provides the body
    of the methods defined in the interface(Method animalSound() is implemented in class `Pig` which implements `Animal` interface).

    To make a class implement multiple interfaces, just separate the interfaces using a comma like:

            class DemoClass implements FirstInterface, SecondInterface{

            }


    NOTES:
        Like abstract classes, interfaces cannot be used to create objects
        (in the example above, it is not possible to create an "Animal" object in the MyMainClass).

        Interface methods do not have a body - the body is provided by the "implement" class

        On implementation of an interface, `you must override all of its methods`

        Interface methods are by default `abstract` and `public`.

        Interface attributes are by default public, static and final

        An interface cannot contain a constructor.

        IMPORTANT:
        Java does not support "multiple inheritance" (a class can only inherit from one superclass).
        However, it can be achieved with interfaces, because the class can implement multiple interfaces.
        Note: To implement multiple interfaces, separate them with a comma

*/
// Interface
interface Animal {
    //Removed public from methods below, as its throwing redundancy warnings.

    void animalSound(); // interface method (does not have a body)
    void sleep(); // interface method (does not have a body)
}

// Pig "implements" the Animal interface
class Pig implements Animal {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
    public void sleep() {
        // The body of sleep() is provided here
        System.out.println("Zzz");
    }
}

public class Main {
    public static void main(String[] args) {
        Pig myPig = new Pig();  // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
    }
}
