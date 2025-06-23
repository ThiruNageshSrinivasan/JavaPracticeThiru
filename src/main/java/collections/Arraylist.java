// Package declaration - groups related classes
package collections;

// Import statements to use built-in Java classes
import java.util.ArrayList;  // For dynamic array
import java.util.Iterator;  // For iterating collections
import java.util.List;      // For using List interface (not used directly here)

// Main class named Arraylist (note: class names should ideally be capitalized like 'ArrayListDemo')
public class Arraylist {

    // Main method - the entry point of the Java program
    public static void main(String[] args) {

        /*
         * Create an ArrayList that can store Integer objects.
         * We use Integer (not int) because Java collections work only with objects.
         * This is called a generic declaration: ArrayList<Integer>.
         */
        ArrayList<Integer> li = new ArrayList<Integer>();

        /*
         * Add integers to the ArrayList.
         * Java automatically converts int to Integer (autoboxing).
         */
        li.add(0); // Add 0
        li.add(1); // Add 1
        li.add(2); // Add 2
        li.add(3); // Add 3

        // Print the entire ArrayList
        System.out.println(li); // Output: [0, 1, 2, 3]

        /*
         * Enhanced for-loop (for-each loop) to go through each element in the ArrayList.
         * Variable 'x' holds each integer from the list one by one.
         */
        for (int x : li) {

            // Print the current element from the loop
            System.out.println(x);  // Prints 0, then 1, then 2, then 3 (one per line)

            /*
             * For every element 'x' in the list, a new iterator is created.
             * This means in each loop iteration, the iterator starts from the beginning again.
             * Then, while the iterator has more elements, it prints each one.
             * So this inner loop prints the entire list from start every time.
             */
            Iterator itr = li.iterator(); // Create new iterator
            while (itr.hasNext()) {
                System.out.println(itr.next()); // Print current element from iterator
            }
        }
    }
}
