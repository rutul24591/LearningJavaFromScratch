package Abstraction;

/*
*   `Data Abstraction` is the process of `hiding` certain details and showing only the essential information to the user
*
*   Abstraction can be achieved with either `abstract classes` or `abstract interfaces`.
*
*   To declare a `class` or `method` or `interface` abstract, we use non-access modifier keyword `abstract`.
*
    *   Abstract class: Abstract class is a restricted class that `cannot` be used to create objects
    *                   (to access it, it must be inherited from another class).
    *
    *   Abstract method: Abstract method can only be used in an `abstract class`, and it does not have a body.
    *                    The body is provided by the subclass which inherits from this abstract class.
*
*
*   An abstract class can have both abstract and regular methods:
*
*       abstract class Animal {
          public abstract void animalSound();       // abstract method with no body
          public void sleep() {                     // Regular method
            System.out.println("Zzz");
          }
        }

        From the example above, it is not possible to create an object of the Animal class:
            Animal myObj = new Animal(); // will generate an error

        To access the abstract class, it must be inherited from another class.

        Why And When To Use Abstract Classes and Methods?

            To achieve security - hide certain details and only show the important details of an object.
* */
abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void animalSound();

    // Regular method
    public void sleep() {
        System.out.println("Zzz");
    }
}
