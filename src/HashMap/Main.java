package HashMap;

/*
     An ArrayList stores items in an ordered collection, which can be accessed using index.
     A Hashmap in java stores items in "key/value" pairs, and we can access them by using the key that we have provided.
     One object is used as a key (index) to another object (value).

     A Hashmap can store different type: `String` as key and `Integer` as values or of same type like `Integer`, `Integer`.

     Methods on ArrayList are:

                put()               -       To add an element in Hashmap.
                remove(index)       -       To remove an element in Hashmap using index.
                get(index)          -       To access an element in the Hashmap using index.
                set(index, value)   -       To set an element at a particular place in Hashmap. // Update with replace instead of set
                size()              -       To find out how many elements a Hashmap has.
                clear()             -       To remove all the elements in the Hashmap
                containsKey(index)  -       To check if map contains key
*/

// Import the HashMap class
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        System.out.println(capitalCities);

        // GET ITEM
        System.out.println("Capital of England: " + capitalCities.get("England"));

        // GET SIZE
        System.out.println("Size of CapitalCities: " + capitalCities.size());

        // PUT ITEM
        System.out.println("Adding a new Item");
        capitalCities.put("India", "New Delhi");
        System.out.println("Capital Cities after adding a new item: "+capitalCities);

        // PRINT KEYS

        // Note: Use the keySet() method if you only want the keys, and use the values() method if you only want the values
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }

        //PRINT VALUES
        for (String i : capitalCities.values()) {
            System.out.println(i);
        }

        // Print keys and values
        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " value: " + capitalCities.get(i));
        }

        //REMOVE ITEM
        capitalCities.remove("England");
        System.out.println("Capital Cities after removing England: "+capitalCities);

        //CHANGE VALUE
        capitalCities.replace("USA", "DC");
        System.out.println("Capital Cities: "+capitalCities);

        //CHANGE VALUE for some specific value
        capitalCities.replace("USA", "DC", "Washington DC");
        System.out.println("Capital Cities after changing value: "+capitalCities);

        // CONTAINS KEY
        System.out.println("ContainsKey: " +capitalCities.containsKey("England"));

        // CONTAINS VALUE
        System.out.println("ContainsKey: " +capitalCities.containsValue("DC"));

        // CLEAR HASHMAP
        capitalCities.clear();
        System.out.println("Capital Cities: "+capitalCities);
    }
}
