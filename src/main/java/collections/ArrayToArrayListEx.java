// Package declaration - this class is part of the 'collections' package
package collections;

// Importing required classes from java.util package
import java.util.ArrayList; // For dynamic list (ArrayList)
import java.util.Arrays;    // For converting array to list
import java.util.List;      // List interface used for type reference

/*
 * This class demonstrates how to convert an array of Integer objects
 * into a dynamic ArrayList using Arrays.asList() and ArrayList constructor.
 */
public class ArrayToArrayListEx {

    // Main method - entry point of the program
    public static void main(String[] args) {

        /*
         * Declare and initialize an array of Integer (not int, because
         * collections work with objects, not primitives).
         * Array contains 8 elements: 0 to 6 (with a duplicate 5).
         */
        Integer a[] = {0, 1, 2, 3, 4, 5, 5, 6};

        /*
         * Convert the array into a List using Arrays.asList(a)
         * This gives a fixed-size list backed by the array.
         * Then pass that list into the ArrayList constructor to
         * create a new, resizable ArrayList named 'li'.
         */
        List<Integer> li = new ArrayList<Integer>(Arrays.asList(a));

        /*
         * Print the ArrayList.
         * Output will be in the format: [0, 1, 2, 3, 4, 5, 5, 6]
         */
        System.out.println(li);
    }
}
