// Package declaration - this class belongs to the 'collections' package
package collections;

// Import the ArrayList class from java.util package
import java.util.ArrayList;

/*
 * Class declaration - this is the main class of your program.
 * It demonstrates storing different types of objects in a single ArrayList
 * by using Object as the generic type.
 */
public class ArrayListObjectEx {

    // The main method - entry point of the Java application
    public static void main(String[] args) {

        /*
         * Create an ArrayList that can hold elements of type Object.
         * Since all Java classes inherit from Object, you can store
         * different types (Integer, String, Double, etc.) in the same list.
         */
        ArrayList<Object> li = new ArrayList<Object>();

        // Adding different types of elements to the list
        li.add(1);         // Autoboxed int → Integer → Object
        li.add("thiru");   // String is a subclass of Object
        li.add(4455.55);   // Autoboxed double → Double → Object

        // Optional: could print the whole list directly
        // System.out.println(li);

        /*
         * Enhanced for-loop to iterate over the elements of the ArrayList.
         * Since the list holds Object references, the loop variable is of type Object.
         */
        for (Object x : li) {
            System.out.println(x);  // Prints each element on a new line
        }
    }
}
