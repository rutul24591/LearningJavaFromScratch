package HashSet;

/*
    A HashSet is a collection of items where `every item is unique`, and it is found in the java.util package.

    HashSet class extends the `AbstractSet` and Implements the `Set` interface.

    HashSet class offers constant time performance for the basic operations (add, remove, contains and size),
    A HashSet in java does not allow duplicates.

    A Hashset can contain one and only one `null` value.

    Hashset is non-synchronized which makes it thread unsafe.(If multiple threads access a hash set concurrently,
    and at least one of the threads modifies the set, it must be synchronized externally)

    Hashset stores data as objects.

    EXAMPLE TO CREATE:

        import java.util.HashSet; // Import the HashSet class

        HashSet<String> cars = new HashSet<String>();


    METHODS:

        contains(value)     -       Check if hashset contains item
        clear()             -       To clear all items from hashset
        size()              -       To check the size of hashset
        isEmpty()           -       To check if hashset is empty or not
        remove(value)       -       To remove an item from hashset
        clone               -       To clone a hashset(Shallow copy, which doesn't clone the elements itself).
*/

// Import the HashSet class
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");

        //Note: Even though BMW is added twice it only appears once in the set because every item in a set has to be unique.
        System.out.println(cars);

        // CONTAINS ITEM
        System.out.println(cars.contains("Mazda"));

        // REMOVE ITEM
        cars.remove("Volvo");
        System.out.println(cars);

        // CHECK SIZE
        System.out.println("SIZE AFTER REMOVING ELEMENT:" +cars.size());

        // CHECK IF EMPTY
        System.out.println("CHECKING IF HASHSET IS EMPTY OR NOT:" +cars.isEmpty());

        // LOOP
        System.out.println("LOOPING");
        for (String i : cars) {
            System.out.println(i);
        }

        // REMOVE ALL ITEM
        cars.clear();
        System.out.println("CARS:" +cars);
    }
}
