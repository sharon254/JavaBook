package MapCollections;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    public static void main(String[]args){
        /**
         * Maps:
         * HashMaps: Store unordered collection of key-value pair
         * TreeMap: ordered collection of key-value pair
         * HashMaps:
         * Provides fast look-up
         *HashMap Equality:
         * override equals and hashcode for objects of the class
         *
         */
        Map<String, Double> inventory =new HashMap<>();
         /**Method put accepts a key value pair
         a function processes your key and returns an integer called an Hash,
         Then a bitwise operation on the hash determines the index where the key value is stored
        */
         inventory.put("Bananas", 2.99);
        inventory.put("Papaya", 5.99);
        inventory.put("Kale", 4.99);
        inventory.put("Apples", 1.99);
        inventory.put("Carrot", 1.49);

         inventory.put("Lime", 0.49);
         inventory.put("Toothpaste", 5.99);
         inventory.put("Zucchini", 5.99);

        // System.out.println("\nWelcome to Java Grocers. What can we help you find?:\n");

        // System.out.println("\nWhat is the price of Lime?");
        // System.out.println(inventory.get("Lime"));

        // System.out.println("\nWhat is the price of Zucchini?");
        // System.out.println(inventory.get("Zucchini"));

        // System.out.println("\nWhat is the price of Kale?");
        // System.out.println(inventory.get("Kale"));


        // System.out.println("\nDo you guys sell Apples?");
        // boolean result = inventory.containsKey("Apples");
        // String response = result ? "Yes!" : "No, sorry!";
        // System.out.println(response);
        /**
         * Final and constants
         * Constant is static because it belongs to a class
         * Constant is final as it cannot be assigned a new value
         * Constant is declared with UPPERCASE_ AND UNDERSCORES
         */

    }





}
