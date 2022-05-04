package Abstraction;

/*
*   `Data Abstraction` is the process of `hiding` certain details and showing only the essential information to the user

*   Abstraction can be achieved with either `abstract classes` or `abstract interfaces`.

*   To declare a `class` or `method` or `interface` abstract, we use non-access modifier keyword `abstract`.

*   Abstract class: An abstract class can be defined as a class declared with the keyword “abstract”
                    and has a restriction that it cannot be instantiated.
                    (to access it, it must be inherited from another class)

*   Abstract method: Abstract method can only be used in an `abstract class`, and it does not have a body.
                     The body is provided by the subclass which inherits from this abstract class.
                     An abstract method is a method preceded by an ‘abstract’ keyword without any implementation.
                     An abstract method is declared inside an abstract class.
                     An abstract method is the one that makes a class incomplete as it doesn’t have an implementation.
                     Hence when we include an abstract method in the class, naturally the class becomes incomplete.


*       An abstract class can have both abstract and regular methods:

               abstract class Animal {
                  public abstract void animalSound();       // abstract method with no body
                  public void sleep() {                     // Regular method
                    System.out.println("Zzz");
                  }
               }

*       From the example above, it is not possible to create an object of the Animal class:

                Animal myObj = new Animal(); // will generate an error

*       To access the abstract class, it must be inherited from another class.

*       AN EXAMPLE:
          If a person is driving a car,
          what he/she will be interested in is just to start and stop the vehicle or accelerate or brake the vehicle.
          He/she will not be interested in knowing how the vehicle starts or stop.
          We are only interested in the abstract working of the functions and not in their details.

        NOTES:
        * In abstraction, we deal with ideas and not the events.
        * This means that we hide the implementation details from the user
        * and expose only the functionality to the end-user.
        * Thereby the user will only know “what it does” rather than “how it does”.
        * `Final`, `private`, `static` keywords cannot be used with abstract classes or methods or interfaces.
*/



abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void animalSound();

    // Regular method
    public void sleep() {
        System.out.println("Zzz");
    }
}
