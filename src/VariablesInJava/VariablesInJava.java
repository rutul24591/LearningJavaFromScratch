package VariablesInJava;

public class VariablesInJava {
    /*
     List of all primitives in Java.
     `byte` (number, 1 byte)
     `short` (number, 2 bytes)
     `int` (number, 4 bytes)
     `long` (number, 8 bytes)
     `float` (float number, 4 bytes)
     `double` (float number, 8 bytes)
     `char` (a character, 2 bytes)
     `boolean` (true or false, 1 byte)
    */

    // Java is a strong typed language, which means variables need to be defined before we use them.

    /*
    * NUMBERS
    To declare and assign a number use the following syntax:

        int myNumber;
        myNumber = 5;

        Or you can combine them:
        int myNumber = 5;

    To define a double floating point number, use the following syntax:

        double d = 4.5;
        d = 3.0;

    If you want to use float, you will have to cast:

        float f = (float) 4.5;

    Or, You can use this:

        float f = 4.5f; // (f is a shorter way of casting float)

    * CHARACTERS and STRINGS

    In Java, a character is it's own type and it's not simply a number,
    so it's not common to put an ascii value in it, there is a special syntax for chars:

        char c = 'g';

    String is not a primitive. It's a real type, but Java has special treatment for String.

    Here are some ways to use a string:

    Create a string with a constructor
        String s1 = new String("Who let the dogs out?");        // String object stored in heap memory

    Just using "" creates a string, so no need to write it the previous way.
        String s2 = "Who who who who!";                         // String literal stored in String pool

    Java defined the operator + on strings to concatenate:
        String s3 = s1 + s2;

    There is no operator overloading in Java but there is the exception that proves the rule -
    * string is the only class where operator overloading is supported.
    * We can concat two strings using + operator. The operator + is only defined for strings, you will never see it with other objects, only primitives.

    You can also concat string to primitives:

    int num = 5;
    String s = "I have " + num + " cookies"; //Be sure not to use "" with primitives.

    * BOOLEAN

        Every comparison operator in java will return the type boolean. Unlike other languages, it only accepts two special values: true or false.

        boolean b = false;
        b = true;

        boolean toBe = false;
        b = toBe || !toBe;
        if (b) {
            System.out.println(toBe);
        }

        int children = 0;
        b = children; // Will not work
        if (children) { // Will not work
            // Will not work
        }

        int a;
        boolean b = true;
        boolean c = false;
        a = b + c;            //The following line will give an error
        System.out.println(a);
    */


    /*
     * Exercise
     * Create all the primitives (except long and double) with different values.
     * Concatenate them into a string and print it to the screen,
     * so it will print: H3110 w0r1d 2.0 true
     */
    public static void main(String[] args){
        int three = 3;
        short L = 1;
        byte zero = 0;
        char space = ' ';
        float f = 2.0f;
        boolean truth = true;
        String output = "H" + three + L + L + zero + space + "w" + zero + "r" + L + "d" + space + f + space + truth;
        System.out.println("OUTPUT:" +output);
    }
}

