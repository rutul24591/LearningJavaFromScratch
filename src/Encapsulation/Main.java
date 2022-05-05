package Encapsulation;

/*
    Encapsulation is the process of hiding `sensitive` data or information hidden from the users.

    Encapsulation can be achieved using
        Declare class variables/attributes as private
        Provide public get and set methods to access and update the value of a private variable


    It is possible to access them if we provide public get and set methods.

    The get method returns the variable value, and the set method sets the value.

    Advantages:

    Better control of class attributes and methods
    Class attributes can be made read-only (if you only use the get method), or write-only (if you only use the set method)
    Flexible: the programmer can change one part of the code without affecting other parts
    Increased security of data

*/
    public class Main{
        public static void main(String[] args) {
            Person myObj = new Person();
            //myObj.name = "John";  // error
            //System.out.println(myObj.name); // error

            myObj.setName("John"); // Set the value of the name variable to "John"
            System.out.println(myObj.getName());
        }
    }

