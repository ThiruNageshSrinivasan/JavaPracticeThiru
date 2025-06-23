// Package declaration - this class belongs to the 'collections' package
package collections;

// Import necessary Java utility classes
import java.util.ArrayList;
import java.util.List;

/*
 * This program demonstrates:
 * 1. How to add elements to an ArrayList.
 * 2. How to convert that ArrayList into an array using toArray().
 * 3. How to iterate through the array and print each element.
 */
public class ArrayListToArray {

    // Main method - entry point of the program
    public static void main(String[] args) {

        /*
         * Create an ArrayList to store Integer elements.
         * We use the List interface as the reference type for flexibility.
         */
        List<Integer> li = new ArrayList<Integer>();

        // Adding three Integer values to the list
        li.add(10);  // Add 10
        li.add(20);  // Add 20
        li.add(30);  // Add 30

        /*
         * Convert the ArrayList to an Object array.
         * Since toArray() returns Object[], the array can hold any object.
         */
        Object arr[] = li.toArray();

        /*
         * Loop through each element in the array using a for-each loop.
         * Because it's an Object array, each item is treated as an Object.
         */
        for (Object x : arr) {
            System.out.println(x);  // Prints each element: 10, 20, 30
        }
    }
}
