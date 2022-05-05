package Modifiers;

/*
    Access Modifier: Defines access type of the methods or variable or class(can be only default or public) i.e. from where it can be accessed in your application.
        In Java, there 4 type of the access specifiers.
            public: accessible in all class in your application.
            protected: accessible within the package in which it is defined and in its subclass(es)(including subclasses declared outside the package)
            private: accessible only within the class in which it is defined.
            default (declared/defined without using any modifier): accessible within same class and package within which its class is defined.

*/
class AccessModifiers{
    private String firstName = "Richie";
    public String lastName = "Rich";
    protected String middleInitial = "R";
    int age = 32;
}

public class Main extends AccessModifiers {
    public static void main(String[] args){
        AccessModifiers access = new AccessModifiers();

        String lName = access.lastName;     // Will Work
        int Age = access.age;           // Will work
        String mInitial = access.middleInitial; // Will Work

//        String fName = access.firstName;    // Will Cause Error as firstName is private in AccessModifiers class


        System.out.println(lName);
        System.out.println(Age);
        System.out.println(mInitial);
//        System.out.println(fName);
    }
}
