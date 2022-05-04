package Enums;

/*
*   An enum is a special "class" that represents a `group of constants` (unchangeable variables, like final variables).
*
*   To create an enum, use the `enum` keyword, and separate the constants with a comma.
*
*   Note that they(constants) should be in uppercase letters.
*
*   DECLARATION:-
*
*           enum Level {
                  LOW,
                  MEDIUM,
                  HIGH
            }

    ACCESS:-
            Level myVar = Level.MEDIUM;

    The enum constants are public, static and final.
 * */
public class Enums {
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {
        Level myEnum = Level.MEDIUM;
        System.out.print("PRINTING MY ENUM: ");

        System.out.println(myEnum);     //MEDIUM

        // Using ENUM inside switch case:
        System.out.print("RESULTS FROM SWITCH CASE: ");

        switch (myEnum) {
            case LOW -> System.out.println("Low level");
            case MEDIUM -> System.out.println("Medium level");
            case HIGH -> System.out.println("High level");
            default -> throw new IllegalStateException("Unexpected value: " + myEnum);
        }

        /*
        * The enum type has a values() method, which returns an array of all enum constants.
        * This method is useful when you want to loop through the constants of an enum
        * */

        System.out.println("LISTING ALL ENUMS: ");
        for (Level myEnums : Level.values()){
            System.out.println(myEnums);
        }
    }
}
