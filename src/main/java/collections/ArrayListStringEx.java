// Package declaration - this class is part of the 'collections' package
package collections;

// Importing the ArrayList class from the java.util package
import java.util.ArrayList;

// Class declaration - defines a class named ArrayListStringEx
public class ArrayListStringEx {

    // Main method - this is the entry point of any Java program
    public static void main(String[] args) {

        /*
         * Create an ArrayList that stores String elements.
         * The generic type <String> ensures only strings can be added to this list.
         */
        ArrayList<String> li = new ArrayList<String>();

        // Add strings to the list using the add() method
        li.add("thiru");   // Add "thiru" at index 0
        li.add("susmi");   // Add "susmi" at index 1
        li.add("kanivu");  // Add "kanivu" at index 2

        // Print the list to the console
        // Output: [thiru, susmi, kanivu]
        System.out.println(li);

        /*
         * Modify the element at index 2 using the set() method
         * This replaces "kanivu" with "poovi"
         */
        li.set(2, "poovi");

        // Print the updated list
        // Output: [thiru, susmi, poovi]
        System.out.println(li);

        /*
         * Enhanced for-loop to iterate through the list
         * Each element is assigned to variable 'x' and printed
         */
        for (String x : li) {
            System.out.println(x);  // Prints each element one by one
        }

        /*
         * Access and print the first element (index 0) using the get() method
         */
        System.out.println(li.get(0));  // Output: thiru

        /*
         * Check if the list contains the element "poovi"
         * The contains() method returns true if found, false otherwise
         */
        boolean flag = li.contains("poovi");
        System.out.println(flag);  // Output: true

        /*
         * Remove the element at index 0 using remove()
         * This removes "thiru" from the list
         */
        li.remove(0);

        // Print the list after removal
        // Output: [susmi, poovi]
        System.out.println(li);

        /*
         * Clear the entire list using clear()
         * All elements will be removed
         */
        li.clear();

        // Print the list after clearing
        // Output: []
        System.out.println(li);
    }
}
