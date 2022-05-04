package Inheritance;
/*
*  In Java, inheritance is the way by which a class(subclass) can access properties and attributes from another class(superclass)

        subclass (child) - the class that inherits from another class
        superclass (parent) - the class being inherited from

* To inherit from a class, use the extends keyword.

In the example below, the Car class (subclass) inherits the attributes and methods from the Vehicle class (superclass):
*/
public class Vehicle {
    // We set the brand attribute in Vehicle to a protected access modifier.
    // If it was set to private, the Car class would not be able to access it.
    protected String brand = "Ford";
    public void honk() {                    // Vehicle method
        System.out.println("Beep, beep!");
    }
}


