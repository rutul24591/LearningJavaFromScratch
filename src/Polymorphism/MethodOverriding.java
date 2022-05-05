package Polymorphism;

/*
    Method Overriding is done when a child or a subclass has a method with the same name, parameters, and
    return type as the parent or the superclass;
    then that function overrides the function in the superclass.
    In simpler terms, if the subclass provides its definition to a method already present in the superclass;
    then that function in the base class is said to be overridden.

    NOTE: Also, it should be noted that runtime polymorphism can only be achieved through functions and not data members.

    Overriding is done by using a reference variable of the superclass.
    The method to be called is determined based on the object which is being referred to by the reference variable.
    This is also known as `Upcasting`.
*/

class Vehicle{
    //defining a method
    void run(){System.out.println("Vehicle is moving");}
}
//Creating a child class
class Car2 extends Vehicle{
    //defining the same method as in the parent class
    void run(){System.out.println("car is running safely");}

    public static void main(String args[]){
        Car2 obj = new Car2();//creating object
        obj.run();//calling method
    }
}
