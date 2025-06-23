// Package declaration - this class belongs to the 'collections' package
package collections;

// Importing Vector class from java.util package
import java.util.Vector;

// Class definition
public class vectorEx {

    // Main method - entry point of the program
    public static void main(String[] args) {

        /*
         * Create a new Vector to store Integer elements.
         * Vector is similar to ArrayList but is synchronized (thread-safe).
         * That means multiple threads can safely access it without extra code.
         */
        Vector<Integer> v = new Vector<Integer>();

        /*
         * Add elements to the vector using the add() method.
         * Vector allows duplicate values and maintains insertion order.
         */
        v.add(1);  // Add value 1
        v.add(1);  // Add duplicate 1
        v.add(2);  // Add value 2
        v.add(3);  // Add value 3
        v.add(4);  // Add value 4

        /*
         * Enhanced for loop (for-each) to iterate through the vector
         * and print each element one by one.
         */
        for (Integer x : v) {
            System.out.println(x);  // Output: 1 1 2 3 4 (each on a new line)
        }
    }
}
