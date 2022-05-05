package ArrayList;

/*
    The ArrayList class is a `resizable` array, which can be found in the java.util package.

    The difference between Array and ArrayList in java is that, arrays have a fixed size when we initialize and declare them
    and cannot change the size once declared. While in ArrayList elements can be added and removed whenever we want.

    EXAMPLE

            import java.util.ArrayList;         // import the ArrayList class

            ArrayList<String> cars = new ArrayList<string>(); // Create an ArrayList object

            Methods on ArrayList are:

                add()               -       To add an element in ArrayList.
                remove(index)       -       To remove an element in ArrayList using index.
                get(index)          -       To access an element in the ArrayList using index.
                set(index, value)   -       To set an element at a particular place in ArrayList.
                size()              -       To find out how many elements an ArrayList have.
                clear()             -       To remove all the elements in the ArrayList.
*/

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<>();         // Should be new ArrayList<String>(), but ide is complaining Explicit type argument String can be replaced with <>
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Tesla");
        cars.add("Suzuki");
        cars.add("Tata");
        cars.add("Audi");
        cars.add("MG");

        // System.out.println(cars);

        Collections.sort(cars);  // Sort cars

        System.out.println("----------------Cars after sorting using Collections----------------");
        System.out.println(cars);

        /* Loop through ArrayList using for */
        System.out.println("----------------Looping using For----------------");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        /* Loop through ArrayList using for each */
        System.out.println("------------Looping using For each---------------");
        for (String i : cars) {
            System.out.println(i);
        }

        /* Printing the size of cars ArraysList */
        System.out.println("Size of Cars: " +cars.size());

        /* Fetch a particular element from arraylist */
        System.out.println("Element at Index 2 in cars: " +cars.get(2));

        /* Remove index 3 from cars */
        System.out.println("Removing index 3 from cars:" +cars.remove(3));

        /* Change the value of index 6 from `Tata` to `Jaguar`(Might be Tesla after sorting and removing one element) */
        System.out.println("Changing the value at index 6: " + cars.set(6, "Jaguar"));

        /* Clear all the elements from cars*/
        cars.clear();
        System.out.println("Clearing all of cars:" +cars);
    }
}
